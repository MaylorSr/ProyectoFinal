drop table SERVICIOS if exists;
drop sequence if exists hibernate_sequence;

create sequence hibernate_sequence start with 100 increment by 1;

create table SERVICIOS (
	id bigint not null, 
	nombre varchar(512),
    descripcion varchar(512), 
	imagen varchar(512), 
    precio numeric,
	primary key (id)
);

INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Corte sin degradado','Corte para caballeros sin incluir un degradado', 'https://hombresconestilo.com/wp-content/uploads/2020/11/variedad-de-cortes-de-pelo-para-calvos.jpg.webp', '9'); 
INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Tinte','tinte de cabello', 'https://cdn-0.somosmamas.com.ar/wp-content/uploads/2019/04/1f6a0ad9ba8d51d39b2abe3ce1b140d6.jpg', '11'); 
INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Mechas','Tinte en una parte del cabello', 'https://i.pinimg.com/originals/1c/9c/64/1c9c6442fd1034618af5786a9024973c.jpg', '7'); 
INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Corte con degradado','Corte con degradado para los caballeros, incluída las líneas laterales y formas que desee.', 'https://modaellos.com/wp-content/uploads/2020/07/cortes-de-pelo-degradado-hombre-para-pelo-corto-2020-flequillo-curl.png', '11'); 
INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Mechas de gorro',' ', 'https://i.pinimg.com/474x/27/d2/a9/27d2a95b0bde573d3f56694119664c9d.jpg', '7'); 
INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Balayage ',' ', 'https://i.pinimg.com/474x/27/d2/a9/27d2a95b0bde573d3f56694119664c9d.jpg', '25'); 
INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Mechas de gorro',' ', 'https://i.pinimg.com/474x/de/62/bd/de62bde8fe14c121ab7aae0879f9ba7d.jpg', '7'); 
INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Lavar y secar',' ', 'https://scontent.fsvq1-1.fna.fbcdn.net/v/t1.6435-9/93881754_1671247116355982_763462125132709888_n.png?_nc_cat=108&ccb=1-6&_nc_sid=2c4854&_nc_ohc=M9Jchs6bd2cAX8siMmd&_nc_ht=scontent.fsvq1-1.fna&oh=00_AT9gAPod6X4KCxukT3wddlY1D9LpWvARdIgpyng0lOkssA&oe=62A4B3C0', '5'); 
INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Planca Cabello Corto',' ', 'https://expertoenbelleza.com/wp-content/uploads/2020/05/plancha-de-pelo-para-hombres-768x421.jpg', '12'); 
INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Planca Cabello Largo',' ', 'https://i.pinimg.com/originals/cb/56/10/cb561081db1ae79d63c977d596247172.jpg', '16'); 
INSERT INTO SERVICIOS (id, nombre, descripcion, imagen, precio) VALUES (NEXTVAL('hibernate_sequence'),'Decoloración','', 'https://cortesdecabellohombre.com/wp-content/uploads/2018/03/comb-over-con-cabello-blanco.jpg', '20'); 



--INSERT INTO CITAS (id, nombre_cliente, telefono_cliente, fecha) VALUES (NEXTVAL('hibernate_sequence'),'Jóse','608991690', '17-12-2001'); 
--INSERT INTO CITAS (id, nombre_cliente, telefono_cliente, fecha) VALUES (NEXTVAL('hibernate_sequence'),'Jóse','608991690', '17-12-2001'); 
--INSERT INTO CITAS (id, nombre_cliente, telefono_cliente, fecha) VALUES (NEXTVAL('hibernate_sequence'),'Jóse','608991690', '17-12-2001'); 

