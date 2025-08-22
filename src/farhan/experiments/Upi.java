package farhan.experiments;

import farhan.experiments.interfaces.PaymentInterface;

public class Upi implements PaymentInterface {

	@Override
	public void payment() {
		System.out.println("this is upi payment");
	}
	
}
