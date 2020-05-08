
INSERT INTO banco.tipotrans (id, tipo) values (1, "Deposito");					/* SE INSERTAN LOS TIPOS DE TRANSACCIONES */
INSERT INTO banco.tipotrans (id, tipo) values (2, "Retiro");
INSERT INTO banco.tipotrans (id, tipo) values (3, "Retiro Cajero Automatico");
INSERT INTO banco.tipotrans (id, tipo) values (4, "Retiro con Cheque");						

/* INSERSION DE LOS TIPOS DE CUENTA*/
INSERT INTO banco.tipo_cuenta(id, tipo_cuenta) VALUES (2, "Cuenta Monetaria");
INSERT INTO banco.tipo_cuenta(id, tipo_cuenta) VALUES (1, "Cuenta de Ahorro");

/*INSERSION DE LOS DIFERENTES DEPARTAMENTOS DE LOS EMPLEADOS EN EL BANCO*/
INSERT INTO banco.departamento (nombre) values ("Gerente");							/*ID = 1*/
INSERT INTO banco.departamento (nombre) values ("Cajero");							/*ID = 2*/
INSERT INTO banco.departamento (nombre) values ("Atención al Cliente");				/*ID = 3*/

SELECT * FROM banco.departamento;

/* SI EN DADO CASO LOS DEPARTAMENTOS NO QUEDARON CON SU RESPECTIVO ID (1, 2, 3) CORRESPODIENTES A LOS INSERTS DE ARRIBA, HACER 
LA RESPECTIVA ACTUALIZACIÓN, ACA UN EJEMPLO
UPDATE banco.departamento SET id = "1" WHERE id = "4";
UPDATE banco.departamento SET id = "2" WHERE id = "5";
UPDATE banco.departamento SET id = "3" WHERE id = "6";
*/


/*INSERSION DE EMPLEADOS PARA SU USO EN PRUEBAS*/

INSERT INTO banco.empleado (username, Nombre, Apellido, password,Departamento_id) VALUES ("cenriquem", "Carlos Enrique", "Martinez", "123456", 2);		/* EMPLEADO QUE PERTENECE AL DEPARTAMENTO DE LA CAJA*/
INSERT INTO banco.empleado (username, Nombre, Apellido, password,Departamento_id) VALUES ("jgongoram", "Juan Carlos", "Gongora Macario", "admin", 1);	/* EMPLEADO QUE PERTENECE AL DEPARAMENTO DE GERENTE*/
INSERT INTO banco.empleado (username, Nombre, Apellido, password,Departamento_id) VALUES ("glisbethg", "Gisela", "Gongora", "123456", 3);   /* EMPLEADO QUE PERTENECE AL DEPARTAMENTO DE SERVICIO AL CLIENTE (SECRETARIAS)*/

