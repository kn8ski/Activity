drop schema if exists db_registration;
create schema db_registration;

drop table if exists students;
create table students(
id int auto_increment primary key
,fname varchar(225)
,lname varchar(225)
,street varchar(225)
,state varchar(225)
,city varchar(225)
,postal_code int
,phone int
,status int
,created_at datetime
,update_at datetime
,created_by int
,updated_by int
);
