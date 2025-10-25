# JAVA STRING HANDLING:
## 1. Introduction

In Java, strings are used to store and manipulate text data.  
Unlike some other languages, Java treats strings as **objects**, not as arrays of characters.

- The `String` class (in `java.lang` package) provides methods for handling text.  
- Strings in Java are **immutable**, meaning once created, their value cannot be changed.

---

## 2. Creating Strings

There are two main ways to create strings:

### (a) Using String Literals
```java
String s1 = "Hello";
String s2 = "Hello"; // refers to same object in string pool
```
- Stored in the **String Constant Pool (SCP)**.  
- If the same literal exists, Java reuses it for memory efficiency.

### (b) Using the `new` Keyword
```java
String s3 = new String("Hello");
```
- Always creates a new object in the heap (outside the pool).  
- Even if an identical literal exists, this creates a separate object.

---

## 3. String Constant Pool (SCP)

The String Constant Pool is a special memory area inside the Java heap.  
When a string literal is created:
- Java checks if the literal already exists in the pool.
- If it exists, the existing reference is returned.
- Otherwise, a new string is created and added to the pool.

Example:
```java
String a = "Java";
String b = "Java";
System.out.println(a == b); // true (same object)

String c = new String("Java");
System.out.println(a == c); // false (different objects)
```

---

## 4. String Immutability

Strings in Java are **immutable**.  
Once created, their contents cannot be changed.

Example:
```java
String s = "Hello";
s.concat(" World");
System.out.println(s); // Output: Hello
```

To modify it:
```java
s = s.concat(" World");
System.out.println(s); // Output: Hello World
```

**Reasons for immutability:**
1. Security (e.g., in file paths, network connections)
2. Thread safety
3. Efficient memory usage through string pooling

---

## 5. Common String Methods
<table border="1" cellpadding="8" cellspacing="0">
  <thead>
    <tr>
      <th>Method</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody>
    <tr><td><code>length()</code></td><td>Returns number of characters</td><td><code>"Hello".length()</code> → 5</td></tr>
    <tr><td><code>charAt(int index)</code></td><td>Returns character at index</td><td><code>"Java".charAt(2)</code> → 'v'</td></tr>
    <tr><td><code>concat(String s)</code></td><td>Joins two strings</td><td><code>"Hi".concat("Farhan")</code> → "HiFarhan"</td></tr>
    <tr><td><code>equals(Object o)</code></td><td>Compares content</td><td><code>"java".equals("JAVA")</code> → false</td></tr>
    <tr><td><code>equalsIgnoreCase()</code></td><td>Case-insensitive comparison</td><td><code>"java".equalsIgnoreCase("JAVA")</code> → true</td></tr>
    <tr><td><code>compareTo(String s)</code></td><td>Lexicographic comparison</td><td><code>"a".compareTo("b")</code> → -1</td></tr>
    <tr><td><code>substring(int start)</code></td><td>Extracts part of a string</td><td><code>"Hello".substring(2)</code> → "llo"</td></tr>
    <tr><td><code>substring(int start, int end)</code></td><td>Extracts substring</td><td><code>"Hello".substring(1,4)</code> → "ell"</td></tr>
    <tr><td><code>indexOf(char)</code></td><td>Returns index of first occurrence</td><td><code>"banana".indexOf('a')</code> → 1</td></tr>
    <tr><td><code>lastIndexOf(char)</code></td><td>Returns last occurrence</td><td><code>"banana".lastIndexOf('a')</code> → 5</td></tr>
    <tr><td><code>toUpperCase()</code></td><td>Converts to uppercase</td><td><code>"hi".toUpperCase()</code> → "HI"</td></tr>
    <tr><td><code>toLowerCase()</code></td><td>Converts to lowercase</td><td><code>"HI".toLowerCase()</code> → "hi"</td></tr>
    <tr><td><code>trim()</code></td><td>Removes leading/trailing spaces</td><td><code>"  Java  ".trim()</code> → "Java"</td></tr>
    <tr><td><code>replace(old, new)</code></td><td>Replaces characters</td><td><code>"apple".replace('a','A')</code> → "Apple"</td></tr>
    <tr><td><code>split(regex)</code></td><td>Splits string into array</td><td><code>"a,b,c".split(",")</code> → ["a","b","c"]</td></tr>
    <tr><td><code>startsWith(String prefix)</code></td><td>Checks prefix</td><td><code>"Hello".startsWith("He")</code> → true</td></tr>
    <tr><td><code>endsWith(String suffix)</code></td><td>Checks suffix</td><td><code>"Hello".endsWith("lo")</code> → true</td></tr>
    <tr><td><code>isEmpty()</code></td><td>Checks if string is empty</td><td><code>"".isEmpty()</code> → true</td></tr>
    <tr><td><code>contains(CharSequence)</code></td><td>Checks presence of substring</td><td><code>"Java".contains("av")</code> → true</td></tr>
  </tbody>
