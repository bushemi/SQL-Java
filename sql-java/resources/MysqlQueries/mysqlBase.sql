drop database if exists academy;

create database academy;

use academy;

create table  Students (
 id  serial,
  passport_id  bigint unsigned,
  start_date DATE, 
  finish_date DATE DEFAULT NULL,
  primary key(id)
);

create table  Student_group(
student_id bigint unsigned,
group_id bigint unsigned
);

 create table  Groups(
 id serial,
 name varchar(16),
 form_id bigint unsigned,
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
 passport_id bigint unsigned,
 primary key(id)
 );
 create table Subject_teacher(
  subject_id bigint unsigned,
  teacher_id bigint unsigned
 );
 create table Marks(
 id serial,
 student_id bigint unsigned,
 group_id bigint unsigned,
 subject_id bigint unsigned,
 marks_id bigint unsigned,
 date DATE,
 teacher_id bigint unsigned,
 primary key(id) 
 );
 create table Mark_represent(
 id serial,
 representation varchar(64),
 primary key(id)
 );

 alter table Student_group add foreign key (student_id) references Students(id)
 on update cascade;
  alter table Students add foreign key (passport_id) references Passports(id)
 on update cascade;
 alter table Student_group add foreign key (group_id) references Groups(id)
 on update cascade;
 alter table Groups add foreign key (form_id) references Forms(id)
 on update cascade;
 alter table Teachers add foreign key (passport_id) references Passports(id)
 on update cascade;
 alter table Subject_teacher add foreign key (subject_id) references Subjects(id)
 on update cascade;
 alter table Subject_teacher add foreign key (teacher_id) references Teachers(id)
 on update cascade;
 alter table Marks add foreign key (student_id) references Students(id)
 on update cascade;
 alter table Marks add foreign key (group_id) references Groups(id)
 on update cascade;
 alter table Marks add foreign key (subject_id) references Subjects(id)
 on update cascade;
  alter table Marks add foreign key (marks_id) references Mark_represent(id)
 on update cascade;
  alter table Marks add foreign key (teacher_id) references Teachers(id)
 on update cascade;