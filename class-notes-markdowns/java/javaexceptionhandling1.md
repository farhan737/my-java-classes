# JAVA EXCEPTION HANDLING
### what is an exception?
* it is a unwanted event or problem that can occur during the normal flow of execution of the program which will result in abnormal execution of the code.  
**Example:**
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Program started...");

        int a = 10;
        int b = 0;

        // This will throw ArithmeticException
        int result = a / b;  

        System.out.println("Result: " + result);

        System.out.println("Program ended...");
    }
}
```
### What happens here:

* The line `int result = a / b;` causes a **divide by zero** → `ArithmeticException`.
* Since there is **no try-catch block** to handle it, the program **terminates immediately**.
* The line `System.out.println("Program ended...");` is **never executed**.
### Output:
```
Program started...
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Main.main(Main.java:9)
```


### why we need exception handling?
* to avoid abnormal termination of the application or program and to handle problems during runtime an gracefully terminate the execution we need exception handling.
* we also use exception handling to properly log the problems that we get during runtime.which will inturn help identify and fix errors more efficiently.  
**Example:**
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Program started...");

        int a = 10;
        int b = 0;

        try {
            int result = a / b;   // risky code
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program ended normally...");
    }
}
```
### Output:
```
Program started...
Exception caught: / by zero
Program ended normally...
```
Now the exception is **handled**, and the program terminates **gracefully** instead of crashing.
## **Exceptions vs Errors in Java**

In Java, both **Exceptions** and **Errors** are subclasses of the `Throwable` class, but they represent different kinds of problems:

---

### **1. Exceptions**

* **Definition**: Exceptions represent conditions that a program **might want to catch and handle**.
* **Caused by**: Problems that occur during the execution of a program due to **invalid inputs, wrong logic, or external factors**.
* **Examples**:

  * `ArithmeticException` → divide by zero
  * `NullPointerException` → accessing methods on a null object
  * `IOException` → input/output failures
  * `FileNotFoundException` → trying to open a non-existing file
* **Recoverable?** Yes, exceptions are usually **recoverable**.
* **Handled by**: `try-catch-finally` blocks or by declaring `throws`.

**Example (Exception – recoverable):**

```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero, handled safely!");
        }
        System.out.println("Program continues...");
    }
}
```

**Output:**

```
Cannot divide by zero, handled safely!
Program continues...
```

---

### **2. Errors**

* **Definition**: Errors indicate **serious problems** that are usually **outside the program’s control**.
* **Caused by**: JVM-related problems or system-level issues.
* **Examples**:

  * `OutOfMemoryError` → heap space exhausted
  * `StackOverflowError` → too much recursion
  * `VirtualMachineError` → JVM has crashed
* **Recoverable?** No, errors are usually **not recoverable** by the program.
* **Handled by**: Normally **not handled**, though you technically *can* catch them, it’s not recommended.

**Example (Error – non-recoverable):**

```java
public class ErrorExample {
    public static void recursiveMethod() {
        // infinite recursion causes StackOverflowError
        recursiveMethod();
    }

    public static void main(String[] args) {
        recursiveMethod(); 
        System.out.println("This line will never be executed!");
    }
}
```

**Output:**

```
Exception in thread "main" java.lang.StackOverflowError
```

---

### **Key Differences Table**

<table border="1" cellpadding="8" cellspacing="0">
  <thead>
    <tr>
      <th>Aspect</th>
      <th>Exceptions</th>
      <th>Errors</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>Nature</b></td>
      <td>Problems in program logic / runtime</td>
      <td>Serious system/JVM issues</td>
    </tr>
    <tr>
      <td><b>Recoverable?</b></td>
      <td>✅ Yes (usually)</td>
      <td>❌ No (mostly)</td>
    </tr>
    <tr>
      <td><b>Examples</b></td>
      <td><code>IOException</code>, <code>ArithmeticException</code></td>
      <td><code>OutOfMemoryError</code>, <code>StackOverflowError</code></td>
    </tr>
    <tr>
      <td><b>Handling</b></td>
      <td>Can be caught using <code>try-catch</code></td>
      <td>Not recommended to catch</td>
    </tr>
    <tr>
      <td><b>Caused by</b></td>
      <td>Programmer mistakes, invalid input, I/O issues</td>
      <td>JVM/system failures</td>
    </tr>
  </tbody>
</table>
In short:

* **Exceptions** → Something went wrong, but your program *can* recover.
* **Errors** → Something is broken at a deeper level, your program usually *cannot* continue.

[next](javaexceptionhandling2.md)
[previous](javastringhandling.md)


