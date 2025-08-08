package farhan.experiments.main;

import farhan.experiments.Salary;

public class Lab0107 {
    public static void main(String[] args) {
        double salary = 27000;
        String name = "King";
        Salary s1 = new Salary();
        s1.calcSalary(salary);
        System.out.println(
                "The Final salary for " + name + " after the deductions and credit is " + s1.printSalary(salary));
    }
}
