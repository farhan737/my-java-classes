package farhan.experiments.applications.student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Students implements StudentInterface {
	String studentData = "./src/farhan/experiments/applications/student/studentData.txt";
	
	@Override
	public boolean addStudent(String rollNumber, String name, String course, String marks) {
		boolean found = true;
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(studentData, true));
				BufferedReader br = new BufferedReader(new FileReader(studentData))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] student = line.split("@");
				if (student[0].equals(rollNumber)) {
					found = false;
					break;
				}
			}
			if (found) {
				writer.write(String.join("@", rollNumber, name, course, marks));
				writer.newLine();
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return found;
	}

	@Override
	public void displayAll() {
		try (BufferedReader br = new BufferedReader(new FileReader(studentData))) {
			String line;
			System.out.println(String.join("\t", "rollNumber", "name", "course", "marks"));
			while ((line = br.readLine()) != null) {
				String[] student = line.split("@");
				System.out.println(String.join("\t", student[0], student[1], student[2], student[3]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean getStudent(String rollNumber) {
		boolean wasFound = false;
		try (BufferedReader br = new BufferedReader(new FileReader(studentData))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] student = line.split("@");
				if (student[0].equals(rollNumber)) {
					System.out.println(String.join("\t", "rollNumber", "name", "course", "marks"));
					System.out.println(String.join("\t", student[0], student[1], student[2], student[3]));
					wasFound = true;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wasFound;
	}

	@Override
	public boolean deleteStudent(String rollNumber) {
		boolean found = false;
		try (BufferedReader br = new BufferedReader(new FileReader(studentData));
				BufferedWriter bw = new BufferedWriter(new FileWriter("./src/farhan/experiments/applications/student/temp.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] student = line.split("@");
				if (student[0].equals(rollNumber)) {
					found = true;
					continue;
				}
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
			File original = new File(studentData);
			File temp = new File("./src/farhan/experiments/applications/student/temp.txt");

			if (original.delete()) {
				temp.renameTo(original);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return found;
	}
}
