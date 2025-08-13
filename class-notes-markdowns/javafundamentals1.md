# JAVA INTRODUCTION - 1  
### What is Java?  
Java is simple, high-level, platform independent, robust, secure, multi-threadedd and object-oriented programming language.

### What is JDK?  
**JDK** stands for **Java Development Kit**. We need JDK to develop Java Applications in our system.  
### What is JRE?  
**JRE** stands for **Java Runtime Environment**. This has a Library of classes to help us develop applications.  
### What is JVM?  
**JVM** stands for **Java Virtual Machine**. It is the environment to execute java programs in out system. **execution** means converting **byte code** into OS specific **native code**.  
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
*example 1:*
```java
    int a = 10;
```  
*example 2:*
- here **10** is the value that is being storing in the variable **a**.
```java
    String name = "Farhan";
```
- here **Farhan** is the value and **name** is the variable.
- another key point here is we are using **=** to assige the variable to the value so we call it an assignment operator **equals to** (=).  
### what is a method?
method is a block of statements for a ***task specific*** program.  
*example:*
```java
    void display() {
        statements;
    }
```  
### what is a block?
a block is a collection or group of statements.

*static block example:*
```java
    static {

    }
```  
*instance block example:*
```java
    {
        
    } //its simply just a set of curly braces 
```  
#### difference between a method and a block 
- methods should be called explicitly
- blocks will be loaded without calling  
### java is high-level language:
- **high-level language** like java cannot be directly understood by the **operating system**. if we want the operating system to understand the java code first we need convert the high-level java code to **machine level code** or **native code.**  

#### key points to know before trying to run a java program:
- the file extension for java programs is **.java**.  
example: ```Banking.java```, ```Users.java``` 
- to run or execute a java program we need to first compile the java program.  
**Compilations:** it is the process converting source code into byte code.  
**Executions:** it is the process of converting byte code into native code *(Operating System specific)*.  
**syntax:**  
```java
javac <classname>.java
```
**example:**
```java
javac Banking.java
```  
- finally to execute the program we do it by.  
**syntax:**
```java
java <classname>
```  
**example:**
```java
java User
```

### Example java program to print `hello world!!`  
`Main.java`
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!!");
    }
}
```

**compilations and execution**:
```java
> javac Main.java
> java Main
> hello world!!
```  
### key points and observations: 
1. class name here is Main in the line  
`public class Main {}`
2. inside the class block there is main() method in the line  
`public static void main(String[] args) {}` 
3. the `main()` method is crucial for executing a java program.

### key question here:  
1. what is the `main()` method?  
**answer:**  
    - the `main()` method is the entry point for a java program.   
    - without the `main()` method there is no chance of executing a java program.  
    - a program can still compile without a `main()` method.  
    - trying to execute a program without having a `main()` will result in a compile time error.  
2. why do we need the `main()` method?  
**answer:**
    - in the **JVM**, java configured the `main()` method for executing the program. 
3. what is  `System`, `out`, `println` ?  
**answer:**
    - `System` is a **pre-defined class** in `java.lang` package.
    - `out` is a **static reference variable** from the `System` class.
    - `println()` is a method from the `PrintStream` class.

### key points about class, objects and references:
1. a **reference** is the address of an **object.**
2. an **object** is a real-time entity of a **class.** 
3. a **class** is a blueprint of an **object**, meaning its the plan or design or overview or architecture or template of its **objects.** 