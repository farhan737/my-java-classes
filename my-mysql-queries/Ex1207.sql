USE maindata;

SELECT *
from emp
WHERE (
        sal > 1500
        AND deptno = 30
    )
    OR comm = 0
ORDER BY job ASC, deptno DESC
LIMIT 0, 3;