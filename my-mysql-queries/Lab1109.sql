use maindata;

select e.ename, e.sal, e.job, d.dname, d.deptno, d.loc, s.grade from emp e join dept d on d.deptno = e.deptno join salgrade s on e.sal between s.losal and s.hisal where sal = (select max(e1.sal) from emp e1 where e1.deptno = e.deptno);

call return_managers_for_deptno(30);