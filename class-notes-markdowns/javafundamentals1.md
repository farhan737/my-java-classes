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
there is ethics of using different identifiers. even though if a identifier satisfy the rules there are still some ethics on how we write identifiers.
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
**integer**: to store integer values we use these keywords  
`byte`, `short`, `int`, `long`  
**floating point values**: to store floating point values we use these keywords  
`float`, `double`  
**character**: to store single character we use this keyword  
`char`  
**boolean values**: to store single boolean value we use this keyword  
`boolean`  
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
### access modifiers and modifiers 
- ***access modifiers:*** `4`
    - `private` is a keyword used only for data members and is illegal for classes and interfaces, when we use `private` keyword for a data member it can only be accessed within the class, outside the class these data members are not visible.
    - `<default>` or `undefined` is not a keyword that is used explicitly but it is implicitly the access type for classes and its datam ember. in `<default>` classes its data members are accessible within the package.
    - `protected` is a keyword only used for data members and not used for class and interfaces. a `protected` data member of a classes can only accessed within the class and the child classes that extend the class.
    - `public` is can be used by classes, interfaces and the data members, when we use `public` keyword for a data member it can be accessed any where inside the project.
- ***modifiers:*** 
    - `abstract` is a keyword that can be used for abstraction of classes, interfaces, data members(for methods). such classes, interfaces and methods which were defined by `abstract` keyword don't have the implementation.
    - `static` is used for data members, blocks and inner classes and is illegal to be used along with classes or interfaces, we use `static` keyword for to define data members for which we want their behaviour to be same across the class and its objects.
