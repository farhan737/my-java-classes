# JAVA FUNDAMENTALS - 4

## Literals

A **literal** in Java is a fixed constant value that is directly written in the code and assigned to a variable.
They represent the actual values that variables can hold.

---

### **Types of Literals in Java**

#### 1. **Integer Literals**

* Whole numbers (without decimal).
* Can be written in **decimal, binary, octal, or hexadecimal** form.
* By default, integer literals are of type **int**.
* Use suffix `L` or `l` for **long**.

```java
int decimal = 100;        // Decimal (base 10)
int binary = 0b1010;      // Binary (base 2, prefix 0b)
int octal = 0123;         // Octal (base 8, prefix 0)
int hex = 0x1A;           // Hexadecimal (base 16, prefix 0x)
long bigNum = 123456789L; // Long literal
```

---

#### 2. **Floating-point Literals**

* Numbers with decimal points or exponential notation.
* By default, floating literals are of type **double**.
* Use suffix `F` or `f` for **float**, `D` or `d` for **double** (optional).

```java
double d1 = 123.45;     // double by default
float f1 = 123.45f;     // float literal
double exp = 1.23e3;    // exponential notation (1.23 × 10^3 = 1230.0)
```

---

#### 3. **Character Literals**

* A single character enclosed in **single quotes (' ')**.
* Can also use **Unicode, octal, or escape sequences**.

```java
char c1 = 'A';        // simple char
char c2 = '\u0041';   // Unicode for 'A'
char c3 = '\n';       // escape sequence (newline)
char c4 = 65;         // ASCII value → 'A'
```

---

#### 4. **String Literals**

* A sequence of characters enclosed in **double quotes (" ")**.
* Stored as `String` objects in the **String Pool**.

```java
String name = "Farhan";
String empty = "";   // empty string
```

---

#### 5. **Boolean Literals**

* Only **two values**: `true` or `false`.

```java
boolean flag1 = true;
boolean flag2 = false;
```

---

#### 6. **Null Literal**

* Represents the **absence of value** for any object reference.
* Cannot be assigned to primitive types.

```java
String str = null;
Integer num = null;
```

---

### **Special Points about Literals**

1. **Underscores in numbers** (since Java 7):

   ```java
   int num = 1_000_000;   // improves readability
   double pi = 3.14_159;
   ```
2. **Type suffixes**:

   * `L/l` → long
   * `F/f` → float
   * `D/d` → double (optional)
3. **Escape sequences for characters**:

   * `\n` → newline
   * `\t` → tab
   * `\\` → backslash
   * `\'` → single quote
   * `\"` → double quote

---

✅ **Summary Table**
<table border="1" cellspacing="0" cellpadding="8">
  <tr>
    <th>Type</th>
    <th>Example</th>
    <th>Notes</th>
  </tr>
  <tr>
    <td>Integer</td>
    <td><code>10</code>, <code>0b1010</code>, <code>0123</code></td>
    <td>Default → int</td>
  </tr>
  <tr>
    <td>Long</td>
    <td><code>123456789L</code></td>
    <td>Needs L</td>
  </tr>
  <tr>
    <td>Float</td>
    <td><code>12.34f</code></td>
    <td>Needs f</td>
  </tr>
  <tr>
    <td>Double</td>
    <td><code>12.34</code>, <code>1.2e3</code></td>
    <td>Default → double</td>
  </tr>
  <tr>
    <td>Character</td>
    <td><code>'A'</code>, <code>'\u0041'</code>, <code>65</code></td>
    <td>Single quotes</td>
  </tr>
  <tr>
    <td>String</td>
    <td><code>"Farhan"</code></td>
    <td>Double quotes</td>
  </tr>
  <tr>
    <td>Boolean</td>
    <td><code>true</code>, <code>false</code></td>
    <td>Logical values</td>
  </tr>
  <tr>
    <td>Null</td>
    <td><code>null</code></td>
    <td>For objects only</td>
  </tr>
</table>

---

👉 Do you want me to also make a **mind map-style diagram (markdown-friendly)** for literals like you asked earlier for identifiers, or just keep it as a text + table format?
