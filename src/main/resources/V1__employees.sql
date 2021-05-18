create schema if not exists employees default character set utf8 collate UTF8_HUNGARIAN_CI;
create user 'employees'@'localhost' identified by 'employees';
grant all on *.* to 'employees'@'localhost';
create table employees(id bigint auto_increment, emp_name varchar(255), constraint pk_employees primary key(id));
INSERT INTO employees (emp_name) values ('Matt Groening');
INSERT INTO employees (emp_name) values ("Seth MacFarlaine");