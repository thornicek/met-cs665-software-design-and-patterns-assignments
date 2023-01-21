/* Tomas Hornicek 
 * 17/10/2022
 * METCS622
 * This file is the RNew class. The New class implements the Strategy interface and represents the new customers.
 * The New class contains the sendEmail method, that is overriden to contain a template email for a new customer
 * and to set the strategy to the new email strategy.
 * The New class also contains the toString method, to show what strategy is implemented.
 * */
package edu.bu.met.cs665;

public class New implements Strategy {

	@Override
	public void sendEmail(Sender sender) {
		System.out.println("Dear New Customer, We are glad you chose us for your business."
				+ " We are looking forward to working with you. Best, Your Company");
		sender.setStrategy(this);
	}
	
	public String toString() {
		return "New customer email template";
	}
}
