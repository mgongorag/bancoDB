--Procedimiento para ingresar una cuenta
delimiter $$
create procedure InsertarCuenta(
	in num_cuenta varchar(20),
    in saldo double,
    in dpi varchar(20),
    in tipoCuenta int,
    in chequera varchar(45)
)
begin 
	if tipoCuenta = 1 then
		insert into banco.cuenta (numero_cuenta, saldo, Usuario_dpi, tipo_cuenta_id)
		values (num_cuenta, saldo, dpi, tipoCuenta);
    elseif tipoCuenta = 2 then
		insert into banco.cuenta (numero_cuenta, saldo, Usuario_dpi, tipo_cuenta_id, Chequera)
		values (num_cuenta, saldo, dpi, tipoCuenta, chequera);
	end if;
end$$
delimiter ;

--Procedimiento para buscar una cuenta
delimiter $$
create procedure ExisteCuenta(
	in num_cuenta varchar(20)
)
begin
	select * from banco.cuenta where numero_cuenta = num_cuenta;
end$$
delimiter ;

--Procedimiento para deposito en una cuenta
delimiter $$
create procedure Depositar(
	in num_cuenta varchar(20),
    in monto double
)
begin 
	update banco.cuenta set saldo = saldo + monto
    where numero_cuenta = num_cuenta;
end$$
delimiter ;

--Procedimiento para retirar de una cuenta
delimiter $$
create procedure Retirar(
	in num_cuenta varchar(20),
    in monto double
)
begin 
	update banco.cuenta set saldo = saldo - monto
    where numero_cuenta = num_cuenta;
end$$
delimiter ;

--Procedimiento para obtener el saldo
delimiter $$
create procedure ConsultaSaldo(
	in num_cuenta varchar(20)
)
begin 
	select saldo from cuenta where numero_cuenta = num_cuenta;
end$$
delimiter ;

--Procedimiento para consultar numero, tipo y saldo
delimiter $$
create procedure ConsultaCuentas(
	in dpi varchar(20)
)
begin 
	select c.numero_cuenta, t.tipo_Cuenta, c.saldo
    from cuenta c, tipo_cuenta t, usuario u
    where t.id = c.tipo_cuenta_id
    and c.Usuario_dpi = u.dpi
    and u.dpi = dpi;
end$$
delimiter ;

--Procedimiento para consultar tipo y numero de cuenta
delimiter $$
create procedure ConsultaCuentasT(
	in dpi varchar(20)
)
begin 
	select t.tipo_Cuenta, c.numero_cuenta
    from cuenta c, tipo_cuenta t, usuario u
    where t.id = c.tipo_cuenta_id
    and c.Usuario_dpi = u.dpi
    and u.dpi = dpi;
end$$
delimiter ;
