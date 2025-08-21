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

![JVMArchitecture](./assets/JVMarchitecture.svg)  

## Classloader subsystem
### Loading:
During Loading, the **JVM** checks if the `.class` file can be located by the Bootstrap, Extension, and Application ClassLoaders (in a parent-delegation order). If none of them can find it, the **JVM** throws a `ClassNotFoundException` (or `NoClassDefFoundError` in some cases).  

### Linking:  
During **Linking**, the **JVM** ensures the loaded bytecode is safe and correct (*Verification*), allocates *memory* for static variables with default values (*Preparation*), and converts symbolic references into actual memory addresses (*Resolution*). If any check fails, the **JVM** throws a `VerifyError`.

### Initialization:
**Initialization** is the final step where the **JVM** assigns actual values to `static` variables and executes `static` blocks, preparing the class for use.

## Runtime data area
### Static and Instance variables:

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
    int jerseyNo;
    String name;
    int age;

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
![class object creation](./assets/ClassObjectCreation.svg)
6. here when we create another object to the same class, a copy of variables which is seperate from the first one is stored in the memory
```java
public class Cricketer {

    //instance variables
    int jerseyNo;
    String name;
    int age;

    public static void main(String[] args) {

        //creating an object *dhoni* for the class *Cricketer*
        Cricketer dhoni = new Cricketer(); 
        dhoni.name = "MS DHONI";
        dhoni.age = 43;

        //creating another object *kohli* for the same class
        Cricketer kohli = new Crickter();
        kohli.name = "KOHLI";
        kohli.jerseyNo = 18;
    }
}
```
![when two objects are created](./assets/anotherobject.svg)  
7. The `main()` method execution happens in the Stack Area, where a stack frame is created for it.  
8. All `static` methods (like main and others) are stored in the Method Area.  
9. When a `static` method is invoked (e.g., inside main), a stack frame for that method is pushed onto the Stack Area; once execution completes, the frame is unloaded from the stack.  
10. whenever you create an object for a class it will also loaded the **instance** methods of the into the heap memory in the same way it does for the variables.  
11. just creating an object for the class does not load the instance methods into the stack area, for that you will need to call those methods explicitly as we did with static methods but by using using the object's reference variable and after execution it will be removed from the stack area.  
## Execution engine:  
1. **Interpreter:**  
    - Reads bytecode instructions line by line and executes them.
    - It starts execution quickly since there’s no need for conversion into machine code in advance.
    - However, execution is slower overall because each instruction must be translated repeatedly each time it runs.

2. **JIT (Just-In-Time) Compiler:**
    - When the JVM notices that a method (or block of code) is being executed many times (a “hot spot”), it compiles that part of bytecode into native machine code.
    - Once compiled, the JVM can directly execute the native code, making repeated execution much faster than interpretation.

3. **Garbage Collector:**  
    - In Java, unused or unreferenced objects are called garbage. These objects still take up memory, even though the program no longer needs them.
    - In languages like C/C++, programmers must manage memory manually using special functions (like malloc and free) to allocate and release memory.
    - But in Java, the Garbage Collector (GC) automatically frees up memory by removing objects that are no longer in use. The JVM identifies such objects and clears them from memory, so developers don’t have to do it themselves.

    **How are objects are eligible for garbage:**  
    An object can become eligible for Garbage Collection in many situations, such as:
    1. When it is explicitly assigned to `null `.
    2. When one object reference is reassigned to another (the old one is no longer used).
    3. When objects are created inside methods (they are removed after the method finishes, if not returned).
    4. When using anonymous objects (objects without a reference).  
### TYPES OF GARBAGE COLLECTION:
1. **young generation (short lived objects):**
this is where new objects are initially allocated. it is designed for objects with short lifespans.  
structure:
    - *eden space:* this is where most new objects are created.
    - *survivor spaces*(`S0` and `S1`): these spaces hold objects that have survived minor garbage collection cycles.
