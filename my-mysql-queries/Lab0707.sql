USE maindata;

CREATE TABLE newemployee (
    empid int AUTO_INCREMENT,
    empname VARCHAR(50) NOT NULL,
    salary INT NOT NULL,
    PRIMARY KEY (empid)
);

INSERT INTO
    newemployee (empname, salary)
VALUES ('farhan', 20000),
    ('pushkar', 30000),
    ('chakradhar', 25000);

SELECT
    empid,
    empname,
    salary + salary * 0.2 AS increasedsalary,
    (salary + salary * 0.2) * 12 AS annualsalary
FROM newemployee;

SELECT * FROM newemployee;