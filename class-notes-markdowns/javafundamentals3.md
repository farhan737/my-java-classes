# JAVA FUNDAMENTALS - 3

## 2. Object Datatypes

In Java, **object datatypes** are non-primitive data types that store references (addresses) instead of raw values. They provide more functionality than primitive types and are often used in collections, APIs, and OOP concepts.

---

### **Predefined Object Datatypes**

* **String** → represents a sequence of characters.
* **BigInteger** → used for very large integer values beyond the range of `long`.
* **BigDecimal** → used for high-precision decimal calculations (like money).

---

### **Wrapper Object Datatypes**

Each primitive datatype has a corresponding wrapper class:

<table border="1" cellpadding="8" cellspacing="0">
  <thead>
    <tr>
      <th>Primitive</th>
      <th>Wrapper Class</th>
    </tr>
  </thead>
  <tbody>
    <tr><td>byte</td><td>Byte</td></tr>
    <tr><td>short</td><td>Short</td></tr>
    <tr><td>int</td><td>Integer</td></tr>
    <tr><td>long</td><td>Long</td></tr>
    <tr><td>float</td><td>Float</td></tr>
    <tr><td>double</td><td>Double</td></tr>
    <tr><td>char</td><td>Character</td></tr>
    <tr><td>boolean</td><td>Boolean</td></tr>
  </tbody>
</table>


✅ Wrappers allow primitives to be used as objects (e.g., in collections like `ArrayList`).

---

### **Code Example**

```java
import java.math.BigInteger;
import java.math.BigDecimal;

public class Datatypes {
    public static void main(String[] args) {
        // Predefined object datatypes
        String name = "farhan"; 
        BigInteger bi = new BigInteger("12345678901234567890");
        BigDecimal bd = new BigDecimal("12345.6789");

        // Wrapper object datatypes
        Byte smallNumber = 120;         // byte → Byte
        Short shortNumber = 1224;       // short → Short
        Integer num = 100000;           // int → Integer
        Long bigNumber = 9876543210L;   // long → Long
        Float decimalNumber = 12.34f;   // float → Float
        Double bigDC = 12345.678;       // double → Double
        Character ch = '@';             // char → Character
        Boolean flag = true;            // boolean → Boolean

        // Autoboxing (primitive → wrapper)
        Integer autoBox = 25;   // compiler converts int to Integer
        // Unboxing (wrapper → primitive)
        int unBox = autoBox;    // compiler converts Integer to int
    }
}
```

---

### **Autoboxing and Unboxing**

* **Autoboxing** → automatic conversion of a primitive type into its wrapper class.

  ```java
  Integer x = 10; // int → Integer
  ```
* **Unboxing** → automatic conversion of a wrapper class back to its primitive type.

  ```java
  int y = x; // Integer → int
  ```

🔹 Introduced in **Java 5**.
🔹 Mostly happens when using collections (like `ArrayList<Integer>`).

---

### **Key Points about String**

1. Strings are **immutable** → once created, their value cannot be changed.

   ```java
   String s = "hello";
   s.concat(" world"); // creates new object, doesn't change original
   ```
2. Stored in a special area called the **String Pool** (to optimize memory).
3. Use `StringBuilder` or `StringBuffer` for **mutable strings** (when frequent modifications are needed).
4. Comparison:

   * `==` → checks reference (memory address).
   * `.equals()` → checks content/value.

---

### **Extra Points You Missed**

* **Nullability** → Unlike primitives, wrapper classes and Strings can be `null`.
* **Default values**:

  * Primitive → default is 0 / false.
  * Object datatypes → default is `null`.
* Wrappers implement **Comparable**, useful for sorting.
* Useful utility methods:

  ```java
  Integer.parseInt("123");   // String → int
  String.valueOf(45);        // int → String
  ```

