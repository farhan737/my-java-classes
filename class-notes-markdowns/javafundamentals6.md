# JAVA FUNDAMENTALS - 6



### **Why do we need constructors?**

* To **initialize objects** and their **instance variables**.
* Without a constructor, objects cannot be created.
* They provide a clean way to set up the initial state of an object.

---

### **What is a constructor?**

* A **special method** in a class that is called **automatically** when an object is created.
* Has the **same name as the class**.
* **No return type** (not even `void`).

---

### **Example:**

```java
class Main {
    Main() { // this is the constructor
        System.out.println("Hello from constructor!");
    }
    public static void main(String[] args) {
        Main m1 = new Main(); // constructor is called
    }
}
```

---

### **Important Notes**

1. If a return type is written for a constructor, it becomes a **regular method**, not a constructor.
2. If a class does not have an explicitly defined constructor, the **JVM provides a default constructor**.

   * Default constructor has the **same access modifier as the class**.
   * Has **no arguments** and initializes variables with default values (`0, false, null`).
   * If any constructor is explicitly defined, the default constructor is **not provided**.
3. Objects can only be created with **constructor arguments matching one of the defined constructors**.
4. A constructor is called **every time** an object of the class is created.
5. Constructors **cannot be inherited** but can be called using `super()`.
6. Constructors can be **overloaded** (multiple constructors with different parameter lists).

---

### **Types of Constructors in Java**

1. **Default Constructor** (no parameters, provided by JVM if not defined)

   ```java
   class Example {
       Example() {  // default constructor
           System.out.println("Default Constructor");
       }
   }
   ```

2. **Parameterized Constructor** (takes arguments to initialize variables)

   ```java
   class Student {
       String name;
       int age;
       
       Student(String n, int a) { // parameterized constructor
           name = n;
           age = a;
       }
   }
   ```

3. **Copy Constructor** 
- Copies data from one object to another.
- Useful for creating a new object with the same state as an existing object.

```java
class Student {
    String name;
    int age;
    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        // Create first object using parameterized constructor
        Student s1 = new Student("Farhan", 21);
        // Create second object using copy constructor
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}
```

---

### **Constructor Overloading**

* Having **multiple constructors** with different parameter lists in the same class.

```java
class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n) {
        name = n;
        age = 18;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }
}
```

---

### **Constructor Chaining**

* One constructor calling another constructor in the same class using `this()`, or calling the parent constructor using `super()`.

```java
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle created");
    }
}

class Car extends Vehicle {
    Car() {
        super(); // calls parent constructor
        System.out.println("Car created");
    }
}
```

```java
class Demo {
    Demo() {
        this(10); // calls another constructor in the same class
    }
    Demo(int x) {
        System.out.println("Value: " + x);
    }
}
```

---

### ✅ **Key Takeaways**

* Constructor name = class name.
* No return type allowed.
* Automatically invoked when an object is created.
* JVM provides a default constructor only if no constructor is defined.
* Supports **overloading** and **chaining**.
* Cannot be inherited but can be accessed using `super()`.
* Used to set up initial values of objects in a clean and structured way.

### Command line arguements

Command line arguments in Java are inputs passed to a program during execution, allowing dynamic data to be supplied to the main method via the terminal.

## How Command Line Arguments Work

When a Java program runs, arguments are specified after the class name in the console—for example:  
`java MyProgram arg1 arg2 arg3`.  
These arguments are received by `main(String[] args)`, and stored in the `args` string array.

## Key Features and Uses

- Each argument is a **string**, and their number can be checked with `args.length`.
- They allow customization at runtime without modifying source code.
- Programs can handle different behaviors, configuration, or input values based on arguments supplied.

## Example Usage

A basic example:
```java
public class CommandLineExample {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
        } else {
            System.out.println("Command line arguments:");
            for (int i = 0; i < args.length; i++)
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
```
Running `java CommandLineExample apple orange 42` yields:
```
Command line arguments:
Argument 1: apple
Argument 2: orange
Argument 3: 42
```


## Practical Benefits

- **Flexibility**: Input can adapt program behavior at runtime.
- **Automation**: Useful for batch processes and scripts.
- **Usability**: Avoids hardcoded values, enabling greater interactivity.


### about SOP (`System.out.println()`)

`System.out.println()` in Java is a commonly used method to print output to the console (standard output) with a newline appended at the end. It belongs to the `PrintStream` class, which is accessed via the static member "`out`" of the `System` class.

#### Key Components 
- `System`: A final class in the java.lang package, providing access to system-related functionalities.
- `out`: A public static instance of `PrintStream` in the System class, representing the standard output stream.
- `println()`: A method of `PrintStream` that prints the argument passed to it and then moves the cursor to a new line.
