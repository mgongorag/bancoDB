--Procedimiento para insertar una transacción
delimiter $$
create procedure InsertarTransaccion(
	in monto double,
    in fecha datetime,
    in tipo int,
    in cuenta varchar(20),
    in saldo double
)
begin 
	if (tipo = 1) then
		insert into banco.transaccion (deposito, fecha, tipoTrans_id, cuenta, saldo)
        values (monto, fecha, tipo, cuenta, saldo);
	elseif (tipo = 2 or 3 or 4) then
		insert into banco.transaccion (retiro, fecha, tipoTrans_id, cuenta, saldo)
        values (monto, fecha, tipo, cuenta, saldo);
	end if;
end$$
delimiter ;

--Procedimiento para generar un estado de cuenta
delimiter $$
create procedure EstadoCuenta(
	in cuenta varchar(20)
)
begin 
	select id_transaccion, fecha, retiro, deposito, saldo
    from transaccion
	where transaccion.cuenta = cuenta;
end$$
delimiter ;

--Procedimiento para transferencia de fondos
delimiter $$
create procedure TransferenciaFondos(
	in cuenta_debito varchar(20),
    in cuenta_credito varchar(20),
    in monto double,
    in fecha datetime
)

begin
	Set @current_saldo := (Select c.saldo from cuenta c where c.numero_cuenta = cuenta_debito);
	If @current_saldo >= monto then
		start transaction;
			call Retirar(cuenta_debito,monto);
            set @saldo1 := (select c.saldo from cuenta c where c.numero_cuenta = cuenta_debito);
            set @tipo_retiro := 2;
			call InsertarTransaccion(monto,fecha,@tipo_retiro,cuenta_debito, @saldo1);
			call Depositar(cuenta_credito,monto);
            set @saldo2 := (select c.saldo from cuenta c where c.numero_cuenta = cuenta_credito);
            set @tipo_deposito := 1;
			call InsertarTransaccion(monto,fecha,@tipo_deposito,cuenta_credito, @saldo2);
		commit;    
    end if;
end$$
delimiter ;


call TransferenciaFondos('02559648','01525478',100,sysdate());


