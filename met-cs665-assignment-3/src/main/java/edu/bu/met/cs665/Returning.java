/* Tomas Hornicek 
 * 17/10/2022
 * METCS622
 * This file is the Returning class. The Returning class implements the Strategy interface and represents the returning customers.
 * The Returning class contains the sendEmail method, that is overriden to contain a template email for a returning customer
 * and to set the strategy to the returning email strategy.
 * The Returning class also contains the toString method, to show what strategy is implemented.
 * */
package edu.bu.met.cs665;

public class Returning implements Strategy {

	@Override
	public void sendEmail(Sender sender) {
		System.out.println("Dear Returning Customer, we appreciate doing business with you "
				+ "and we look forward to doing more in the future.Best, Your Company");
		sender.setStrategy(this);
	}
	
	public String toString() {
		return "Returning customer email template";
	}
}
