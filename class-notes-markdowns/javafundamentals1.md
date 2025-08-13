# JAVA INTRODUCTION - 1

### What is JDK?

**JDK** stands for **Java Development Kit**. We need JDK to develop Java Applications in our system.

### What is JRE?

**JRE** stands for **Java Runtime Environment**. This has a Library of classes to help us develop applications

### What is JVM?

**JVM** stands for **Java Virtual Machine**. It is the environment to execute java programs in out system. **execution** means converting **byte code** into OS specific **native code**

#### JDK = JRE + JVM

![Architecture](architecture.svg)

### What does a class contain?
firstly a  class contains 
1. **data members** (variables + methods)
    1. *static* data members (static variables + static methods)
    2. *instance* data members (instance variables + instance methods)
2. **blocks**
    1. *static* blocks
    2. *instance* blocks
3. **constructors**
    1. *default* constructors
    2. *no-arg* constructors 
    3. *parameterised* constructors

    **note concepts**
    - constructor chaining
    - copy constructor
4. **inner classes**
5. **interfaces**


### What is variable?
variable is a container to store a single value 

```java
    int a = 10;
```
