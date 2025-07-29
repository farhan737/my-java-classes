USE maindata;

--display the employee name, job, salary, department name and location of those employees whose salary is higher than the avg salary of all emplyees working in 'NEW YORK'
--test change
SELECT e.ename, e.job, e.sal, d.dname, d.loc
FROM emp AS e
    INNER JOIN dept as d ON d.deptno = e.deptno
WHERE
    e.sal > (
        SELECT AVG(e1.sal)
        FROM emp AS e1
            INNER JOIN dept AS d1 ON d1.deptno = e1.deptno
        WHERE
            d1.loc = 'NEW YORK'
    );