package farhan.experiments;

public class MultiConstructor {
    String name;
    int rollno;
    String course;

    // constructor with single arguement
    public MultiConstructor(String name) {
        this.name = name;
    }

    // constructor with two arguements
    public MultiConstructor(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    // constructor with three arguements
    public MultiConstructor(String name, int rollno, String course) {
        this.name = name;
        this.rollno = rollno;
        this.course = course;
    }

    // method to display/print the variables
    public void display() {
        System.out.println("name: " + name);
        System.out.println("roll number: " + rollno);
        System.out.println("course name: " + course);
    }
}
