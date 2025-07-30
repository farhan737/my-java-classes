USE maindata;

SELECT
    e1.ename AS employee_name,
    e2.ename AS manager_name,
    e1.sal AS employee_salary,
    e2.sal AS manager_salary,
    (e2.sal - e1.sal) AS salary_difference
FROM emp AS e1
    INNER JOIN emp AS e2 ON e1.mgr = e2.empno
WHERE
    e2.sal > e1.sal;