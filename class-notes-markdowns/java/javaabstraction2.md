# JAVA OOPS (ABSTRACTION)

## Abstract Classes and Methods

* In Java, we can create **abstract classes** and **abstract methods** using the `abstract` keyword.
* **Abstract methods** can only be declared inside **abstract classes** or **interfaces**.
* An **abstract class** cannot be instantiated (no objects can be created from it).
* An **abstract method** cannot have a body (implementation) in the abstract class or interface—it must be implemented in a subclass.
* We use **abstract classes** when we want to provide a **base class with common features**, but also enforce that certain methods must be implemented by subclasses.

---

### Why don’t we want to create objects for an abstract class?

* Abstract classes often represent **generic concepts** that are incomplete on their own.
* For example, consider a class `Shape`. A `Shape` itself is too general to create an object from—it doesn’t make sense to have a “shape” without knowing whether it’s a circle, rectangle, or triangle.
* Instead, we use abstract classes as **blueprints** for more specific classes.
* Interfaces work in a similar way: when a class implements an interface, it **must provide implementations** for all of the abstract methods declared in that interface.

---

### Example:

```java
// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Concrete method (with body)
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Concrete subclass 2
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // ❌ Not allowed (abstract class)
        
        Shape circle = new Circle();
        circle.display();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.display();
        rectangle.draw();
    }
}
```

---

### Output:

```
This is a shape.
Drawing a Circle.
This is a shape.
Drawing a Rectangle.
```

---

In this example:

* `Shape` is **abstract** because we don’t want to create a generic "Shape" object.
* Subclasses (`Circle`, `Rectangle`) provide their own **implementation** of the `draw()` method.
* This demonstrates **abstraction**: we hide the common implementation inside the abstract class, and force subclasses to provide specific behavior.

[previous](javaabstraction1.md)
[next](javaarrays1.md)