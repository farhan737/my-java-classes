package farhan.experiments.main;

import java.util.Scanner;

public class CS0809 {
	public static void main(String[] args) {
		String[] studentNames = new String[3];
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.println("enter student names: ");
		while (a < studentNames.length) {
			studentNames[a] = sc.next();
			a++;
		}
		System.out.println("enter another student name: ");
		try {
			studentNames[4] = sc.next();
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Student not found - invalid index");
		}
		sc.close();
	}
}
