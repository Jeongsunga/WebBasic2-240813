create database jpa_database;
Use jpa_database;

create table sample_table_1 (
   sampel_id varchar(10) primary key,
	sample_column int not null
);

create table sample_table_2 (
   sample_ai int primary key auto_increment,
    sample_column boolean
);