package farhan.experiments;

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
