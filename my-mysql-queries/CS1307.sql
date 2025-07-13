USE maindata;

SELECT *
FROM emp
WHERE
    job = 'MANAGER'
    OR job = 'ANALYST'
ORDER BY sal DESC
LIMIT 0, 3;

SELECT *
FROM emp
WHERE
    job = 'MANAGER'
    OR job = 'PRESIDENT'
ORDER BY sal DESC
LIMIT 0, 2;