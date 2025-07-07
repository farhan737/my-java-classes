create database maindata;
use maindata;
create table publisher(
	pid int not null,
	author varchar(50) not null,
	genre varchar(50) not null,
	primary key (pid)
);

create table book (
	bookid int not null,
	bookname varchar(50) not null,
	price int not null,
	pid int not null,
	primary key (bookid),
	foreign key (pid) references publisher(pid) on update cascade on delete cascade
);

insert into publisher values
(1,'guiltythree','fantasy'),
(2,'hbo','gore');

insert into book values
(1,'shadow slave',200,1),
(2,'game of thrones',500,2),
(3,'house of dragons',400,2);

select bookid,bookname,price,author,genre from book inner join publisher on book.pid = publisher.pid;