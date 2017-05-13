drop database if exists academy;

create database academy;

use academy;

create table  Students (
 id  serial,
  id_passport  bigint unsigned,
  start_date DATE, 
  finish_date DATE DEFAULT NULL,
  primary key(id)
);

create table  Student_group(
id_student bigint unsigned,
id_group bigint unsigned
);

 create table  Groups(
 id serial,
 name varchar(16),
 id_form bigint unsigned,
 primary key(id)
 );
 
 create table  Passports(
  id serial,
  first_name varchar(64),
  last_name varchar(64),
  primary key(id)
 );
 create table Forms (
 id serial,
 name varchar(64),
 primary key(id)
 );
 create table Subjects( 
 id serial,
 name varchar(64),
 primary key(id)
 );
 create table Teachers(
 id serial,
 id_passport bigint unsigned,
 primary key(id)
 );
 create table Subject_teacher(
  id_subject bigint unsigned,
  id_teacher bigint unsigned
 );
 create table Marks(
 id serial,
 id_student bigint unsigned,
 id_group bigint unsigned,
 id_subject bigint unsigned,
 id_marks bigint unsigned,
 date DATE,
 id_teacher bigint unsigned,
 primary key(id) 
 );
 create table Mark_represent(
 id serial,
 representation varchar(64),
 primary key(id)
 );

 alter table Student_group add foreign key (id_student) references Students(id)
 on update cascade;
  alter table Students add foreign key (id_passport) references Passport(id)
 on update cascade;
 alter table Student_group add foreign key (id_group) references Groups(id)
 on update cascade;
 alter table Groups add foreign key (id_form) references forms(id)
 on update cascade;
 alter table teachers add foreign key (id_passport) references Passport(id)
 on update cascade;
 alter table subject_teacher add foreign key (id_subject) references Subjects(id)
 on update cascade;
 alter table subject_teacher add foreign key (id_teacher) references teachers(id)
 on update cascade;
 alter table marks add foreign key (id_student) references Students(id)
 on update cascade;
 alter table marks add foreign key (id_group) references Groups(id)
 on update cascade;
 alter table marks add foreign key (id_subject) references Subjects(id)
 on update cascade;
  alter table marks add foreign key (id_marks) references marks_represent(id)
 on update cascade;
  alter table marks add foreign key (id_teacher) references teachers(id)
 on update cascade;