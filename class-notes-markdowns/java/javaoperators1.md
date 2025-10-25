# JAVA OPERATORS - 1

Java operators are special symbols that perform operations on variables and values. They are fundamental in programming for manipulating data.

## Types of Operators in Java

Java operators are grouped into several types based on their functionality:

<table border = 1s>
  <thead>
    <tr>
      <th>Operator Type</th>
      <th>Examples</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Arithmetic Operators</td>
      <td>+, -, *, /, %</td>
      <td>Perform mathematical operations like addition, subtraction, multiplication, division, and modulus.</td>
    </tr>
    <tr>
      <td>Unary Operators</td>
      <td>+, -, ++, --, !</td>
      <td>Operate on a single operand to perform operations such as increment, decrement, or logical NOT.</td>
    </tr>
    <tr>
      <td>Assignment Operators</td>
      <td>=, +=, -=, *=, /=, %=</td>
      <td>Assign values to variables with support for shorthand operations (e.g. += means add then assign).</td>
    </tr>
    <tr>
      <td>Relational Operators</td>
      <td>==, !=, >, <, >=, <=</td>
      <td>Compare two values and return a boolean result.</td>
    </tr>
    <tr>
      <td>Logical Operators</td>
      <td>&&, ||, !</td>
      <td>Combine boolean expressions to form complex conditions.</td>
    </tr>
    <tr>
      <td>Ternary Operator</td>
      <td>? :</td>
      <td>Short form of if-else statement to choose between two values based on a condition.</td>
    </tr>
    <tr>
      <td>Bitwise Operators</td>
      <td>&, |, ^, ~</td>
      <td>Perform operations on bits and bit values.</td>
    </tr>
    <tr>
      <td>Shift Operators</td>
      <td>&lt;&lt;, &gt;&gt;, &gt;&gt;&gt;</td>
      <td>Shift bits of a value to the left or right by a specified number.</td>
    </tr>
  </tbody>
</table>

## Common Arithmetic Operators Examples  

### 1. **Arithmetic Operators**

```java
int a = 10, b = 3;
System.out.println(a + b);  // 13
System.out.println(a - b);  // 7
System.out.println(a * b);  // 30
System.out.println(a / b);  // 3
System.out.println(a % b);  // 1
```

---

### 2. **Unary Operators**

```java
int x = 5;
System.out.println(+x);   // 5
System.out.println(-x);   // -5
System.out.println(++x);  // 6 (pre-increment)
System.out.println(x++);  // 6 (post-increment, then x=7)
System.out.println(--x);  // 6 (pre-decrement)
System.out.println(x--);  // 6 (post-decrement, then x=5)
System.out.println(!true); // false
```

---

### 3. **Assignment Operators**

```java
int c = 10;
c += 5;  // c = 15
c -= 3;  // c = 12
c *= 2;  // c = 24
c /= 6;  // c = 4
c %= 3;  // c = 1
```

---

### 4. **Relational Operators**

```java
int p = 10, q = 20;
System.out.println(p == q);  // false
System.out.println(p != q);  // true
System.out.println(p > q);   // false
System.out.println(p < q);   // true
System.out.println(p >= q);  // false
System.out.println(p <= q);  // true
```

---

### 5. **Logical Operators**

```java
boolean m = true, n = false;
System.out.println(m && n);  // false
System.out.println(m || n);  // true
System.out.println(!m);      // false
```

---

### 6. **Bitwise Operators**

```java
int u = 5, v = 3;  // 5 = 0101, 3 = 0011
System.out.println(u & v);  // 1 (0001)
System.out.println(u | v);  // 7 (0111)
System.out.println(u ^ v);  // 6 (0110)
System.out.println(~u);     // -6 (bitwise NOT)
System.out.println(u << 1); // 10 (1010)
System.out.println(u >> 1); // 2  (0010)
System.out.println(u >>> 1);// 2 (unsigned shift)
```

---

### 7. **Ternary Operator**

```java
int age = 18;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result);  // Adult
```

[previous](javafundamentals6.md)
[next](javalogicalstatements1.md)