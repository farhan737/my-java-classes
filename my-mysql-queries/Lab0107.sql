use maindata;

create table course2 (
courseid int not null,
coursename varchar(50) not null,
fee int not null,
primary key (courseid)
);

create table student1 (
studentid int not null,
studentname varchar(50) not null,
mobileno varchar(50) not null,
courseid int not null,
foreign key (courseid) references course2(courseid) on update cascade
);

insert into course2 values 
(1, 'pfs', 30000),
(2, 'jfs', 32000),
(3, 'CC', 29000),
(4, 'dotnet', 35000);

insert into student1 values 
(1, 'farhan', '9393396691', 2),
(2, 'pushkar', '9292296691', 4),
(3, 'vema', '9191197791', 2),
(4, 'hari', '9898898893', 1);

select * from course2;

select * from student1;

update course2 set courseid = 8 where courseid = 1;