USE maindata;

CALL increase_sal_10percent ();

CALL decrease_sal_10percent ();

CALL `GetDeptSalaryStats` (10, @AVG, @NOTCOUNT);

SELECT @AVG;

SELECT @COUNT;

SELECT * FROM emp;