</table>

---

## 6. String Comparison

### (a) Using `==`
Compares references (memory locations).

### (b) Using `equals()`
Compares actual contents.

### (c) Using `compareTo()`
Lexicographically compares strings:
- `0` → equal
- positive → first string > second
- negative → first string < second

Example:
```java
String s1 = "Farhan";
String s2 = "Farhan";
String s3 = new String("Farhan");

System.out.println(s1 == s2);   // true
System.out.println(s1 == s3);   // false
System.out.println(s1.equals(s3)); // true
```

---

## 7. StringBuffer and StringBuilder

Strings are immutable; for frequent modifications, use:

- **StringBuffer** – thread-safe (synchronized)
- **StringBuilder** – not thread-safe, but faster (since Java 5)
<table border="1" cellpadding="8" cellspacing="0">
  <thead>
    <tr>
      <th>Feature</th>
      <th>String</th>
      <th>StringBuffer</th>
      <th>StringBuilder</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Mutability</td>
      <td>Immutable</td>
      <td>Mutable</td>
      <td>Mutable</td>
    </tr>
    <tr>
      <td>Thread Safety</td>
      <td>Safe</td>
      <td>Safe</td>
      <td>Not Safe</td>
    </tr>
    <tr>
      <td>Performance</td>
      <td>Slower</td>
      <td>Moderate</td>
      <td>Faster</td>
    </tr>
    <tr>
      <td>Introduced</td>
      <td>Java 1.0</td>
      <td>Java 1.0</td>
      <td>Java 5</td>
    </tr>
  </tbody>
</table>

Example:
```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
System.out.println(sb); // Hello World
```

---

## 8. Important Methods in StringBuffer / StringBuilder
<table border="1" cellpadding="8" cellspacing="0">
  <thead>
    <tr>
      <th>Method</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>append()</code></td>
      <td>Adds text at end</td>
      <td><code>sb.append("Hi")</code></td>
    </tr>
    <tr>
      <td><code>insert(pos, str)</code></td>
      <td>Inserts at given position</td>
      <td><code>sb.insert(2, "Java")</code></td>
    </tr>
    <tr>
      <td><code>replace(start, end, str)</code></td>
      <td>Replaces substring</td>
      <td><code>sb.replace(0, 5, "Hi")</code></td>
    </tr>
    <tr>
      <td><code>delete(start, end)</code></td>
      <td>Deletes characters</td>
      <td><code>sb.delete(1,3)</code></td>
    </tr>
    <tr>
      <td><code>reverse()</code></td>
      <td>Reverses the string</td>
      <td><code>sb.reverse()</code></td>
    </tr>
    <tr>
      <td><code>capacity()</code></td>
      <td>Returns buffer capacity</td>
      <td><code>sb.capacity()</code></td>
    </tr>
    <tr>
      <td><code>length()</code></td>
      <td>Returns string length</td>
      <td><code>sb.length()</code></td>
    </tr>
  </tbody>
