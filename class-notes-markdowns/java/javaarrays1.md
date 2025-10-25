# JAVA ARRAYS:
An **array** in Java is a **data structure** used to store multiple values of the **same type** in a single variable, instead of declaring separate variables for each value.

---

## **1. Characteristics of Arrays**

* **Fixed size** → Once created, the size cannot be changed.
* **Homogeneous** → All elements must be of the same type (int, double, String, etc.).
* **Indexed** → Elements are accessed using an index (starting at **0**).
* **Stored in contiguous memory** → Array elements are stored in continuous blocks in memory.
* **Objects in Java** → Arrays are implemented as objects, even if they hold primitive types.

---

## **2. Declaring and Creating Arrays**

### Syntax:

```java
// Declaration
datatype[] arrayName;    // preferred
datatype arrayName[];    // valid, but less common

// Creation
arrayName = new datatype[size];

// Declaration + Creation
datatype[] arrayName = new datatype[size];

// Declaration + Initialization
datatype[] arrayName = {value1, value2, value3, ...};
```

### Example:

```java
int[] numbers = new int[5];   // Array of 5 integers
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;

int[] marks = {85, 90, 75, 88};  // Direct initialization
```

---

## **3. Accessing Array Elements**

* Use index notation: `array[index]`
* Index starts at **0** and goes up to `array.length - 1`.

```java
System.out.println(numbers[0]);  // 10
System.out.println(marks[2]);    // 75
```

⚠️ If you try to access out of bounds (`array[array.length]`), you’ll get an **ArrayIndexOutOfBoundsException**.

---

## **4. Array Length**

* Every array has a **public final variable `length`**, which gives its size.

```java
System.out.println(marks.length);  // 4
```

---

## **5. Iterating Through Arrays**

### Using `for` loop:

```java
for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}
```

### Using **Enhanced for loop**:

```java
for (int mark : marks) {
    System.out.println(mark);
}
```

---

## **6. Default Values in Arrays**

When an array is created with `new`, its elements are automatically initialized with **default values**:

* Numeric types (`int`, `double`, etc.) → `0`
* `boolean` → `false`
* `char` → `\u0000` (null character)
* Object references → `null`

```java
String[] names = new String[3];
System.out.println(names[0]);  // null
```

---

## **7. Types of Arrays**

### (a) **One-Dimensional Array**

```java
int[] arr = {1, 2, 3, 4, 5};
```

### (b) **Multi-Dimensional Array (Matrix)**

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

System.out.println(matrix[1][2]); // 6
```

### (c) **Jagged Arrays (Arrays of Arrays)**

* Unlike C/C++, Java supports **jagged arrays** where each row can have different column sizes.

```java
int[][] jagged = new int[3][];
jagged[0] = new int[2];   // Row 0 has 2 columns
jagged[1] = new int[4];   // Row 1 has 4 columns
jagged[2] = new int[3];   // Row 2 has 3 columns
```

---

## **8. Arrays as Objects**

Arrays in Java are objects of a **special class** that extends `Object`.
This means:

* They can be passed to methods.
* Returned from methods.
* Stored in variables of type `Object`.

```java
public static void printArray(int[] arr) {
    for (int n : arr) {
        System.out.print(n + " ");
    }
}

public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    printArray(nums);  // Passing array to method
}
```

---

## **9. Copying Arrays**

### (a) Manual Copy

```java
int[] copy = new int[marks.length];
for (int i = 0; i < marks.length; i++) {
    copy[i] = marks[i];
}
```

### (b) Using `System.arraycopy`

```java
System.arraycopy(marks, 0, copy, 0, marks.length);
```

### (c) Using `Arrays.copyOf`

```java
int[] copy = java.util.Arrays.copyOf(marks, marks.length);
```

---

## **10. Limitations of Arrays**

* Fixed size → cannot grow or shrink dynamically.
* Only stores one data type.
* Operations like **insertions/deletions** are costly.
* No built-in methods for complex operations (sorting, searching) → need `Arrays` utility class or Collections framework.

---

## **11. Commonly Used Utility Methods (java.util.Arrays)**

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        Arrays.sort(arr);                      // Sort array
        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 5, 8]

        int index = Arrays.binarySearch(arr, 3);   // Search element
        System.out.println("Index of 3: " + index);
    }
}
```

---

## **12. Summary**

* Arrays are **fixed-length, indexed, homogeneous, objects** in Java.
* Useful for **storing primitive types or objects** in bulk.
* Good for **performance and memory efficiency** but lack flexibility.
* For dynamic collections, use Java Collections Framework (e.g., `ArrayList`).

[previous](javaabstraction2.md)
[next](javastringhandling.md)