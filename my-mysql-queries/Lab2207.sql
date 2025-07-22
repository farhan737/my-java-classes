USE maindata;

--to select names, job titles and salaries of employees whose department is located in "DALLAS"
SELECT ename, job, sal
FROM emp AS e
    INNER JOIN dept AS d ON e.deptno = d.deptno
WHERE
    loc = 'DALLAS ';

--to select employee details along with their department number for employees who is either "MANAGER" or "ANALYST"
SELECT ename, job, sal, e.deptno
FROM emp AS e
    INNER JOIN dept AS d ON e.deptno = d.deptno
WHERE
    job = 'MANAGER'
    OR job = 'ANALYST';

--to select the employee name, job, sal and the location of the department they are associated with, for employees whose salary is greater than 1500 and the location of their departments is "CHICAGO"
SELECT e.ename, e.job, e.sal, d.dname, d.loc
FROM emp AS e
    INNER JOIN dept AS d ON e.deptno = d.deptno
WHERE
    e.sal > 1500
    AND d.loc = 'CHICAGO';