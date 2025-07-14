use maindata;

select job,deptno,ename from emp where ename like '%A%' and deptno in(10,20,30) and comm is null order by deptno limit 0,3;