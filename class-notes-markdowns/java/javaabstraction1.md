# JAVA OOPS (ABSTRACTION)
**Abstraction** can be defined as the process of **hiding implementation details** while exposing only the **essential features or specifications** of data members. In Java, abstraction can be achieved using **abstract classes** and **interfaces**. It is also considered a part of **encapsulation**.  

## Interfaces in Java
- An interface in Java can be created using the `interface` keyword.  
- While an interface is similar to a class, its main purpose differs: **interfaces specify what a class should do, but not how it does it**. In other words, an interface serves as a **blueprint** for a class.  
- An interface can also be thought of as a **System Requirement Specification (SRS)** document, defining the expected behavior without providing the implementation.  

## Interface Info  
* **Up to Java 1.7**, interfaces could only contain **abstract methods** and **final variables**.
* **From Java 1.8 onwards**, interfaces can also include **default** and **static methods** with implementations. Default methods allow **backward compatibility**, while static methods provide **consistent behavior across all implementing classes**.
* **From Java 1.9 onwards**, interfaces can have **private methods** as well, which help **avoid code duplication** within the interface and the implementing classes.
* we cannot create constructors inside a interface, therefore we cannot instantiate them by creating an object for it.
* by default the methods in interfaces are `abstract` and for variables they are `static` and `final` with the scope of the interface (`public` or `<default>`). 

## Interfaces Types:
### 1. Functional Intefaces(Single Abstract Method Interface or SAM Function):
can contain any number of default/static/private methods but only one abstract method. were introduced in java from version `1.8` onwards to work with lambda expressions and is the only way to work with lambda expressions.  
example:
```java
// Define a functional interface
@FunctionalInterface
interface Greeting {
    void sayHello(String name);  // Only one abstract method
}

public class Main implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Greeting greeting = new Main();
        
        // Call the method
        greeting.sayHello("Farhan");
    }
}
```

**Explanation:**  
- The `Greeting` interface has **one abstract method**, making it a functional interface.  
- This is the traditional way to implement functional interfaces before Java 8 introduced lambdas.  

**Some Predefined Functional Interfaces**:
`Runnable`, `Comparable`, `Comparator`, `Predicate`, `Function`, `Consumer` and `Supplier`
### 2.  Marker Interfaces:
- interfaces that have no methods specified in them are called Marker Intefaces.
- allows use to work with the classes and provide them capabilities.  
example:
```java
// Define a marker interface
interface SerializableMarker {
    // No methods, just a marker
}

// A class implementing the marker interface
class User implements SerializableMarker {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User("Farhan", 25);
        
        // Check if the object is "marked" as Serializable
        if (user instanceof SerializableMarker) {
            System.out.println("This object can be serialized.");
        } else {
            System.out.println("This object cannot be serialized.");
        }
        
        user.display();
    }
}
```
**Some Predefined Marker Interfaces:** `Cloneable`, `Serializabe` and `RandomAccess`.

## WHAT IS IOC (Inversion Of Control):
* **IoC** is a design principle where the **control of object creation and dependency management is inverted** from the programmer to a framework or external entity.
* In other words, instead of classes **creating their own dependencies**, they **get them from outside** (through constructor, setter, or interface).
* This makes the code more flexible, testable, and loosely coupled.
* In Java, frameworks like **Spring** use IoC extensively (via Dependency Injection).

---

### Simple Example using Interfaces (without Spring)

```java
// Service interface
interface MessageService {
    void sendMessage(String message);
}

// Implementation 1
class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

// Implementation 2
class SMSService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

// Class that depends on the interface, not the implementation
class Notification {
    private MessageService service;

    // Dependency is injected via constructor
    public Notification(MessageService service) {
        this.service = service;
    }

    public void notifyUser(String message) {
        service.sendMessage(message);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Instead of Notification creating EmailService or SMSService,
        // we inject it from outside (IoC in action)

        MessageService email = new EmailService();
        Notification notification1 = new Notification(email);
        notification1.notifyUser("Hello Farhan via Email!");

        MessageService sms = new SMSService();
        Notification notification2 = new Notification(sms);
        notification2.notifyUser("Hello Farhan via SMS!");
    }
}
```

---

### Explanation:

* `MessageService` is an **interface** (contract).
* `EmailService` and `SMSService` are **implementations**.
* `Notification` class depends on `MessageService` (interface), not on a specific implementation → this is **loose coupling**.
* The actual object (`EmailService` or `SMSService`) is injected from **outside**, not created inside `Notification`.
* This is the essence of **IoC**.

[previous](javashallowcopyvsdeepcopy.md)
[next](javaabstraction2.md)