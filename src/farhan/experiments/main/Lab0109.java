package farhan.experiments.main;

import farhan.util.Calc;

public class Lab0109 {
	public static void main(String[] args) {
		
		Calc c1 = new Calc();
		boolean[] binary = c1.toBinary(256);
		for(int i = binary.length - 1;i>=0;i--) {
			System.out.print(binary[i] ? "1" : "0" + "");
		}
		
	}
}
