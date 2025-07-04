create table employee(
empid int not null,
empname varchar(50) not null,
job varchar(50) not null,
salary int not null,
annualsal int not null,
primary key (empid)
);

insert into employee values
(1, 'farhan', 'java developer', 25000, 600000);