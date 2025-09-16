use maindata;

select
	e.empno,
	e.ename,
	e.job,
	s.grade,
	d.loc,
	d.dname,
	d.deptno
from
	emp e
join dept d on
	e.deptno = d.deptno
join salgrade s on
	e.sal between s.losal and s.hisal
where
	s.grade = (
	select
		max(s1.grade)
	from
		emp e1
	inner join salgrade s1 on
		e1.sal between s1.losal and s1.hisal
);

select
    e.empno,
    e.ename,
    e.job,
    s.grade,
    d.loc,
    d.dname,
    d.deptno,
    e.sal
from emp e
join dept d on e.deptno = d.deptno
join salgrade s on e.sal between s.losal and s.hisal
where e.sal = (
    select max(e1.sal)
    from emp e1
    where e1.deptno = e.deptno
);

