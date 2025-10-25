package farhan.experiments.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import farhan.util.DatabaseUtil;

class Student {
	private int rollNumber;
	private String name;

	public Student() {
	}

	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Service {
	static Connection conn = DatabaseUtil.getConnection();
	static {
		DatabaseUtil.useDatabase("student");
	}

	public static void setStudent(Student student) {
		String query = "insert into student(rollnumber,name) values(?,?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, student.getRollNumber());
			stmt.setString(2, student.getName());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Student> getAllStudents() {
		String query = "select * from student;";
		List<Student> students = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Student student = new Student(rs.getInt("rollnumber"), rs.getString("name"));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}

	public static Student getStudent(int rollNumber) {
		String query = "select * from student where rollnumber = ?";
		Student student = null;
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, rollNumber);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			student = new Student(rs.getInt("rollnumber"), rs.getString("name"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
}

public class CS2410 {
	static Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	static void printall(List<Student> students) {
		for (Student student : students) {
			System.out.println(student.getRollNumber() + " " + student.getName());
		}
	}

	static void start() {
		System.out.println("=".repeat(50));
		System.out.println("1. add student");
		System.out.println("2. print all students");
		System.out.println("3. print student by roll number");
		System.out.println("4. exit");
		System.out.println("enter option: ");
		int option = sc.nextInt();
		int rollNumber;
		String name;
		switch (option) {
		case 1 -> {
			System.out.println("enter roll number");
			rollNumber = sc.nextInt();
			System.out.println("enter name");
			sc.nextLine();
			name = sc.nextLine();
			Student s = new Student(rollNumber, name);
			Service.setStudent(s);
			System.out.println("successfully added student");
			start();
		}
		case 2 -> {
			System.out.println("-".repeat(50));
			printall(Service.getAllStudents());
			start();
		}
		case 3 -> {
			System.out.println("enter student number: ");
			rollNumber = sc.nextInt();
			Student student = Service.getStudent(rollNumber);
			System.out.println(student.getRollNumber() + " " + student.getName());
			start();
		}
		case 4 -> {
			System.out.println("Good Bye!!");
		}
		}
	}

	public static void main(String[] args) {
		start();
	}
}
