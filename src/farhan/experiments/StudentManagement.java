package farhan.experiments;

public class StudentManagement {
	private String studentName;
	private int studentAge;
	private int studentRollNumber;
	private double gpa;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public void displayInfo() {
		System.out.println("student name: " + getStudentName());
		System.out.println("student roll number: " + getStudentRollNumber());
		System.out.println("student age: " + getStudentAge());
		System.out.println("student gpa: " + getGPA());
	}

}
