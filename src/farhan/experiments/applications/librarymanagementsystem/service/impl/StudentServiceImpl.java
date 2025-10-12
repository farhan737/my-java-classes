package farhan.experiments.applications.librarymanagementsystem.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import farhan.experiments.applications.librarymanagementsystem.model.Student;
import farhan.experiments.applications.librarymanagementsystem.service.StudentService;
import farhan.experiments.applications.librarymanagementsystem.util.DatabaseUtil;

public class StudentServiceImpl implements StudentService {

	@Override
	public void addStudent(Student student) {
		String query = "INSERT INTO students (name, email, department, year_of_study, phone) VALUES (?, ?, ?, ?, ?)";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			// Set parameters
			statement.setString(1, student.getStudentName());
			statement.setString(2, student.getEmail());
			statement.setString(3, student.getDepartment());
			statement.setInt(4, student.getYear());
			statement.setString(5, student.getPhoneNumber());

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("Student added successfully!");
			}

		} catch (SQLException e) {
			System.err.println("Database error while adding student.");
			e.printStackTrace();
		}
	}

	@Override
	public void removeStudent(int studentId) {
		String query = "DELETE FROM students WHERE student_id = ?";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, studentId);
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("Student deleted successfully!");
			} else {
				System.err.println("No student found with ID " + studentId);
			}

		} catch (SQLException e) {
			System.err.println("Database error while deleting student.");
			e.printStackTrace();
		}
	}

	@Override
	public void viewAllStudents() {
		String query = "SELECT student_id, name, email, department, year_of_study, phone FROM students";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				java.sql.ResultSet resultSet = statement.executeQuery()) {

			System.out.println("=== All Students ===");
			System.out.printf("%-5s %-20s %-25s %-15s %-5s %-15s%n", "ID", "Name", "Email", "Department", "Year",
					"Phone");

			while (resultSet.next()) {
				int id = resultSet.getInt("student_id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String department = resultSet.getString("department");
				int year = resultSet.getInt("year_of_study");
				String phone = resultSet.getString("phone");

				System.out.printf("%-5d %-20s %-25s %-15s %-5d %-15s%n", id, name, email, department, year, phone);
			}

		} catch (SQLException e) {
			System.err.println("Database error while fetching students.");
			e.printStackTrace();
		}
	}

}