</table>

---

## 9. String Conversion Methods
<table border="1" cellpadding="8" cellspacing="0">
  <thead>
    <tr>
      <th>Conversion</th>
      <th>Method</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>String → char[]</td>
      <td><code>toCharArray()</code></td>
    </tr>
    <tr>
      <td>char[] → String</td>
      <td><code>new String(charArray)</code></td>
    </tr>
    <tr>
      <td>int → String</td>
      <td><code>String.valueOf(int)</code></td>
    </tr>
    <tr>
      <td>String → int</td>
      <td><code>Integer.parseInt(str)</code></td>
    </tr>
  </tbody>
</table>

Example:
```java
char[] arr = {'J','a','v','a'};
String s = new String(arr);
System.out.println(s); // Java
```

---

## 10. String Formatting

Use `String.format()` or `System.out.printf()`:
```java
String name = "Farhan";
int age = 21;
String info = String.format("Name: %s, Age: %d", name, age);
System.out.println(info);
```

Output:
```
Name: Farhan, Age: 21
```

---

## 11. String Joiner and String.join() (Java 8+)

Example using `String.join()`:
```java
String result = String.join("-", "Java", "Python", "C++");
System.out.println(result); // Java-Python-C++
```

Example using `StringJoiner`:
```java
import java.util.StringJoiner;

StringJoiner joiner = new StringJoiner(", ", "[", "]");
joiner.add("Java");
joiner.add("Python");
joiner.add("C++");
System.out.println(joiner); // [Java, Python, C++]
```

---

## 12. Regular Expressions with Strings

Some methods accept regular expressions: `matches()`, `replaceAll()`, `split()`.

Example:
```java
String s = "abc123xyz";
System.out.println(s.replaceAll("[0-9]", "")); // abcxyz
```

---

## 13. String Interning

The `intern()` method adds the string to the string pool if it isn’t already there.

Example:
```java
String s1 = new String("Java");
String s2 = s1.intern();
String s3 = "Java";
System.out.println(s2 == s3); // true
```

---

## 14. Immutable vs Mutable Objects
<table border="1" cellpadding="8" cellspacing="0">
  <thead>
    <tr>
      <th>Feature</th>
      <th>Immutable (String)</th>
      <th>Mutable (StringBuffer/StringBuilder)</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Change value</td>
      <td>Creates new object</td>
      <td>Modifies existing object</td>
    </tr>
    <tr>
      <td>Thread Safety</td>
      <td>Yes</td>
      <td>Only StringBuffer</td>
    </tr>
    <tr>
      <td>Speed</td>
      <td>Slower</td>
      <td>Faster</td>
    </tr>
    <tr>
      <td>Use Case</td>
      <td>Few modifications</td>
      <td>Frequent modifications</td>
    </tr>
  </tbody>
</table>

---

## 15. Common Interview Questions

1. Why are strings immutable in Java?  
   → For security, synchronization, and string pooling benefits.

2. Difference between `String`, `StringBuffer`, and `StringBuilder`.

3. How to compare strings ignoring case?  
   → Using `equalsIgnoreCase()`.

4. What is the use of `intern()` method?

5. What happens when `+` is used for concatenation?  
   → Compiler uses `StringBuilder` internally.

6. How to reverse a string without `reverse()`?  
   → Using loop or `StringBuilder`.

---

## 16. Example Program

```java
public class StringExample {
    public static void main(String[] args) {
        String name = "Farhan";
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2,5));
        System.out.println(name.replace('a','@'));

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Rocks!");
        System.out.println(sb);

        StringJoiner sj = new StringJoiner(", ");
        sj.add("HTML").add("CSS").add("JavaScript");
        System.out.println(sj);
    }
}
```

Output:
```
FARHAN
rha
F@rh@n
Java Rocks!
HTML, CSS, JavaScript
```

[previous](javaarrays1.md)
[next](javaexceptionhandling1.md)