

drop schema if exists teachers;
create schema teachers;

drop table if exists teachers;

create table myteachers(
 id int auto_increment primary key
, lastname varchar (255)
, middlename varchar (255)
, firstname varchar (255)
, age int
, phoneno int
, created_at datetime
, updated_at datetime
, created_by int
, updated_by int
, status int
);
