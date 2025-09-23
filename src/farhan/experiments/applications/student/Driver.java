package farhan.experiments.applications.student;

public class Driver {
	public static void main(String[] args) {
		StudentInterface s1 = new Students();
		s1.addStudent("1232143", "farhan", "java", "123");
//		s1.addStudent("1232142", "farhan", "java", "123");
//		s1.addStudent("1232141", "farhan", "java", "123");
//		s1.addStudent("1232131", "farhan", "java", "123");
//		s1.addStudent("1232154", "farhan", "java", "123");
//		s1.addStudent("1232126", "farhan", "java", "123");
//		s1.addStudent("1232175", "farhan", "java", "123");

//		s1.deleteStudent("1232143");
		s1.displayAll();
	}
}
