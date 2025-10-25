# JAVA LOGICAL STATEMENTS - 1

# Logical (Decision-Making) Statements in Java

These statements help your program **choose what to do** depending on conditions.

---

### 1. **if statement**

Runs a block of code only if the condition is true.

```java
int number = 10;

if (number > 0) {
    System.out.println("Positive number");
}
```

---

### 2. **if-else statement**

Runs one block if the condition is true, otherwise runs another.

```java
int number = -5;

if (number >= 0) {
    System.out.println("Non-negative");
} else {
    System.out.println("Negative");
}
```

---

### 3. **if-else if ladder**

Checks multiple conditions one by one.

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

---

### 4. **Nested if statement**

One `if` inside another.

```java
int age = 22;
boolean hasVoterID = true;

if (age >= 18) {
    if (hasVoterID) {
        System.out.println("Eligible to vote.");
    }
}
```

---

### 5. **switch statement**

Best when you have to compare the same variable against many possible values.

```java
int day = 3;

switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Invalid day");
}
```
This is the **enhanced switch expression** – shorter and cleaner.  

```java
int day = 3;

switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    default -> System.out.println("Invalid day");
}
```

You can also return values directly:
```java
int day = 2;

String result = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Invalid day";
};

System.out.println(result); // Tuesday
```
`while` and `do-while` in Java

### 6. `while` Loop

* Checks the condition **before** executing.
* Runs **0 or more times**.

```java
int i = 1;

while (i <= 5) {
    System.out.println("Count: " + i);
    i++;
}
```

**Output:**

```
Count: 1  
Count: 2  
Count: 3  
Count: 4  
Count: 5
```

---

### 7. `do-while` Loop

* Executes the block **at least once** (even if the condition is false).
* Then checks the condition.

```java
int j = 1;

do {
    System.out.println("Count: " + j);
    j++;
} while (j <= 5);
```

**Output:**

```
Count: 1  
Count: 2  
Count: 3  
Count: 4  
Count: 5
```

---

### 🔹 Key Difference

* `while` → check first, then run.
* `do-while` → run once, then check.


### 7. jump statements:

Jump statements are used to **change the normal flow** of execution in loops, methods, or switch blocks.  

---

### 🔹 1. `break`  
- Exits **immediately** from a loop or `switch`.  
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;  // stop the loop completely
    }
    System.out.println(i);
}
```
**Output:**  
```
1  
2
```

---

### 🔹 2. `continue`  
- Skips the **current iteration** and jumps to the next.  
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;  // skip printing 3
    }
    System.out.println(i);
}
```
**Output:**  
```
1  
2  
4  
5
```

---

### 🔹 3. `return`  
- Exits from the **current method** and optionally returns a value.  
```java
public int add(int a, int b) {
    return a + b;  // exit method and give result
}
```

```java
public void showMessage() {
    System.out.println("Hello");
    return;  // exits method (no value)
}
```

---

👉 So, the **jump statements in Java** are:  
- `break` → exits loop/switch  
- `continue` → skips iteration  
- `return` → exits method (with/without value)  

---

[previous](javaoperators1.md)
[next](javaaccessmodifiers1.md)