2. **old generation (long lived objects):**
this generation stores objects that have survived multiple garbage collection cycles in the young generation, indicating they are likely to be long-lived.  
major garbage collection (also known as **full GC**) is performed less frequently in the old generation. it involves collecting unreachable objects from this generation.

3. **perm generation (also known as metaspace from 1.8 onwards):**
while not a primary focus, it's worth mentioning that some JVMs have a permanent generation (or metaspace in newer versions) that stores class metadata.  
***note:***  
class level objects can be created using `static` and these object reside in the permanent generation or metaspace.  
    ```java
    public class Main {

        // class level object
        static Main obj = new Main();
        public static void main(String[] args) {
            
        }
    }
    ```


### Hotspot heap structure
![heap structure](./assets/heapStructure.svg)

**example for manual garbage collection**
- Nullifying the objects:  
    `Main.java`  
    ```java
    public class Employee {
        public static void main(String[] args) {
            Employee emp1 = new Employee();
            // creating object 'emp1' for the 'Employee' class
            
            Employee emp2 = new Employee();
            System.out.println(emp2);
            // here the address of 'emp2' will be different from the address of 'emp1'

            System.out.println(emp1);
            // here we are printing the address of the object 
            // the output will look something like packagelocation.Employee@2341a43

            emp1 = null;
            // here we are explicitly assigning `null` to the object 'emp1'
            // and when an object is explicitly assigned `null` then it is eligible for garbage collection 

            System.out.println(emp2);
            // here after the object `emp1` is assigned `null` its original address is reused by the next object that is created 
        }
    }
    ```  
    **output:**  
    ```  
    packagelocation.Employee@2344af65
    packagelocation.Employee@314ge234
    packagelocation.Employee@2344af65
    ```  
- Explicity calling the `gc()` to run the garbage collector  
    `GCDemo.java`
    ```java
    public class GCDemo {
        public static void main(String[] args) {
            GCDemo obj1 = new GCDemo();
            GCDemo obj2 = new GCDemo();

            // Nullify references → eligible for GC
            obj1 = null;
            obj2 = null;

            // Request GC
            System.gc();

            System.out.println("End of main method");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Garbage Collector called and object destroyed");
        }
        // here the finalize() method is called whenever memory address  of one object is resigned to another object  
    }

    ```
    **output:**
    ```
    Garbage Collector called and object destroyed
    End of main method
    ```

- Ressigning the objects  
    ```java
    public class Employee {
        public static void main(String[] args) {
            Employee emp1 = new Employee();
            Employee emp2 = new Employee();
            System.out.println(emp1);
            System.out.println(emp2);

            emp2 = emp1 // assigning the reference address of emp1 to emp2
            // here the memory for the object `emp2` is eligible for gc after it gets assign the reference address of `emp1` 
            System.out.println(emp1);
            System.out.println(emp2);
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("finalize() was called");
        }
    }  
    ```  
    **output:**  
    ```
    packagelocation.Employee@2344af65
    packagelocation.Employee@314ge234
    finalize() was called
    packagelocation.Employee@2344af65
    packagelocation.Employee@2344af65
    ```

### Key questions on JVM: 
1. what are the key differences between `C`, `C++` and `Java` ? 
2. why we need to learn java when compare to other programming languages ?
3. why we need the **JVM** ?
4. explain about the **JVM** architecture with memory management ?
5. explain about the static vs instance variables and blocks  ?
6. what a class contains ?
7. what is static memory allocation ?
8. what is the difference between static memory allocation vs dynamic memory allocation ?
9. what about class, object ?
10. difference between interpreter vs **JIT** compiler ?
11. explain about difference types of class loaders ?
12. explain the differences between stack area vs heap area vs method area ?
13. what is thread in the view of **JVM** ?
14. explain about `main()` method ?
15. explain about `System`, `out`, `println()` ?
16. explain about **Java File Structure** ?
17. what are the Java features ?
18. what is compilation and execution ?
19. explain the terms source code vs byte code vs native code ?
20. explain the difference between **JRE** vs **JDK** vs **JVM** ?

