# JAVA CODING ETHICS - 1

## Naming Conventions in Java

Java follows a very **strict and widely accepted naming style**.

### 1. **Variables & Methods**

* Use **camelCase**.
* Start with a lowercase letter.
* Should be **descriptive and meaningful**.

```java
int age;                 // ✅ good
int studentAge;          // ✅ better
int a;                   // ❌ too short

String firstName;        // ✅ good
double calculateAverage();// ✅ method name
```

---

### 2. **Classes & Interfaces**

* Use **PascalCase** (UpperCamelCase).

```java
class StudentRecord {}    // ✅
interface DataProvider {} // ✅
class sr {}               // ❌ bad
```

---

### 3. **Constants (final static)**

* Use **UPPER\_CASE** with underscores.

```java
public static final double PI = 3.14159;
public static final int MAX_USERS = 100;
```

---

### 4. **Packages**

* Always lowercase, usually reverse domain style.

```java
package com.example.app;
package farhan.util;
```

---

### 5. **Booleans**

* Should sound like a **true/false question**.

```java
boolean isActive;
boolean hasPermission;
boolean canLogin;
```

---

### 6. **Temporary Variables**

* For loops, use short names like `i`, `j`, `k`.
* Otherwise, **avoid single-letter variables**.

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

---

# ✅ Documenting (JavaDoc & Comments)

### 1. **Single-line comments**

```java
// Store user's age
int age = 20;
```

### 2. **Multi-line comments**

```java
/*
 This block of code checks
 if the user is an adult.
*/
```

### 3. **JavaDoc for methods/classes**

```java
/**
 * Calculates factorial of a number.
 * @param n number to calculate
 * @return factorial result
 */
public int factorial(int n) {
    ...
}
```

### 4. **General rules**

* Comment **why** you are doing something, not **what** (the code shows the "what").
* Keep comments **short and useful**.
* Don’t over-comment obvious things.

---

A good Java class with ethical naming + documentation looks like this:

```java
package com.example.util;

/**
 * Utility class for math operations.
 */
public class MathUtils {

    /**
     * Adds two numbers together.
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
```


