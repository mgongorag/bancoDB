--Procedimiento para insertar un nuevo empleado
delimiter $$
create procedure InsertarEmpleado (
	in username varchar(20),
    in nombre varchar(45),
    in apellido varchar(45),
    in password varchar(45),
    in departamento_id int
)
begin
	insert into banco.empleado (username, Nombre, Apellido, password, Departamento_id)
    values (username, nombre, apellido, password, departamento_id);
end $$
delimiter ;

call InsertarEmpleado ('zverany','Verany Alejandra','Zetina Ortiz',123456,2);

--Procedimiento para la busqueda de un empleado por medio de su nombre de usuario
delimiter $$
create procedure ExisteEmpleado(
	in username varchar(20)
)
begin
	select * from empleado where empleado.username = username;
end$$
delimiter ;

call ExisteEmpleado('zverany');

--Procedimiento para actualizar la ultima sesión del usuario
delimiter $$
create procedure ActualizarSesion(
	in last_session datetime,
    in username varchar(20)
)
begin
	update banco.empleado set empleado.last_session = last_session where empleado.username = username;
end$$
delimiter ;