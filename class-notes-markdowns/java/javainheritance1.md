# JAVA OOPS (ENCAPSULATION AND INHERITANCE) INTRODUCTION

## 1. WHY ?  
- the way of writing code in structured mannar.
- the benefits like modularity, flexibility, reusability, security and for loosely coupling.
## 2. WHAT ?
- object oriented programming consists of key coding concepts like
    1. encapsulation
    2. abstraction
    3. inheritance
    4. polumorphism

### 1. Encapsulation:
- encapsulation is the concept of binding up/bundling up of datamembers with its related functionality, this may be a class or a package.
- grouping of similar related functions and its related data in one play for better readability of code.  
- we combine data hiding and abstraction to achieve modularity.
### `Student.java`

```java
package farhan.encapsulation;

public class Student {
    // private fields (data hiding)
    private String name;
    private int age;

    // public getter method for name
    public String getName() {
        return name;
    }

    // public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // public getter method for age
    public int getAge() {
        return age;
    }

    // public setter method for age
    public void setAge(int age) {
        if (age > 0) {  // validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}
```

---

### `EncapsulationExample.java`

```java
package farhan.encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        // setting values using setter methods
        s1.setName("Farhan");
        s1.setAge(21);

        // getting values using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        // trying invalid input
        s1.setAge(-5);
    }
}
```
- encapsulation is also crucial for providing controlled access to the sensitive data-members of a class.

### 2. Inheritance:
- the main purpose of inheritance is reusability of the code.
- we use the concept of inheritance for getting the data members and functionalities from one class and for adding more or extending the functionalities of the class that we are trying to inherit (parent class).
- we use the `extends`keyword to extend a parent class.
example: 
```java
// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited method from Animal
        d.bark(); // Dog's own method
    }
}
 
```

### key thought with inheritance:
**Question:** Why do we need to go through inheritance to access one class’s data members in another class? What is the difference between accessing one class’s data members into another class and inheritance?

**Answer:**

* The reason we use inheritance is to **reduce object creation** of one class just to access its data members.
* **For what:** It allows **code reusability** and establishes an **"is-a" relationship** between classes.

  * Example: `Student extends Person` → a Student *is a* Person.
  * The subclass automatically gets the parent’s data members without needing separate objects.
* On the other hand, if we simply access another class’s members using objects (without inheritance), it creates a **"has-a" relationship** (composition/association).

  * Example: `Car has an Engine`.
  * Here, you explicitly create an object of Engine inside Car to use it.

---
**Key difference**

* **Inheritance**: promotes **code reusability**, avoids redundant object creation, builds "is-a" relationship.
* **Access via objects (composition/association)**: promotes **flexibility**, models "has-a" relationship, but requires explicit object creation.


#### types of inheritance:
1. Single Inheritance.
2. Multi-Level Inheritance.
3. Multiple Inheritance.**
4. Heirarchial Inheritance.
5. Cyclic Inheritance.**  
** Multiple Inheritance is not possible in jave using the conventional method but we can achieve multiple inheritance in java using interfaces, cyclic inheritance is not possible in java.

All user-defined classes in java implicitly extend the `Object` class and if a user-defined class already extends a parent class then that parent class extends the object class implicitly and provides the child class access to the `Object` class. the `Object` class is the root of the class heirarchy is the super class for all classes in java.

### more about `Object` class:
the `Object` class has a total of 11 methods and only one no-arguement constructor.
1. `protected Object clone()` - Creates and returns a copy of this object.

2. `boolean equals(Object object)` - Indicates whether some other object is "equal to" this one.

3. `protected void finalize()` - Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.  

4. `Class<?> getClass()` - Returns the runtime class of this Object.(fully qualified name of the class)

5. `int hashCode()` - Returns a hash code value for the object.

6. `void notify()` - Wakes up a single thread that is waiting on this object's monitor.

7. `void notifyAll()` - Wakes up all threads that are waiting on this object's monitor.

8. `String toString()` - Returns a string representation of the object.

9. `void wait()` - Causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object.

10. `void wait(long timeout)` - Causes the current thread to wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.

11. `void wait(long timeout, int nanos)` - Causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object, or some other thread interrupts the current thread, or a certain amount of real time has elapsed.
