# JAVA OOPS (OBJECT CLONING)

to use the `clone()` method from the `Object` class our class should implement the `Cloneable` interface.
## Shallow Copy VS Deep Copy:
### Shallow copy:
```java
class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}
}

public class Student implements Cloneable {
	String name;
	Address address;
	int marks;

	public Student(int marks, String name, Address address) {
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Address a = new Address("Hyderabad");
		Student s = new Student(123, "Sujith", a);
		System.out.println(s.name); // Sujith
		System.out.println(s.marks); // 123
		System.out.println(s.address.city); // Hyderabad

		Student sClone = (Student) s.clone(); // shallow cloning the s object into sClone.

		System.out.println(sClone.name); // Sujith
		System.out.println(sClone.address.city); // Hyderabad

		sClone.marks = 134;
		sClone.name = "Rajesh";
		sClone.address.city = "Gujarath";

		System.out.println(s.name); // Sujith (independent, primitive String field changed only in clone)
		System.out.println(s.marks); // 123
		System.out.println(s.address.city); // Gujarath (shared reference, both objects affected)
		
		System.out.println(sClone.name); // Sujith
		System.out.println(sClone.marks); // 134
		System.out.println(sClone.address.city); // Hyderabad

	}
}
```
- name (a String) is immutable and stored separately, so changing sClone.name does not affect s.name.
- address is a reference type. After shallow cloning, both s and sClone point to the same Address object.
- That’s why changing sClone.address.city also changes s.address.city.

### Deep copy:
```java
class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    // Copy constructor
    public Address(Address other) {
        this.city = other.city; // creates a new String (immutable anyway)
    }
}

public class Student {
    String name;
    Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Copy constructor (deep copy)
    public Student(Student other) {
        this.name = other.name;               // String is immutable, safe to copy directly
        this.address = new Address(other.address); // creates a new Address object
    }

    public static void main(String[] args) {
        Address a = new Address("Hyderabad");
        Student s = new Student("Sujith", a);

        System.out.println(s.name);         // Sujith
        System.out.println(s.address.city); // Hyderabad

        // Deep copy using copy constructor
        Student sCopy = new Student(s);

        System.out.println(sCopy.name);         // Sujith
        System.out.println(sCopy.address.city); // Hyderabad

        // Modify the copied object
        sCopy.name = "Rajesh";
        sCopy.address.city = "Gujarath";

        // Original object remains unchanged
        System.out.println(s.name);         // Sujith
        System.out.println(s.address.city); // Hyderabad ✅
    }
}
```

- Creates a new object along with copies of all referenced objects.
- Original and copied objects are independent (changes in one don’t affect the other).
- Needed when dealing with mutable reference types (like custom objects, lists, maps).
- Can be done via copy constructor, clone(), or serialization.