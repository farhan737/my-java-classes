# JAVA OOPS (ENCAPSULATION AND INHERITANCE)

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
