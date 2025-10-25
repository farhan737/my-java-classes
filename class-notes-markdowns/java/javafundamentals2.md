# JAVA FUNDAMENTALS - 2   
## Datatypes  
in java we have two types of **datatypes**
#### 1. **primitive datatypes**  
`byte`, `short`, `int`, `long`, `float`, `double`
#### 2. **non-primitive datatypes or object datatypes**
- *predefined object datatypes*   
`String`, `Arrays`, `StringBuffer`, `StringBuilder`, `Math`
- *wrapper object datatypes*  
for each and every primitive datatype we have a class in `java.lang` package  
we need wrapper object datatypes majorly to work with collections  
`Byte`, `Short`, `Integer`, `Long`, `Float`, `Double`, `Character`, `Boolean`.
- *user-defined object datatypes*  
these are just the classes that are created by the user.

### 1. primitive datatypes  
`Main.java`  
```java
public class Main {
    byte oneByte;
    short oneShort;
    int oneInteger;
    long oneLong;
    float oneFloat;
    double oneDouble;
    char oneCharacter;
    boolean oneBoolean;
    public static void main(String[] args) {
        Main m1 = new Main();
        System.out.println(m1.oneByte);
        System.out.println(m1.oneShort);
        System.out.println(m1.oneInteger);
        System.out.println(m1.oneLong);
        System.out.println(m1.oneFloat);
        System.out.println(m1.oneDouble);
        System.out.println(m1.oneCharacter);
        System.out.println(m1.oneBoolean);
    }
}
```  
the output will be:
```
0
0
0
0
0.0
0.0

false
```  
***note:***  
It is important to note that when we create an object of a class, the instance variables (fields) of primitive data types are automatically assigned default values by the JVM if no explicit value is provided. However, this does not apply to local variables inside methods such as `main()`. For local variables, the JVM does not assign any default value, and they must be explicitly initialized before use, otherwise a compilation error will occur.  

### variable size and range for every primitive data type

<table border = 1>
  <tr>
    <th>Data Type</th>
    <th>Bytes</th>
    <th>Range Formula</th>
    <th>Actual Range</th>
  </tr>
  <tr>
    <td>byte</td>
    <td>1</td>
    <td>-2<sup>7</sup> to 2<sup>7</sup>-1</td>
    <td>-128 to 127</td>
  </tr>
  <tr>
    <td>short</td>
    <td>2</td>
    <td>-2<sup>15</sup> to 2<sup>15</sup>-1</td>
    <td>-32,768 to 32,767</td>
  </tr>
  <tr>
    <td>int</td>
    <td>4</td>
    <td>-2<sup>31</sup> to 2<sup>31</sup>-1</td>
    <td>-2,147,483,648 to 2,147,483,647</td>
  </tr>
  <tr>
    <td>long</td>
    <td>8</td>
    <td>-2<sup>63</sup> to 2<sup>63</sup>-1</td>
    <td>-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807</td>
  </tr>
  <tr>
    <td>float</td>
    <td>4</td>
    <td>IEEE 754 (32-bit)</td>
    <td>±3.40282347E+38 (≈6–7 decimal digits)</td>
  </tr>
  <tr>
    <td>double</td>
    <td>8</td>
    <td>IEEE 754 (64-bit)</td>
    <td>±1.79769313486231570E+308 (≈15 decimal digits)</td>
  </tr>
  <tr>
    <td>char</td>
    <td>2</td>
    <td>0 to 2<sup>16</sup>-1</td>
    <td>0 to 65,535 (Unicode)</td>
  </tr>
  <tr>
    <td>boolean</td>
    <td>~1 (JVM dependent)</td>
    <td> </td>
    <td>true or false</td>
  </tr>
</table>

### how to assign values to a variable
```java
byte bInteger = 120;
short sInteger = 3000;
int integer = 2000000;
long lInteger = 23040020201L; // we can also use small `l` at the end here 
float floating = 2.142F; // we can also use small `f` at the end here
double dFloating = 3124.1245235D; // we can use `d` or completely skip the letter at the end. 
```

### how a number is stored inside a number datatype  
![how it is stored inside byte](./assets/bytestorage.svg)
for negative values 2's compliment is applied and the 8th bit for byte is the MSB(Most Significant Bit).
### type casting:  
we can type cast meaning convert a value from one datatype to other.
#### implicit type casting:  
- for integer and floating point datatypes a lower range datatype can implicitly type casted to higher range datatype.
  ```java
  // for integer datatypes
  int a = 20;
  long b = a; // here `a` is getting implicitly type casted from int to long
  byte c = 120;
  short d = c; // here `c` is getting implicitly type casted from byte to short  
  ```  
  ```java
  // for floating point datatypes
  float a = 3.14f;
  double b = a; // here the float `a` is getting implicitly type casted to double 
  ```
- it is not possible to type cast a boolean value to any other datatype
- type casting a character to a integer databyte results in its **ACSII** value  
  example:
  ```java
  char a = 'A';
  int b = a;
  System.out.println(b);
  ```
  output:
  ```
  65
  ```
- *note:* by default the integer literal values are of type `int` so when we assign a integer value to a datatype variable the compiler checks if the value is in the range of the taken datatype and narrow it down to that datatype.  
  example:
  ```java
  byte num = 20: // here the literal 20 is if `int` datatype
  // as 20 is with in the range of a `byte` it is narrowed down by the compiler 
  ```
- *note:* by default floating point literal is of the type `double` and if we try to store a floating point value without explicitly adding the `F`/`f` at the end here the compiler interprets this as a `double` literal being stored in to a `float` variable which is not possible without explicit typecasting.  
  ```java
  float num = 3.2532; // this is the wrong way to assign a value to a float
  float num = 3.2532F; // this is the correct way 
  ```  
#### explicit typecasting:
- explicit typecasting is the process of casting a higher range value to lower range datatype variable.
examples:
  ```java
  int num1 = 120;
  byte num2 = (byte) num1; // here the variable `num1` of `int` type is explicitly typecasted to `byte`.


  long num3 = 1223343L;
  int num4 = (int) num3; // here the variable `num3` of `long` type is explicitly type casted to `int`.

  double float1 = 123.1324215213;
  float float2 = (float) float1; // same here.
  ```  
- *warning:* Lossy type casting occurs when a value is converted to a smaller data type that cannot fully represent it, causing data loss.  
example representation diagram:
![lossy typecasting](<assets/Lossy conversion.svg>)

[previous](javafundamentals1.md)
[next](javafundamentals3.md)
