# JAVA EXCEPTION HANDLING
In Java, **user-defined exceptions** (also called **custom exceptions**) are exceptions that you create yourself to represent specific error conditions in your program.

They are typically created by **extending** either:

* `Exception` → for **checked exceptions**, or
* `RuntimeException` → for **unchecked exceptions**.

---

## ✅ 1. Defining a User-Defined Exception

Here’s the basic structure:

```java
// Custom checked exception
class InvalidAgeException extends Exception {
    // Constructor with a custom message
    public InvalidAgeException(String message) {
        super(message); // passes the message to Exception class constructor
    }
}
```

### Explanation:

* You create a class that **extends `Exception`**.
* You define a **constructor** that takes a `String` message.
* You call `super(message)` to pass that message to the base `Exception` class, which handles printing and storing it.

---

## ✅ 2. Throwing the Exception

You can **throw** this exception using the `throw` keyword:

```java
class TestAge {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
```

---

### 💡 Output:

```
Caught Exception: Age must be 18 or above to vote
```

---

## ✅ 3. Creating an Unchecked (Runtime) Custom Exception

If you want your custom exception to be **unchecked**, extend `RuntimeException` instead:

```java
class InvalidUsernameException extends RuntimeException {
    public InvalidUsernameException(String message) {
        super(message);
    }
}
```

Then you can throw it **without declaring** it in the `throws` clause:

```java
public class Login {
    public static void validateUser(String username) {
        if (username == null || username.isEmpty()) {
            throw new InvalidUsernameException("Username cannot be empty");
        }
        System.out.println("Welcome, " + username);
    }

    public static void main(String[] args) {
        try {
            validateUser("");
        } catch (InvalidUsernameException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

---

## ✅ 4. Summary Table

| Type                       | Base Class         | Checked/Unchecked | Must Declare with `throws` | Example                    |
| -------------------------- | ------------------ | ----------------- | -------------------------- | -------------------------- |
| Custom Checked Exception   | `Exception`        | Checked           | Yes                        | `InvalidAgeException`      |
| Custom Unchecked Exception | `RuntimeException` | Unchecked         | No                         | `InvalidUsernameException` |

---

## ✅ 5. Optional: Adding Extra Fields

You can even include extra details in your exception:

```java
class BankException extends Exception {
    private int errorCode;

    public BankException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
```

Usage:

```java
throw new BankException("Insufficient balance", 101);
```

# USER DEFINED EXCEPTIONS
## ✅ 1. The role of `super(message)`

When you define a custom exception, you’re *inheriting* from `Exception` (or `RuntimeException`).
These parent classes already have constructors like:

```java
public Exception() { }
public Exception(String message) { ... }
```

So when you write:

```java
public InvalidAgeException(String message) {
    super(message);
}
```

you’re calling the parent constructor that **stores the message** inside the exception object.
This message is later retrieved by methods like `getMessage()` or printed automatically by `printStackTrace()`.

---

### 🔹 Without `super(message)`

If you omit it, like this:

```java
public InvalidAgeException(String message) {
    // no call to super(message)
}
```

then:

* The message is **not passed** to the parent `Exception` class.
* Calling `getMessage()` will return `null`.
* The exception can still be thrown, but it won’t show your custom message when printed.

Example:

```java
try {
    throw new InvalidAgeException("Age must be 18+");
} catch (InvalidAgeException e) {
    System.out.println(e.getMessage()); // prints null if super(message) not called
}
```

---

## ✅ 2. What about `super();` ?

Yes — `super();` **does exist**.
It calls the **no-argument constructor** of the parent class (`Exception()`), meaning no message is set.

You can use it if your exception doesn’t need a message:

```java
public InvalidAgeException() {
    super(); // calls the default Exception constructor
}
```

---

## ✅ 3. You can even have both constructors

This is common and gives flexibility:

```java
class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super(); // no message
    }

    public InvalidAgeException(String message) {
        super(message); // message-based constructor
    }
}
```

Usage:

```java
throw new InvalidAgeException("Custom message");
throw new InvalidAgeException(); // no message
```

---

## ✅ 4. Summary Table

| Constructor      | Calls                            | Purpose                                       |
| ---------------- | -------------------------------- | --------------------------------------------- |
| `super()`        | Default parent constructor       | No message                                    |
| `super(message)` | Message-based parent constructor | Custom message displayed by `getMessage()`    |
| No `super(...)`  | Implicit call to `super()`       | Same as default constructor, message = `null` |

---

### ✅ Best Practice:

➡ Always use `super(message)` if your custom exception should display a specific message.
➡ Define both constructors (`super()` and `super(message)`) if you want flexibility.

[previous](javaexceptionhandling1.md)
[next](javacollectionslists1.md)