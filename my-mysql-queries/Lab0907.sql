USE maindata;

CREATE TABLE customer1 (
    custid int AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL CHECK (age <= 18),
    PRIMARY KEY (custid)
);

INSERT INTO
    customer1 (name, age)
VALUES ('farhan', 18),
    ('pushkar', 17);

SELECT * FROM customer1;

DROP TABLE customer1;