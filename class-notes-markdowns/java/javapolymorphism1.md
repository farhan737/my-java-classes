# JAVA OOPS (POLYMORPHISM)

Polymorphism means **“many forms”** — the same method or operator can behave differently depending on the context.


```java
Animal a = new Animal();
```

---

### Components Explained

1. **`Animal` (left side, before `a`)**
   - This is the **reference type**.  
   - It tells the compiler: *“`a` can only see methods and fields defined in `Animal` (or inherited ones).”*  
   - Even if the object is of a subclass (like `Dog`), only `Animal`'s interface is visible through `a`.

---

2. **`a` (the variable name)**
   - This is the **reference variable**.  
   - It stores the **address of the object in heap memory** (not the object itself).  
   - You use it to interact with the object.

---

3. **`new Animal()` (right side)**
   - `new` → allocates memory on the **heap** for an object.  
   - `Animal()` → calls the **constructor** of `Animal` to initialize the object.  
   - Together, they create a new `Animal` object in memory and return its reference.

---

4. **`=` (assignment operator)**
   - Assigns the memory reference (returned by `new Animal()`) to the reference variable `a`.  
   - After execution, `a` points to the newly created `Animal` object in memory.

---

### Putting it Together
```java
Animal a = new Animal();
```
- `Animal` → reference type (compile-time view).  
- `a` → reference variable (stores memory address).  
- `new Animal()` → actual object created in heap memory.  
- `=` → assigns the object’s reference to variable `a`.

## UPCASTING VS DOWNCASTING
1. ### UPCASTING:
```java
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class
class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats bones");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        // Upcasting: Dog object is referred by Animal reference
        Animal a = new Dog(); // Upcasting

        a.eat(); // Calls overridden method in Dog (runtime polymorphism) or Dynamic method dispatch
    }
}
```

2. ### DOWNCASTING:
```java
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class
class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats bones");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        // Upcasting first (safe)
        Animal a = new Dog(); // Upcasting
        a.eat(); // Calls Dog's eat() due to runtime polymorphism
        Dog d = (Dog) a; // Explicit cast required
        d.bark(); // Now we can call Dog-specific method
        d.eat();  // Still calls Dog's eat()
    }
}
```

### KEY PRECAUTIONS:
```java
class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void parentMethod() { // Overridden
        System.out.println("Child's overridden parentMethod");
    }

    void childMethod() {
        System.out.println("Child-specific method");
    }
}

public class CastingExample {
    public static void main(String[] args) {
        Parent p1 = new Child(); // Upcasting: child object referenced by parent
        p1.parentMethod();       // Calls Child's overridden method
        // p1.childMethod();     // ❌ Compile-time error: parent reference can't access child methods

        // Safe Downcasting
        Child c1 = (Child) p1;   // Downcasting: safe because object is actually Child
        c1.childMethod();         // Access child-specific method
        c1.parentMethod();        // Access overridden parent method

        // Unsafe Downcasting (will cause runtime error if uncommented)
        Parent p2 = new Parent(); // Pure parent object
        // Child c2 = (Child) p2; // ❌ Runtime error: ClassCastException
        // c2.childMethod();      // ❌ Would not run because above line fails
    }
}
```


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

The JVM decides **at runtime** which `sound()` method to call based on the **actual object type** (`Dog`), not the reference type (`Animal`).

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
---  

### When **Method Overriding** is NOT possible  

1. **`static` methods cannot be overridden**  
   - They are resolved at **compile time** (early binding), not runtime.  
   - Instead, they can be **hidden**.  

   ```java
   class Parent {
       static void greet() {
           System.out.println("Hello from Parent");
       }
   }
   class Child extends Parent {
       // This is not overriding, it's method hiding
       static void greet() {
           System.out.println("Hello from Child");
       }
   }
   ```

   👉 Output depends on reference type, not object:  
   ```java
   Parent p = new Child();
   p.greet(); // "Hello from Parent"
   ```

---

2. **`final` methods cannot be overridden**  
   - Declared `final` → cannot change implementation.  

   ```java
   class Parent {
       final void greet() {
           System.out.println("Hello from Parent");
       }
   }
   class Child extends Parent {
       // ❌ Compile-time error
       void greet() { 
           System.out.println("Hello from Child");
       }
   }
   ```

---

3. **`private` methods cannot be overridden**  
   - They are not visible to subclasses.  
   - If you declare the same method in child, it’s a **new method**, not overriding.  

   ```java
   class Parent {
       private void greet() {
           System.out.println("Hello from Parent");
       }
   }
   class Child extends Parent {
       void greet() { // Not overriding, it's a new method
           System.out.println("Hello from Child");
       }
   }
   ```

---

4. **Constructors cannot be overridden**  
   - They are not inherited by subclasses.  


### When **Method Overloading** is NOT possible  

1. **Changing only the return type** is not enough  
   - The parameter list **must differ**.  

   ```java
   class Example {
       int add(int a, int b) { return a + b; }
       // ❌ Compile-time error, only return type changed
       double add(int a, int b) { return a + b; }
   }
   ```

---

2. **Methods with same name and same parameter types (regardless of access modifier)** cannot be overloaded.  

   ```java
   class Example {
       void show(int a) {}
       // ❌ Not overloading, duplicate
       public void show(int a) {}
   }
   ```

[previous](javainheritance1.md)  
[next](javashallowcopyvsdeepcopy.md)