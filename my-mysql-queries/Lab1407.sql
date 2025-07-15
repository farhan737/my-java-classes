USE maindata;

SELECT job, deptno, ename
FROM emp
WHERE
    ename like '%A%'
    AND deptno IN (10, 20, 30)
    AND comm IS NULL
ORDER BY deptno
LIMIT 0, 3;