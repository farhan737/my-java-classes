USE maindata

CALL return_nth_highest_from_all_departments(1);

SET list = (SELECT DISTINCT deptno FROM emp);

SELECT ename, sal, deptno FROM emp WHERE deptno = 10 ORDER BY sal DESC LIMIT 0,1;