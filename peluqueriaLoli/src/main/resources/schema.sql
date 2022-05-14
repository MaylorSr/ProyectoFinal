/*drop table servicios if exists;
drop sequence if exists hibernate_sequence;

create sequence hibernate_sequence start with 100 increment by 1;

create table servicios (
	id bigint not null, 
	nombre varchar(512),
    descripcion varchar(512), 
	imagen varchar(512), 
    precio numeric,
	primary key (id)
);
*/