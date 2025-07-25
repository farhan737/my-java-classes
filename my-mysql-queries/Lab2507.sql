USE maindata;

SELECT e.empno, e.ename, e.sal, d.dname, e.job, d.loc, e.hiredate
FROM emp AS e
    INNER JOIN dept as d ON d.deptno = e.deptno
WHERE
    e.job IN ('MANAGER', 'ANALYST')
    AND e.comm IS NULL
    AND d.loc IN ('NEW YORK', 'DALLAS')
    AND ((1989 - YEAR(e.hiredate)) > 7)
ORDER BY d.loc;