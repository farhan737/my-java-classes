package farhan.experiments.applications.librarymanagementsystem.service;

import farhan.experiments.applications.librarymanagementsystem.model.Student;

public interface StudentService {
	void addStudent(Student student);

	void removeStudent(int studentId);

	void viewAllStudents();
}
