create table publisher (
pubid int not null,
pubname varchar(50) not null,
primary key (pubid)
);

create table book (
bookid int not null,
bookname varchar(50) not null,
pubid int not null,
primary key (bookid),
FOREIGN key (pubid) references publisher(pubid) on update cascade on delete cascade
);

insert into publisher values
(1,'guiltythree'),
(2,'miyazaki');

insert into book values
(1,'shadow slave',1),
(2,"shuna's journay",2),
(3,'turning point', 2);

delete from publisher where pubid = 1; 

update publisher set pubid = 3 where pubid = 2;
<<<<<<< HEAD
<<<<<<< HEAD
//nice
=======

>>>>>>> e4a4a86 (CS0507(SQL))
=======
//nice
>>>>>>> 5d1ed91 (07072025)
select * from book;