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
