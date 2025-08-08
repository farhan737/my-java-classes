package farhan.experiments;

public class Salary {
    public void calcSalary(double salary) {
        System.out.println("PF Deductions 5%: " + (-1 * (salary * 0.05)));
        System.out.println("CGST Deductions 7%: " + (-1 * (salary * 0.07)));
        System.out.println("Dearness Allowance 3%: " + salary * 0.03);
    }

    public double printSalary(double salary) {
        return (salary + (-1 * (salary * 0.05)) + (-1 * (salary * 0.07)) + salary * 0.03);
    }
}
