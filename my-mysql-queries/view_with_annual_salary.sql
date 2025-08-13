USE maindata;
CREATE VIEW bonus_salary AS SELECT ename, sal , (sal * 12) AS annual_salary FROM emp;

	