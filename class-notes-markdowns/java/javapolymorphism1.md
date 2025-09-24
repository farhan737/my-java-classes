# JAVA OOPS (POLYMORPHISM)

Polymorphism means **“many forms”** — the same method or operator can behave differently depending on the context.

There are **two types**:

### 1. Compile-Time Polymorphism (Method Overloading / Static Polymorphism / Early Binding)

**Definition:**

* The method to be executed is **determined at compile time**.
* Achieved using **method overloading** (same method name, different parameters in the same class).

**Key Points:**

* Happens **at compile time** → hence called **early binding**.
* Methods have the **same name** but differ in **number or type of parameters**.
* Return type can be different (if parameters differ).

**Example:**

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));       // Calls int version
        System.out.println(calc.add(3.5, 4.5));   // Calls double version
    }
}
```

**Output:**

```
15
8.0
```

✅ The compiler decides **which `add` method** to call based on **arguments**.

---

### 2. Runtime Polymorphism (Method Overriding / Dynamic Polymorphism / Late Binding)

**Definition:**

* The method to be executed is **determined at runtime**.
* Achieved using **method overriding** (child class provides its own implementation of a parent method).

**Key Points:**

* Happens **at runtime** → hence called **late binding**.
* Parent reference can refer to a **child object** (upcasting).
* Only **overridden methods** exhibit runtime polymorphism.

**Example:**

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();            // Calls Dog's overridden method at runtime
    }
}
```

**Output:**

```
Dog barks
```

✅ The JVM decides **at runtime** which `sound()` method to call based on the **actual object type** (`Dog`), not the reference type (`Animal`).

---

### **Comparison Table**
<table border="1" cellspacing="0" cellpadding="5">
  <tr>
    <th>Feature</th>
    <th>Compile-Time Polymorphism</th>
    <th>Runtime Polymorphism</th>
  </tr>
  <tr>
    <td>Also Called</td>
    <td>Method Overloading / Static Polymorphism / Early Binding</td>
    <td>Method Overriding / Dynamic Polymorphism / Late Binding</td>
  </tr>
  <tr>
    <td>When Resolved</td>
    <td>Compile Time</td>
    <td>Runtime</td>
  </tr>
  <tr>
    <td>Example</td>
    <td>
      <pre>add(int a, int b) vs add(double a, double b)</pre>
    </td>
    <td>
      <pre>Animal a = new Dog(); a.sound();</pre>
    </td>
  </tr>
  <tr>
    <td>Flexibility</td>
    <td>Less Flexible</td>
    <td>More Flexible</td>
  </tr>
  <tr>
    <td>Needs Inheritance</td>
    <td>No</td>
    <td>Yes</td>
  </tr>
</table>


