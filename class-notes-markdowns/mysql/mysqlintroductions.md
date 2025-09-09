# MYSQL INTRODUCTION

## 1. **Database**

* A **database** is an organized collection of data that can be stored, managed, and retrieved efficiently.
* It allows storing large amounts of structured information in a way that makes it easy to query and manipulate.

**Examples:** MySQL, Oracle, PostgreSQL, MongoDB.

---

## 2. **Schema**

* A **schema** is the **logical structure of a database**.
* It defines how data is organized, including **tables, views, indexes, stored procedures, triggers, and relationships**.
* Think of a schema as a **blueprint** of the database.

In **MySQL**, a *schema* and a *database* are essentially the **same thing** (you can use them interchangeably).

---

## 3. **Types of Databases**

### (A) Based on Data Model

1. **Relational Database (RDBMS)**

   * Data stored in **tables (rows & columns)**.
   * Uses **SQL** for querying.
   * Example: MySQL, PostgreSQL, Oracle, SQL Server.

2. **NoSQL Database**

   * Non-relational; stores unstructured or semi-structured data.
   * Types:

     * **Document-based** (MongoDB, CouchDB)
     * **Key-Value** (Redis, DynamoDB)
     * **Column-based** (Cassandra, HBase)
     * **Graph-based** (Neo4j)

3. **Hierarchical Database**

   * Data stored in a **tree-like structure** (parent-child relationship).
   * Example: IBM IMS.

4. **Network Database**

   * Data represented as **records connected by links** (graph structure).
   * Example: IDMS.

---

### (B) Based on Usage

1. **Operational Databases** – For day-to-day transactions. (e.g., MySQL for e-commerce apps)
2. **Data Warehouses** – For analytics and reporting (e.g., Amazon Redshift).
3. **Distributed Databases** – Spread across multiple servers (e.g., Google Spanner).
4. **Cloud Databases** – Hosted on cloud platforms (e.g., AWS RDS, Azure SQL).

---

## 4. **Creating a Database in MySQL**

### Syntax:
    ```sql
    CREATE DATABASE database_name;
    ```  

### Example:
- to create a databse
    ```sql
    CREATE DATABASE SchoolDB;
    ```

- To **use** the database:

    ```sql
    USE SchoolDB;
    ```

- To **list all databases**:

    ```sql
    SHOW DATABASES;
    ```

- To **drop (delete) a database**:

    ```sql
    DROP DATABASE SchoolDB;
    ```