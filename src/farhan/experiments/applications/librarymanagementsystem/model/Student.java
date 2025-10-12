package farhan.experiments.applications.librarymanagementsystem.model;

public class Student {
	private long studentId;
	private String studentName;
	private String email;
	private String department;
	private int year;
	private String phoneNumber;

	public Student() {
	}

	public Student(long studentId, String studentName, String email, String department, int year, String phoneNumber) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.department = department;
		this.year = year;
		this.phoneNumber = phoneNumber;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
