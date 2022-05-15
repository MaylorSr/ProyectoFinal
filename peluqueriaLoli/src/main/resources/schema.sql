/*drop table servicios if exists;
drop table citas if exists;
drop table linea_de_venta if exists;

drop sequence if exists hibernate_sequence;

create sequence hibernate_sequence start with 100 increment by 1;

create table servicios (
	id bigint not null, 
	nombre varchar(512),
    descripcion varchar(512), 
	imagen text, 
    precio numeric,
	primary key (id)
);

CREATE TABLE citas (
	id bigint not null,
	nombre_cliente varchar (512),
	telefono_cliente varchar (19),
	fecha date,
	primary key (id)
);


CREATE TABLE linea_de_venta(
	id bigint not null,
	servicios_id bigint,
	venta_id bigint
	primary key (id)
);


CREATE TABLE venta (
	id bigint not null,
	lineaDeVenta_id bigint,
	primary key (id)
);


alter table linea_de_venta add constraint fk_linea_de_venta_servicios foreign key (servicios_id) references servicios;
alter table linea_de_venta add constraint fk_linea_de_venta_venta foreign key (venta_id) references citas;
alter table venta add constraint fk_venta_linea_de_venta foreign key (lineaDeVenta_id) references linea_de_venta;*/