package farhan.experiments.main;

import farhan.experiments.StudentManagement;

public class CS1008 {
	public static void main(String[] agrs) {
		StudentManagement s1 = new StudentManagement();
		s1.setStudentName("Farhan Mohammad");
		s1.setStudentRollNumber(135);
		s1.setStudentAge(22);
		s1.setGPA(8.15);
		
		s1.displayInfo();
	}
}
