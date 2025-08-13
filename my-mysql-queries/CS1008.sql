USE maindata;
SET @percent = 20;
CALL adjust_sal_info(7839, @percent, @updated_salary);
SELECT @updated_salary;
SELECT sal FROM emp WHERE empno = 7839;

CALL calculate_bonus();