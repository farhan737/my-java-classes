# JAVA FUNDAMENTALS - 1  
## Identifiers  
1. identifiers are the names of a package, class, method, variable, interface, enum and arguements and so on.
2. identifiers can contain `A - Z`, `a - z` and `0 - 9` numbers.
3. identifiers should not contain special characters except `$` and `_`.
4. identifiers can not use any java keywords.
5. identifiers cannot start with any numbers.

examples for invalid identifiers:
```
student-name
1number
phone##
```

examples for invalid identifiers:
```
student_name
@email
phonenumber1_@
```

### Identifier rules:  
There are certain conventions for using identifiers. Even if an identifier follows the rules, there are still best practices that guide how we should name them.
```java
package com.langfunda;

public class Identifiers {
    int studentId;
    String studentName;
    int studentAge;
    int fee;
    long phone;

    public static void main(String[] args) {
        Identifiers i1 = new Identifiers();
        System.out.println(i1.studentName);
        System.out.println(i1.studentAge);
    }
}
```  
in the above example program there are 15 identifiers they are  
`com`, `langfunda`, `Identifiers`, `String`, `System`, `studentId`, `studentName`, `studentAge`, `fee`, `phone`, `main`, `args`, `i1`, `out`, `println`
#### Package names:  
- packages are the primary folder structure that we use in java, package names generally consists of small letters and no capital letters 
    **example:**
    ```java
    com.langfundaments
    in.farhan
    net.nizam
    ``` 
- package names are generally consists the reverse of the domain name that the organization is using.
- package name can also consist numbers.

#### addtional points:
- we need follow `cammelCase` when naming variables.  
    **example:**
    ```java
    int studentId;
    String studentName;
    ```
- we need to start class, enum and interface names with a capital letters
    ```java
    class User {}
    interface Banking {}
    enum Numbers {}
    ```

## Java Keywords
### datatypes `8` 
- to store integer values we use these keywords `byte`, `short`, `int`, `long`  
- to store floating point values we use these keywords `float`, `double`  
- to store single character we use this keyword `char`  
- to store single boolean value we use this keyword `boolean`  
### application level `15`  
- ***top level:*** `2`
    - `package` is the keyword to create directory structure to maintain all the classes and interfaces together.
    - `import` is the keyword that will allow us to access enums, classes and interfaces from one package to another package. 
- ***class level:*** `5`
    - `class` is the keyword that we need to use in order to create classes, it is a blueprint of a object
    - `interface` is the keyword that we need to use in order to create interfaces, it is the blueprint of a class and it is also the **SRS**(Service Requirement Specification) of a class and it does not have any implementation in it.
    - `enum` is the keyword that we need to use in order to create enums, and they are use for storing constant values.
    - `new` is the keyword that we use to create objects for a class.
    - `instanceof` is the keyword that we use to check the reference of an object. 
- ***method level:*** `3`
    - `void` if a method in java is not supposed to return any value after it is called then we use this keyword.
    - `return` we use this keyword to specify which value a method is returning.
    - `var` keyword allows you to declare a local variable without explicitly specifying its type, as the compiler infers the type from the assigned value. `var` can only be used inside methods, constructors and blocks.
- ***OOPS concepts:*** `5` 
    - `this` is used to access datamembers of the current class. `this()` is used to explicitly refer the current class constructor.
    - `super` is used to access datamembers of the super class of current class. `super()` is usedd to explicitly refer to the super class constructor of the current class.
    - `extends` is the keyword that is used to specify the parent class which the child class is going to inherit.
    - `implements` is the keyword that is used to specify the interface which a class is going to implement.
    - `assert` is the keyword which is used for the validation/assertion of test cases.  
