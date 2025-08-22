package farhan.experiments;

import farhan.experiments.interfaces.PaymentInterface;

public class Paypal implements PaymentInterface{

	@Override
	public void payment() {
		System.out.println("this is paypal payments ");
	}
	
}
