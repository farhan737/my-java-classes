use maindata;

call increase_sal_by_percent(10);

select * from emp;

select e.ename,e.sal,d.deptno,d.dname,d.loc,s.grade from where s.grade < 3 and d.loc = "new york";