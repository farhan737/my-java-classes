use maindata;

CREATE TABLE course (
    courseid INT NOT NULL AUTO_INCREMENT,
    coursename VARCHAR(100) NOT NULL,
    fee INT NOT NULL,
    duration INT NOT NULL,
    PRIMARY KEY (courseid)
);

CREATE TABLE student (
    studentid INT NOT NULL AUTO_INCREMENT,
    studentname VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(100) NOT NULL,
    courseid INT NOT NULL,
    PRIMARY KEY (studentid),
    FOREIGN KEY (courseid) REFERENCES course (courseid) ON UPDATE CASCADE,
    UNIQUE KEY (email)
);

INSERT INTO
    course (coursename, fee, duration)
VALUES ('Java Full Stack', 32000, 6),
    ('Python Full Stack', 30000, 5),
    (
        'Azure Cloud and AWS ',
        35000,
        6
    );

INSERT INTO
    student (
        studentname,
        age,
        email,
        courseid
    )
VALUES (
        'Farhan Mohammad',
        21,
        'mdfarhan93933@gmail.com',
        1
    ),
    (
        'Pushkar Sai Vardhan',
        22,
        'pushkarsai@gmail.com',
        2
    ),
    (
        'Chakradhar Kolla',
        20,
        'chakradharkolla@gmail.com',
        1
    ),
    (
        'Nishith',
        21,
        'nishith@gmail.com',
        2
    );

SELECT * FROM student;