# JAVA ACCESS MODIFIERS AND MODIFIERS - 1
#### why we need to learn this ?
accessing or limiting the access from one class datamembers in another class or package.
  
there are four access modifiers in java they are:  
`private` > `protected` > `default` > `public`  
this is the levels of access in ascending order.

<table border = 1>
    <caption>Access Levels for Classes</caption>
    <tr>
      <th>Modifier</th>
      <th>Same Package</th>
      <th>Other Packages</th>
    </tr>
    <tr>
      <td>public</td>
      <td>✅ Yes</td>
      <td>✅ Yes</td>
    </tr>
    <tr>
      <td>default (no modifier)</td>
      <td>✅ Yes</td>
      <td>❌ No</td>
    </tr>
    <tr>
      <td>protected</td>
      <td colspan="2">❌ Not allowed for classes</td>
    </tr>
    <tr>
      <td>private</td>
      <td colspan="2">❌ Not allowed for classes</td>
    </tr>
  </table>

  <!-- Data Members -->
  <table border = 1>
    <caption>Access Levels for Data Members (fields, methods, constructors, inner classes)</caption>
    <tr>
      <th>Modifier</th>
      <th>Same Class</th>
      <th>Same Package</th>
      <th>Subclass (other package)</th>
      <th>Other Packages</th>
    </tr>
    <tr>
      <td>public</td>
      <td>✅ Yes</td>
      <td>✅ Yes</td>
      <td>✅ Yes</td>
      <td>✅ Yes</td>
    </tr>
    <tr>
      <td>protected</td>
      <td>✅ Yes</td>
      <td>✅ Yes</td>
      <td>✅ Yes</td>
      <td>❌ No</td>
    </tr>
    <tr>
      <td>default (no modifier)</td>
      <td>✅ Yes</td>
      <td>✅ Yes</td>
      <td>❌ No</td>
      <td>❌ No</td>
    </tr>
    <tr>
      <td>private</td>
      <td>✅ Yes</td>
      <td>❌ No</td>
      <td>❌ No</td>
      <td>❌ No</td>
    </tr>
  </table>

## for classes
### 1. `public` classes
```java
public class PublicExample {
  // writing a public class is possible.
  // its datamembers and constructors are available withing the whole project.
} 
```

### 2. `<default>` classes
```java
class DefaulExample {
    // writing a default class is possible.
    // the scope of the constructors and datamembers is just within the package.
}
```
### 3. `protected` and `private` classe
  ```java
  private class Main {
      
  }
  ```
  or
  ```java
  protected class Main {
  
  }
  ```
  this is not legal in java, will result in complile-time error.