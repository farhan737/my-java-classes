USE maindata;

SELECT
    e1.ename AS employee_name,
    e2.ename AS manager_name,
    e1.sal AS employee_salary,
    e2.sal AS manager_salary,
    (e2.sal - e1.sal) AS salary_difference
FROM emp AS e1, emp AS e2
WHERE
    e2.sal > e1.sal
    AND e1.mgr = e2.empno;