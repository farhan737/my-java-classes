
# ACID PROPERTIES

ACID stands for **Atomicity, Consistency, Isolation, and Durability**. These are the key properties that ensure **reliable transaction processing** in databases.

A **transaction** = a single logical unit of work (e.g., transferring money from one bank account to another).

---

## 1. Atomicity ("All or Nothing")

* A transaction is **atomic**, meaning either **all operations happen or none happen**.
* If any part of the transaction fails, the whole transaction is rolled back.

**Example:**

* Money transfer from A to B:

  1. Deduct ₹500 from A
  2. Add ₹500 to B
* If step 1 succeeds but step 2 fails → rollback → A’s money is restored.

---

## 2. Consistency ("Valid State")

* Ensures the database **remains in a valid state** before and after a transaction.
* All **integrity constraints** (like primary key, foreign key, check constraints) must be preserved.

**Example:**

* If a bank account must never go negative, a transaction trying to withdraw more than the balance will be rejected.

---

## 3. Isolation ("No Interference")

* Transactions occur **independently** without interfering with each other.
* The result should be the same as if transactions were executed **one after the other (serially)**, even when they actually run in parallel.

**Example:**

* Two people booking the last movie ticket:

  * Without isolation → both may get confirmation → inconsistency.
  * With isolation → only one booking succeeds.

---

## 4. Durability ("Permanent Effect")

* Once a transaction is **committed**, its changes are **permanent**, even if the system crashes.
* Achieved using logs and backups.

**Example:**

* If you transfer money and get a confirmation, even if the bank server crashes right after, the transfer remains successful when the system restarts.

