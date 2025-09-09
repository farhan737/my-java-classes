
# SQL CONSTRAINTS

Constraints are rules applied on table columns to **ensure data integrity**. They can be defined:

1. **During table creation** (`CREATE TABLE`)
2. **After table creation** (`ALTER TABLE`)

---

## 1. NOT NULL

* Ensures that a column cannot have `NULL` values.

**Example:**

```sql
CREATE TABLE Students (
    StudentID INT NOT NULL,
    Name VARCHAR(50) NOT NULL
);
```

---

## 2. UNIQUE

* Ensures all values in a column (or group of columns) are unique.
* Unlike `PRIMARY KEY`, it allows `NULL` values (but only one `NULL` per column in MySQL).

**Example:**

```sql
CREATE TABLE Employees (
    EmpID INT,
    Email VARCHAR(100) UNIQUE
);
```

---

## 3. PRIMARY KEY

* Uniquely identifies each record.
* Combines **NOT NULL** + **UNIQUE**.
* A table can have only **one primary key**, but it may consist of multiple columns (composite key).

**Example:**

```sql
CREATE TABLE Departments (
    DeptID INT PRIMARY KEY,
    DeptName VARCHAR(100)
);
```

Composite key:

```sql
CREATE TABLE CourseRegistrations (
    StudentID INT,
    CourseID INT,
    PRIMARY KEY (StudentID, CourseID)
);
```

---

## 4. FOREIGN KEY

* Ensures a value in one table matches a value in another table’s primary key.
* Maintains **referential integrity**.

**Example:**

```sql
CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
```

---

## 5. CHECK

* Ensures that values meet a specific condition.

**Example:**

```sql
CREATE TABLE Accounts (
    AccID INT PRIMARY KEY,
    Balance DECIMAL(10,2) CHECK (Balance >= 0)
);
```

---

## 6. DEFAULT

* Provides a default value for a column if none is specified.

**Example:**

```sql
CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    Stock INT DEFAULT 0
);
```

---

## 7. AUTO\_INCREMENT (MySQL-specific)

* Automatically generates unique values for a column (often used with primary keys).

**Example:**

```sql
CREATE TABLE Users (
    UserID INT AUTO_INCREMENT PRIMARY KEY,
    Username VARCHAR(50) NOT NULL
);
```

---

## Using ALTER to Add Constraints

Constraints can be added after table creation:

```sql
ALTER TABLE Students ADD CONSTRAINT pk_student PRIMARY KEY (StudentID);
ALTER TABLE Employees ADD CONSTRAINT uq_email UNIQUE (Email);
ALTER TABLE Orders ADD CONSTRAINT fk_customer FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID);
ALTER TABLE Accounts ADD CONSTRAINT chk_balance CHECK (Balance >= 0);
```

