use maindata;
-- trying TCL and rollback after the table has been dropped
create table temp (num INT);

set autocommit = 0;

commit;

insert into temp values (1), (2);

savepoint s1;

insert into temp values (3);

insert into temp values (4);

savepoint s2;

select * from temp;

rollback to s1;

rollback;

drop table temp;
--you can't rollback to dropped tables

--main task
create VIEW high_paid_mgrs as
select e.ename, e.job, e.sal, d.dname
from emp as e
    inner join dept as d on d.deptno = e.deptno
where
    e.sal > (
        select avg(e.sal)
        from emp as e
    );

select *
from high_paid_mgrs
where
    job = 'MANAGER'
    and dname = 'ACCOUNTING';

select * from high_paid_mgrs;

drop view high_paid_mgrs;