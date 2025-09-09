# MYSQL COMMAND CATEGORIES
## SQL Command Categories with Examples

## 1. **DDL (Data Definition Language)**
Defines or changes the **structure** of the database.

### Example:

```sql
-- Create a database
CREATE DATABASE SchoolDB;

-- Use the database
USE SchoolDB;

-- Create a table
CREATE TABLE Students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    grade VARCHAR(10)
);

-- Add a new column
ALTER TABLE Students ADD email VARCHAR(100);

-- Remove a column
ALTER TABLE Students DROP COLUMN grade;

-- Delete the whole table
DROP TABLE Students;
```

---

## 2. **DML (Data Manipulation Language)**
Deals with **manipulating data inside tables**.

### Example:

```sql
-- Insert data into table
INSERT INTO Students (name, age, email)
VALUES ('Ali', 20, 'ali@example.com');

-- Insert multiple rows
INSERT INTO Students (name, age, email)
VALUES ('Sara', 19, 'sara@example.com'),
       ('John', 21, 'john@example.com');

-- Update existing record
UPDATE Students
SET age = 22
WHERE name = 'John';

-- Delete a record
DELETE FROM Students WHERE name = 'Sara';
```

---

## 3. **DQL (Data Query Language)**
Used for **fetching/querying data**.

### Example:

```sql
-- Fetch all students
SELECT * FROM Students;

-- Fetch specific columns
SELECT name, age FROM Students;

-- Fetch with condition
SELECT * FROM Students WHERE age > 20;

-- Sort data
SELECT * FROM Students ORDER BY age DESC;
```

---

## 4. **DCL (Data Control Language)**
Used to **control access/permissions**.

### Example:

```sql
-- Give user 'farhan' permission to SELECT and INSERT on Students table
GRANT SELECT, INSERT ON Students TO 'farhan'@'localhost';

-- Remove INSERT permission from 'farhan'
REVOKE INSERT ON Students FROM 'farhan'@'localhost';
```

---

## 5. **TCL (Transaction Control Language)**
Used to **manage transactions** (mainly with DML).

### Example:

```sql
-- Start transaction
START TRANSACTION;

-- Insert new student
INSERT INTO Students (name, age, email)
VALUES ('Mary', 23, 'mary@example.com');

-- Save the changes
COMMIT;

-- OR rollback if something went wrong
ROLLBACK;

-- Set a savepoint
SAVEPOINT before_update;

-- Update student record
UPDATE Students SET age = 25 WHERE name = 'Ali';

-- Rollback only to savepoint
ROLLBACK TO before_update;
```
