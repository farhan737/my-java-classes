use maindata;

select deptno, count(*)
from emp
where
    comm is not null
group by
    deptno
having
    count(*) > 2;

select dname, avg(sal)
from emp, dept
where
    dept.deptno = 30
group by
    dname
having
    avg(sal) > 1500;