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
