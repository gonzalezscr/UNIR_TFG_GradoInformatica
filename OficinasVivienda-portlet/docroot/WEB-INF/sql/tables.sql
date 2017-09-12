create table Municipio (
	codigoIne VARCHAR(75) not null primary key,
	nombre VARCHAR(75) null
);

create table OfiVi_Municipio (
	codigoIne VARCHAR(75) not null primary key,
	nombre VARCHAR(75) null
);

create table OfiVi_OficinaServicioMunicipio (
	id_ LONG not null primary key,
	companyId LONG,
	groupId LONG,
	idOficina LONG,
	idServicio LONG,
	codigoIne VARCHAR(75) null
);

create table OfiVi_OficinaTipo (
	id_ LONG not null primary key,
	idOficina LONG,
	idTipo LONG,
	companyId LONG,
	groupId LONG
);

create table OfiVi_Servicio (
	idServicio LONG not null primary key,
	companyId LONG,
	groupId LONG,
	nombre STRING null,
	necesidad STRING null
);

create table OfiVi_Tipo (
	idTipo LONG not null primary key,
	companyId LONG,
	groupId LONG,
	nombre STRING null
);

create table OficinaServicioMunicipio (
	id_ LONG not null primary key,
	companyId LONG,
	groupId LONG,
	idOficina LONG,
	idServicio LONG,
	codigoIne VARCHAR(75) null
);

create table OficinaTipo (
	id_ LONG not null primary key,
	idOficina LONG,
	idTipo LONG,
	companyId LONG,
	groupId LONG
);

create table OficinasVivienda_Municipio (
	codigoIne VARCHAR(75) not null primary key,
	nombre VARCHAR(75) null
);

create table OficinasVivienda_OficinaServicioMunicipio (
	id_ LONG not null primary key,
	companyId LONG,
	groupId LONG,
	idOficina LONG,
	idServicio LONG,
	codigoIne VARCHAR(75) null
);

create table OficinasVivienda_OficinaTipo (
	id_ LONG not null primary key,
	idOficina LONG,
	idTipo LONG,
	companyId LONG,
	groupId LONG
);

create table OficinasVivienda_Servicio (
	idServicio LONG not null primary key,
	companyId LONG,
	groupId LONG,
	nombre STRING null,
	necesidad STRING null
);

create table OficinasVivienda_Tipo (
	idTipo LONG not null primary key,
	companyId LONG,
	groupId LONG,
	nombre STRING null
);

create table Servicio (
	idServicio LONG not null primary key,
	companyId LONG,
	groupId LONG,
	nombre STRING null,
	necesidad STRING null
);

create table Tipo (
	idTipo LONG not null primary key,
	companyId LONG,
	groupId LONG,
	nombre STRING null
);