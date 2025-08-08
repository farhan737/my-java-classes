package farhan.experiments;

public class NoPrimitive {
    Integer empNumber = 1;
    String empName = "farhan";
    Integer salary = 5000;
    Integer hireYear = 2021;
    Integer currentYear = 2025;
    Integer experience = currentYear - hireYear;
    Integer annualSalary = 12 * salary;
    Double bonus = annualSalary * 0.10;
    Double annualEarnings = annualSalary + annualSalary * 0.10;

    public NoPrimitive() {
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Annual Salary: " + annualEarnings);
    }
}
