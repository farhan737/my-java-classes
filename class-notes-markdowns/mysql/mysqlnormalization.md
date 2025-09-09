# MYSQL DATABASE NORMALIZATION

## 🔹 What is Normalization?

* **Normalization** is the process of organizing data in a database to reduce redundancy and improve data integrity.
* Goal:

  1. Eliminate redundant data
  2. Ensure data dependencies make sense
  3. Make the database easier to maintain

## Keys and Attributes in DBMS

## 🔹 1. Super Key
- A **super key** is **any set of attributes** that can **uniquely identify a row** in a table.  
- It may contain **extra attributes** beyond what’s necessary.  
- Every **candidate key** is a super key, but not every super key is a candidate key.  

✅ **Example:**  
Consider this table:

<table border=1>
  <tr><th>RollNo</th><th>Name</th><th>Email</th><th>Phone</th></tr>
  <tr><td>1</td><td>Aisha</td><td>aisha@mail.com</td><td>9991112222</td></tr>
  <tr><td>2</td><td>Bilal</td><td>bilal@mail.com</td><td>9991113333</td></tr>
  <tr><td>3</td><td>Sara</td><td>sara@mail.com</td><td>9991114444</td></tr>
</table>

- Possible **super keys**:  
  - `{RollNo}`  
  - `{Email}`  
  - `{Phone}`  
  - `{RollNo, Email}`  
  - `{RollNo, Phone, Name}`  
  - and many more (any set that uniquely identifies a row).  

---

## 🔹 2. Candidate Key
- A **candidate key** is a **minimal super key** — no extra attributes included.  
- From all candidate keys, **one is chosen as the primary key**.  

**Example (same table):**
- Candidate keys are:  
  - `{RollNo}`  
  - `{Email}`  
  - `{Phone}`  
Each one alone can uniquely identify a row, and they are minimal (no extra attributes). 

## 🔹 3. Prime Attribute
- A **prime attribute** is any attribute that is part of a **candidate key**.  
- Attributes not in any candidate key are called **non-prime attributes**.  
**Example (same table):**  
- Candidate keys = `{RollNo}`, `{Email}`, `{Phone}`  
- So, **prime attributes** = `RollNo, Email, Phone`  
- **Non-prime attribute** = `Name` (since it’s not part of any candidate key).  
---

## 🔹 Normal Forms

### 1. **Unnormalized Form (UNF)**

* Data may contain **repeating groups** or **multi-valued attributes**.

<table border=1>
  <caption><strong>Orders (UNF)</strong></caption>
  <tr><th>OrderID</th><th>CustomerName</th><th>Items</th><th>OrderDate</th></tr>
  <tr><td>1001</td><td>Aisha</td><td>"Pencil x2; Notebook x1"</td><td>2025-08-01</td></tr>
  <tr><td>1002</td><td>Bilal</td><td>"Pen x1; Notebook x2; Sticker x10"</td><td>2025-08-02</td></tr>
</table>

---

### 2. **First Normal Form (1NF)**

* Eliminate repeating groups.
* Ensure each column contains **atomic values**.

<table border=1>
  <caption><strong>Orders (1NF)</strong></caption>
  <tr><th>OrderID</th><th>CustomerName</th><th>Product</th><th>Quantity</th><th>OrderDate</th></tr>
  <tr><td>1001</td><td>Aisha</td><td>Pencil</td><td>2</td><td>2025-08-01</td></tr>
  <tr><td>1001</td><td>Aisha</td><td>Notebook</td><td>1</td><td>2025-08-01</td></tr>
  <tr><td>1002</td><td>Bilal</td><td>Pen</td><td>1</td><td>2025-08-02</td></tr>
  <tr><td>1002</td><td>Bilal</td><td>Notebook</td><td>2</td><td>2025-08-02</td></tr>
  <tr><td>1002</td><td>Bilal</td><td>Sticker</td><td>10</td><td>2025-08-02</td></tr>
</table>

---

### 3. **Second Normal Form (2NF)**

* Must be in **1NF**.
* Remove **partial dependencies** (when a column depends on part of a composite primary key).
* Split into separate **Orders** and **OrderItems** tables.

<table border=1>
  <caption><strong>Orders</strong></caption>
  <tr><th>OrderID (PK)</th><th>CustomerName</th><th>OrderDate</th></tr>
  <tr><td>1001</td><td>Aisha</td><td>2025-08-01</td></tr>
  <tr><td>1002</td><td>Bilal</td><td>2025-08-02</td></tr>
</table>

<table border=1>
  <caption><strong>OrderItems</strong></caption>
  <tr><th>OrderID (FK)</th><th>ItemID</th><th>Product</th><th>Quantity</th></tr>
  <tr><td>1001</td><td>1</td><td>Pencil</td><td>2</td></tr>
  <tr><td>1001</td><td>2</td><td>Notebook</td><td>1</td></tr>
  <tr><td>1002</td><td>1</td><td>Pen</td><td>1</td></tr>
  <tr><td>1002</td><td>2</td><td>Notebook</td><td>2</td></tr>
  <tr><td>1002</td><td>3</td><td>Sticker</td><td>10</td></tr>
</table>

---

### 4. **Third Normal Form (3NF)**

* Must be in **2NF**.
* Remove **transitive dependencies** (non-key columns depending on other non-key columns).
* Create **Customers** and **Products** tables separately.

<table border=1>
  <caption><strong>Customers</strong></caption>
  <tr><th>CustomerID (PK)</th><th>CustomerName</th></tr>
  <tr><td>C01</td><td>Aisha</td></tr>
  <tr><td>C02</td><td>Bilal</td></tr>
</table>

<table border=1>
  <caption><strong>Products</strong></caption>
  <tr><th>ProductID (PK)</th><th>ProductName</th><th>Price</th></tr>
  <tr><td>P001</td><td>Pencil</td><td>5.00</td></tr>
  <tr><td>P002</td><td>Notebook</td><td>40.00</td></tr>
  <tr><td>P003</td><td>Pen</td><td>10.00</td></tr>
</table>

<table border=1>
  <caption><strong>OrderItems (3NF)</strong></caption>
  <tr><th>OrderID (FK)</th><th>ItemID</th><th>ProductID (FK)</th><th>Quantity</th></tr>
  <tr><td>1001</td><td>1</td><td>P001</td><td>2</td></tr>
  <tr><td>1001</td><td>2</td><td>P002</td><td>1</td></tr>
  <tr><td>1002</td><td>1</td><td>P003</td><td>1</td></tr>
</table>

---

## 🔹 When to Stop Normalizing?

* Most practical databases go up to **3NF**.
* Higher forms like **BCNF, 4NF** exist but are rarely required for typical applications.
* Sometimes **denormalization** is done for performance in reporting systems.
