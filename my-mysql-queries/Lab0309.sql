use maindata;

select * from emp;

select g.grade, e.* from emp as e join salgrade as g on
	e.sal between g.losal and g.hisal where deptno in (10,30) and g.grade != 4 and e.hiredate < "1982-12-31";  