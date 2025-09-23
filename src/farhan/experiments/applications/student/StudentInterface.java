package farhan.experiments.applications.student;

public interface StudentInterface {
	
	/**
	 * this method only adds the student details to the studentData.txt file if the students roll number is not present in the text file.
	 * the data is added using "@" as a delimiter.
	 * @param rollNumber
	 * @param name
	 * @param course
	 * @param marks
	 * @return <b>true</b> if the student is successfully added to the text file and <b>false</b> if the student is already present in the text file.
	 */
	public boolean addStudent(String rollNumber, String name, String course, String marks);

	/**
	 * this method prints all the students present in the studentData.txt file.
	 */
	public void displayAll();

	/**
	 * this method print the student data for a particular roll number from the studentData.txt file
	 * @param rollNumber
	 * @return <b>false</b> if the student details are not present in the studentData.txt file.
	 */
	public boolean getStudent(String rollNumber);

	/**
	 * this method deletes the student data for the corresponding roll number from the studentData.txt file.
	 * @param rollNumber
	 * @return <b>true</b> if the student data was successfully deleted from the text file.
	 */
	public boolean deleteStudent(String rollNumber);
	
	
}
