--Procedimiento para insertar una tarjeta
delimiter $$
create procedure InsertarTarjeta(
	in num_tarjeta varchar(25),
    in num_cuenta varchar(20),
    in cvv int,
    in pin int,
    in fecha_creacion varchar(7),
    in fecha_exp varchar(7)
)
begin 
	insert into tarjeta (numeroTarjeta, numero_cuenta, CCV, pin, fechaCreacion, fechaVencimiento) 
    values (num_tarjeta, num_cuenta, cvv, pin, fecha_creacion, fecha_exp);
end$$
delimiter ;


--Procedimiento para buscar tarjetas
delimiter $$
create procedure BuscarTarjetas(
	in num_cuenta varchar(20),
    in num_tarjeta varchar(25)
)
begin 
	select numeroTarjeta, numero_cuenta, fechaCreacion, fechaVencimiento
    from tarjeta
    where (num_cuenta is null or numero_cuenta = num_cuenta)
    and (num_tarjeta is null or num_tarjeta = numeroTarjeta);
end$$
delimiter ;

--Procedimiento consulta de tarjeta para login cajero
delimiter $$
create procedure LoginCajero(
	in num_tarjeta varchar(25)
)
begin
	select numeroTarjeta, pin from tarjeta
    where numeroTarjeta = num_tarjeta;
end$$
delimiter ;

--Procedimiento para seleccionar una tarjeta
delimiter $$
create procedure SelectTarjeta(
	in num_tarjeta varchar(25)
)
begin 
	select t.numeroTarjeta, c.numero_cuenta, c.tipo_cuenta_id, c.saldo, u.nombre, u.apellido
    from cuenta c, usuario u, tarjeta t
    where c.Usuario_dpi = c.Usuario_dpi 
    and c.numero_cuenta = t.numero_cuenta
    and t.numeroTarjeta = num_tarjeta;
end$$
delimiter ;