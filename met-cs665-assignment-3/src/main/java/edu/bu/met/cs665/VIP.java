/* Tomas Hornicek 
 * 17/10/2022
 * METCS622
 * This file is the VIP class. The VIP class implements the Strategy interface and represents the VIP customers.
 * The VIP class contains the sendEmail method, that is overriden to contain a template email for a VIP customer
 * and to set the strategy to the VIP email strategy.
 * The VIP class also contains the toString method, to show what strategy is implemented.
 * */
package edu.bu.met.cs665;

public class VIP implements Strategy {

	@Override
	public void sendEmail(Sender sender) {
		System.out.println("Dear VIP customer, We extremely value the business we are doing together"
				+ " and we hope to continue our great working relationship in the future. Best, Your Company");
		sender.setStrategy(this);
	}
	
	public String toString() {
		return "Vip customer email template";
	}
}