### access modifiers and modifiers `12`
- ***access modifiers:*** `4`
    - `private` is a keyword used only for data members and is illegal for classes and interfaces, when we use `private` keyword for a data member it can only be accessed within the class, outside the class these data members are not visible.
    - `<default>` or `undefined` is not a keyword that is used explicitly but it is implicitly the default access type for classes and its data member. in `<default>` classes its data members are accessible within the package.
    - `protected` is a keyword only used for data members and not used for class and interfaces. a `protected` data member of a classes can only accessed within the class and the child classes that extend the class.
    - `public` is can be used by classes, interfaces and the data members, when we use `public` keyword for a data member it can be accessed any where inside the project.
- ***modifiers:*** `8`
    - `abstract` is a keyword that can be used for abstraction of classes, interfaces, data members(for methods). such classes, interfaces and methods which were defined by `abstract` keyword don't have the implementation.
    - `static` is used for data members, blocks and inner classes and is illegal to be used along with classes or interfaces, we use `static` keyword for to define data members for which we want their behaviour to be same across the class and its objects.
    - `strictfp`(deprecated since Java 17) is used for classes, interfaces, and methods to ensure that floating-point calculations (using float and double) are performed in a strict, portable, and predictable way across all platforms, forces Java to follow the **IEEE 754** standard strictly, so results are consistent everywhere.
    - `synchronized` is the keyword used to control thread access to a block of code or method, ensuring that only one thread at a time can execute that piece of code on the same object. It helps prevent **race conditions** in multithreaded programs.
    - `final` is used with class and data members, when `final` keyword is used for a class it is no longer possible for another class to extend it and when it is used with data members its no longer possible to change the behaviour of that particular data member during execution (for `final` methods they cannot be overriden and for `final` variable we cant ressign another value to it). 
    - `transient` when an object is serialized (converted into a byte stream for saving to a file, sending over a network, etc.), normally all fields are stored. but sometimes, you don’t want certain fields (like passwords, sensitive info, or temporary data) to be saved. For that, you mark them as `transient`.
    - `volatile` ensures that a variable is always read from and written to main memory, making its latest value visible to all threads.
    - `native` is used to call non-Java (C/C++) code from Java using JNI.  
### exception handling `5`
- `try` block is used to wrap code that has the potential to cause an exception during runtime. Instead of letting the program crash, Java allows you to test risky code inside a `try` block. If something goes wrong, the control will immediately shift to the corresponding `catch` block.
- `catch` block is used to handle exceptions that occur inside the `try` block. Each `catch` block can handle a specific type of exception, and multiple catch blocks can be written to handle different types of errors.
- `finally` block contains code that always executes, regardless of whether an exception was thrown or not. It is typically used for cleanup operations such as closing files, releasing database connections, or freeing other resources. Even if you use return or an exception is thrown, the `finally` block will still run.
- `throw` keyword is used when you want to manually generate an exception inside your program. It is followed by an exception object. This is often used for custom validation or business rules where you want to signal an error condition explicitly.
- `throws` keyword is used in the method declaration to indicate that the method might throw certain exceptions during execution. This doesn’t handle the exception itself but instead tells the caller, “Be prepared to handle these exceptions.” The caller of the method is then responsible for handling or further propagating the exception.  
### logical statements `14`
- ***conditional statements:*** `2`   
    - `if`
    - `else`
- ***switch case*** `4`
    - `switch`
    - `case`
    
- ***loop statements*** `3`
    - `for`
    - `while`
    - `do`
- ***control transfer statements:*** `5`
    - `break` exits from the nearest loop (`for`, `while`, `do-while`) or a `switch` statement immediately. control jumps to the first statement after the loop/switch.  
    - `default` used inside a switch statement. executes when none of the `case` labels match the given expression. 
    - `continue` skips the current iteration of a loop and jumps to the next one. does not terminate the loop, just skips ahead.
    - `goto` this keyword was just reserved keyword in java and was deliberately disabled by the java designer as it makes code harder to maintain.
    - `const` also a reserved keyword in java, but it is not used. instead of const, java uses `final` to declare constants.

[next](javafundamentals2.md)
[previous](javaintroduction2.md)