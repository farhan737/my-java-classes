package farhan.exeperiments;

public class BonusSalaryHR {
	public int experience;
	public String employeeName;
	public int bonusAmount;

	public BonusSalaryHR(int experience, String employeeName) {
		this.experience = experience;
		this.employeeName = employeeName;
		this.bonusAmount = (experience >= 10 ? 20000 : (experience >= 5 ? 10000 : (experience >= 2 ? 5000 : 0)));
	}
}
