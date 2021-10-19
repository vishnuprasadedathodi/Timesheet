create database Employee_Directory;
use Employee_Directory;
create table admin(username varchar(30),password varchar(30),primary key(username));
insert into admin values("admin","admin123");
select * from admin;

create table employee(id integer auto_increment, name varchar(30),age integer,gender varchar(15),designation  varchar(30),phn_no varchar(15),email varchar(45),password varchar(30),primary key(id));
insert into employee values(100,"Vishnu Prasad E",22,"male","Software Developer","7894561230","vishnu@gmail.com","Vishnu@123");
insert into employee values(101,"Sreeju",22,"male","Software Developer","7418529630","sreeju@gmail.com","Sreeju@123");
select * from employee;


create table timesheet(tid integer auto_increment,id integer,name varchar(30),date date,start_time time,end_time time,status varchar(30), key(tid));
insert into timesheet values(1,100,"Vishnu","2021-05-15","09:00:00","18:00:00","saved");
insert into timesheet values(2,100,"Vishnu","2021-05-14","09:00:00","18:00:00","submitted");
select * from timesheet;

delete from timesheet where tid=9;

create table emp_leave(lid integer auto_increment,id integer ,name varchar(30),date date,days integer,leave_type varchar(50),status varchar(30),primary key(lid));
insert into emp_leave values(1,100,"vishnu","2021-05-14",1,"EL","submitted");
drop table emp_leave;

delete from emp_leave where lid=2;
select * from emp_leave;


SELECT * from timesheet where date between '2021-02-01' and '2021-10-01';


