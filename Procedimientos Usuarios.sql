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