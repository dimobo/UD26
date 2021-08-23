DROP TABLE IF EXISTS `ventas`;
DROP TABLE IF EXISTS `maquinas_registradoras`;
DROP TABLE IF EXISTS `productos`;
DROP TABLE IF EXISTS `cajeros`;

 CREATE TABLE `cajeros`(
	id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	nomapels VARCHAR (255)
);

CREATE TABLE `productos`(
	id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	nombre VARCHAR (100),
	precio DOUBLE
);

CREATE TABLE `maquinas_registradoras`(
	id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	piso INT
);

CREATE TABLE `ventas`(
	cajero INT,
	maquina INT,
	producto INT,
    PRIMARY KEY (cajero, maquina, producto),
	FOREIGN KEY (cajero) REFERENCES cajeros(id),
	FOREIGN KEY (maquina) REFERENCES cajeros(id),
	FOREIGN KEY (producto) REFERENCES cajeros(id)
    ON DELETE CASCADE
	ON UPDATE CASCADE
);

/* Inserts tabla cajeros */
INSERT INTO cajeros (nomapels) VALUES ("Dídac Montero");
INSERT INTO cajeros (nomapels) VALUES ("Alejandro Algo");
INSERT INTO cajeros (nomapels) VALUES ("Jordi Fores");
INSERT INTO cajeros (nomapels) VALUES ("Pepe Pringao");
INSERT INTO cajeros (nomapels) VALUES ("Xavi Falco");
INSERT INTO cajeros (nomapels) VALUES ("Rocio Lendines");
INSERT INTO cajeros (nomapels) VALUES ("Jair Fava");
INSERT INTO cajeros (nomapels) VALUES ("Lluis Pino");
INSERT INTO cajeros (nomapels) VALUES ("Victor Zaragoza");
INSERT INTO cajeros (nomapels) VALUES ("Roger Melic");

/* Inserts tabla productos */
INSERT INTO productos (nombre, precio) VALUES ("Tornillo",1.5);
INSERT INTO productos (nombre, precio) VALUES ("Tuerca",1);
INSERT INTO productos (nombre, precio) VALUES ("Brida",0.5);
INSERT INTO productos (nombre, precio) VALUES ("Cinta",1);
INSERT INTO productos (nombre, precio) VALUES ("Pomo",5.49);
INSERT INTO productos (nombre, precio) VALUES ("Taco",2);
INSERT INTO productos (nombre, precio) VALUES ("Silicona",10.56);
INSERT INTO productos (nombre, precio) VALUES ("Goma Termo fusible",3);
INSERT INTO productos (nombre, precio) VALUES ("Alimentador v9",40);
INSERT INTO productos (nombre, precio) VALUES ("Usb 64gb",20);

/* Inserts tabla maquinas_registradoras */
INSERT INTO maquinas_registradoras (piso) VALUES (1);
INSERT INTO maquinas_registradoras (piso) VALUES (1);
INSERT INTO maquinas_registradoras (piso) VALUES (1);
INSERT INTO maquinas_registradoras (piso) VALUES (1);
INSERT INTO maquinas_registradoras (piso) VALUES (2);
INSERT INTO maquinas_registradoras (piso) VALUES (2);
INSERT INTO maquinas_registradoras (piso) VALUES (2);
INSERT INTO maquinas_registradoras (piso) VALUES (3);
INSERT INTO maquinas_registradoras (piso) VALUES (3);
INSERT INTO maquinas_registradoras (piso) VALUES (3);

/* Inserts tabla venta */
INSERT INTO ventas VALUES (1,1,1);
INSERT INTO ventas VALUES (2,5,2);
INSERT INTO ventas VALUES (4,9,5);
INSERT INTO ventas VALUES (6,7,7);
INSERT INTO ventas VALUES (6,8,7);
INSERT INTO ventas VALUES (8,5,3);
INSERT INTO ventas VALUES (1,9,1);
INSERT INTO ventas VALUES (3,4,9);
INSERT INTO ventas VALUES (2,1,2);
INSERT INTO ventas VALUES (6,9,7);
INSERT INTO ventas VALUES (6,9,8);