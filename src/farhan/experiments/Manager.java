package farhan.experiments;

class Employee {
	private String name;
	private int id;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void displayInfo() {
		System.out.println(getName());
		System.out.println(getId());
		System.out.println(getSalary());
	}
}

public class Manager extends Employee {
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(getDepartment());
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("farhan");
		e1.setSalary(20000.0);
		e1.displayInfo();
		System.out.println("*".repeat(20));
		Manager m1 = new Manager();
		m1.setId(2);
		m1.setName("nizam");
		m1.setSalary(22000.0);
		m1.setDepartment("development");
		m1.displayInfo();
	}
}
