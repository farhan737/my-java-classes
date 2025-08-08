
package farhan.experiments.main;

import farhan.experiments.Bank;

public class Lab0207 {
	public static void main(String[] args) {
		Bank a = new Bank("Farhan", 20000d);
		a.addAccount();
		Bank b = new Bank("Pushkar", 30000d);
		b.addAccount();
		a.addAccount();
	}
}
