# JAVA FUNDAMENTALS - 5

## Types of Variables and Methods

## **1. Types of Variables in Java**

Variables in Java are containers for data. Based on where they are declared and how they are used, variables are classified into three main types:

### **a) Local Variables**

* Declared **inside a method, constructor, or block**.
* Created when the method is invoked and destroyed after the method finishes (lifetime = method scope).
* Must be initialized before use (no default value).

```java
public class VariablesDemo {
    public void show() {
        int localVar = 10;  // local variable
        System.out.println("Local Variable: " + localVar);
    }
}
```

---

### **b) Instance Variables (Non-static fields)**

* Declared **inside a class but outside any method**.
* Represent the **state/attributes** of an object.
* Each object gets its **own copy**.
* Default values are assigned if not initialized (`0, false, null`).

```java
public class Student {
    String name;    // instance variable
    int age;        // instance variable
    
    public void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}
```

---

### **c) Static Variables (Class Variables)**

* Declared with the **`static` keyword** inside a class.
* Shared among **all objects** of the class (single copy in memory).
* Useful for **constants** and **common properties**.

```java
public class Counter {
    static int count = 0;  // static variable
    
    Counter() {
        count++;  // increments for every object
    }
    
    public static void showCount() {
        System.out.println("Objects created: " + count);
    }
}
```

---

### **Summary Table – Variables**

<table border="1" cellpadding="6" cellspacing="0">
  <tr>
    <th>Type</th>
    <th>Declared In</th>
    <th>Scope</th>
    <th>Lifetime</th>
    <th>Default Value</th>
  </tr>
  <tr>
    <td>Local</td>
    <td>Inside method/block</td>
    <td>Only within method</td>
    <td>Until method ends</td>
    <td>No default (must initialize)</td>
  </tr>
  <tr>
    <td>Instance</td>
    <td>Inside class, outside method</td>
    <td>Per object</td>
    <td>As long as object exists</td>
    <td>Has default (0, false, null)</td>
  </tr>
  <tr>
    <td>Static</td>
    <td>Inside class with <code>static</code></td>
    <td>Shared by all objects</td>
    <td>Until program ends</td>
    <td>Has default (0, false, null)</td>
  </tr>
</table>


## **2. Types of Methods in Java**

### **a) Instance Methods (Non-static methods)**

* Belong to objects.
* Can access **instance variables** and **static variables**.
* Require object creation to be called.

```java
public class MathOps {
    int num = 5;
    
    public void square() {   // instance method
        System.out.println("Square: " + (num * num));
    }
}
```

---

### **b) Static Methods**

* Declared with **`static` keyword**.
* Belong to the **class, not objects**.
* Can access **only static variables** directly.
* Called using the **class name**.

```java
public class Utils {
    static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.println(Utils.add(5, 3));
    }
}
```

---

### **c) Final Methods**

* Declared with the **`final` keyword**.
* Cannot be **overridden** in subclasses.

```java
class Parent {
    final void display() {
        System.out.println("This is a final method");
    }
}
```

---

### **Summary Table – Methods (HTML)**

<table border="1" cellpadding="6" cellspacing="0">
  <tr>
    <th>Type</th>
    <th>Keyword</th>
    <th>Belongs To</th>
    <th>Can Access</th>
    <th>Key Point</th>
  </tr>
  <tr>
    <td>Instance</td>
    <td>none</td>
    <td>Object</td>
    <td>Instance + Static variables</td>
    <td>Needs object to call</td>
  </tr>
  <tr>
    <td>Static</td>
    <td>static</td>
    <td>Class</td>
    <td>Only static variables directly</td>
    <td>Called via class name</td>
  </tr>
  <tr>
    <td>Final</td>
    <td>final</td>
    <td>Class/Object</td>
    <td>Normal access</td>
    <td>Cannot be overridden</td>
  </tr>
</table>
