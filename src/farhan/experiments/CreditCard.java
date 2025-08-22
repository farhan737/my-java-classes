package farhan.experiments;

import farhan.experiments.interfaces.PaymentInterface;

public class CreditCard implements PaymentInterface{

	@Override
	public void payment() {
		System.out.println("this is credit card payment");
		
		
	}

}
