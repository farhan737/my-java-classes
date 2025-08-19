# JAVA INTRODUCTION - 2 

## the JVM architecture and how its works internally
JVM is responsible for executing the java programs.
`.class` file ⟶ **JVM**
1. **classloader sub-system**   
    1. loading  
        1. bootstrap classloader.
        2. extension classloader.
        3. application classloader.
    2. linking  
        1. verify
        2. prepare
        3. resolve
    3. initialization  
2. **memory management**  
    1. method area
    2. heap area
    3. stack area    
    4. PC register
    5. native method stack area
3. **execution engine**
    1. interpreter
    2. **JIT**(Just In Time) compiler
    3. garbage collector
4. **JNI (Java Native Interfaces)**
5. **native method libraries**

![JVMArchitecture](JVMarchitecture.svg)  

### Loading:
During Loading, the **JVM** checks if the `.class` file can be located by the Bootstrap, Extension, and Application ClassLoaders (in a parent-delegation order). If none of them can find it, the **JVM** throws a `ClassNotFoundException` (or `NoClassDefFoundError` in some cases).  

### Linking:  
During **Linking**, the **JVM** ensures the loaded bytecode is safe and correct (*Verification*), allocates *memory* for static variables with default values (*Preparation*), and converts symbolic references into actual memory addresses (*Resolution*). If any check fails, the **JVM** throws a `VerifyError`.

### Initialization:
**Initialization** is the final step where the **JVM** assigns actual values to `static` variables and executes `static` blocks, preparing the class for use.

## Static and Instance variables:

example code:  
`Cricketer.java`  
```java
public class Cricketer {

    //instance variables
    int jerseyNo;
    String name;
    int age;

    //static variables
    static int countryId;
    static int countryName;
    public static void main(String[] args) {

    }
}
```

here the variables that are outside the `main()` method are called **global** variables and the variables that are inside the `main()` are called **local** variables.  
- the process of defining the various variables with its datatypes is called **declaration** 

***Comments**
```java 
// this is how you write comments in java.
// this is does not effect the code in any way.
```  
comments are simply ignored by the JVM during code compilation.

- after **declaration** assigning value to these variables is called **initialization** 


### what happens when you use a variable that is not initialized with any data?

```java 
public class Details {

    // declaring static variables here 
    static int age;
    static String name;
    static int phoneNumber;
    public static void main(String[] args) {
        // accessing the static variables here
        System.out.println("main method started");
        System.out.println(Details.age);
        System.out.println(name)
        System.out.println(phoneNumber);
    }
}
```
if we run the above code the output will be:
```
main method started
0
null
0
```
In Java, during the **Initialization** step, the **JVM** assigns the explicit values given to static variables (e.g., `static int x = 10;`) and executes `static { }` blocks; default values for uninitialized variables are already handled in the **Preparation** step. 


### accessing static variables:
example:

```java
public class Cricketer {

    //instance variables
    int jerseyNo = 7;
    String name = "MS Dhoni";
    int age = 60;

    //static variables
    static int countryId = 91;
    static int countryName = "India";
    public static void main(String[] args) {
        //accessing static variables
        System.out.println(Cricketer.countryId);
        System.out.println(Cricketer.countryName);
    }
}
```
in a class, `static` variables can be accessed with or without using class name inside that particular class if we are trying to access `public static` variables we need to use the class name for that `static` variable

### accessing instance variables:
example:
```java
public class Cricketer {

    //instance variables
    int jerseyNo = 7;
    String name = "MS Dhoni";
    int age = 60;

    public static void main(String[] args) {

        //creating an object *dhoni* for the class *Cricketer*
        Cricketer dhoni = new Cricketer(); 

        //initializing instance variables
        dhoni.name = "MS DHONI";
        dhoni.age = 50;

        //accessing instance variables
        System.out.println(dhoni.name);
        System.out.println(dhoni.age);
    }
}
```
output:
```
MS DHONI
50
```

#### key points about instance variables:  
1. During the Loading stage, all static data members of a class are stored in the **Method Area.** 
2. When an object of the class is created, its instance data members (non-static variables) are stored in the **Heap Area.**
3. after creating an object for the class we are going to the object reference variable to access the instance datamembers.
4. The data initialized through an object belongs specifically to that object; hence, different objects can hold different values for the same instance variable.
5. if as a requirement we don't want the data to change from one object to another object we will use `static` variables an `static` methods instead of instance variables and methods.

![class object creation](ClassObjectCreation.svg)

