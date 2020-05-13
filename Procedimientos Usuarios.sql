--Procedimiento para ingresar un nuevo usuario
delimiter $$
create procedure InsertarUsuario(
	in dpi varchar(20),
    in nombre varchar(45),
    in apellido varchar(45),
    in telefono varchar(20),
    in genero varchar(1)
)
begin
	insert into usuario (dpi, nombre, apellido, telefono, genero)
    values (dpi, nombre, apellido, telefono, genero);
end$$
delimiter ;

--Procedimiento para buscar un usuario
delimiter $$
create procedure ExisteUsuario(
	in dpi varchar(20)
)
begin 
	select * from usuario where usuario.dpi = dpi;
end$$
delimiter ;

--Procedimiento para obtener el total de usuarios
delimiter $$
create procedure TotalUsuarios()
begin 
	select count(*) as num from usuario;
end$$
delimiter ;

--Procedimiento para actualizar los datos de un usuario
delimiter $$
create procedure ActualizarUsuario(
	in nombre varchar(45),
    in apellido varchar(45),
    in telefono varchar(20),
    in genero varchar(1),
    in dpi varchar(20)
)
begin
	update usuario u set u.nombre = nombre, u.apellido = apellido, u.telefono = telefono,
    u.genero = genero where u.dpi = dpi;
end$$
delimiter ;

--Procedimiento para buscar un usuario por medio de su numero de cuenta, dpi o apellido
delimiter $$
create procedure BuscarUsuario(
	in num_cuenta varchar(20),
    in dpi varchar(20),
    in apellido varchar(45)
)
begin 
	select u.dpi, u.nombre, u.apellido, u.genero, u.telefono, t.tipo_cuenta, c.numero_cuenta, c.saldo 
    from usuario u join cuenta c on  u.dpi = c.Usuario_dpi
    join tipo_cuenta t on c.tipo_cuenta_id = t.id
    where (num_cuenta is null or c.numero_cuenta like concat(num_cuenta,'%'))
    and (dpi is null or u.dpi like concat(dpi,'%'))
    and (apellido is null or u.apellido like concat(apellido,'%'));
end$$
delimiter ;

call BuscarUsuario('0','','Z');