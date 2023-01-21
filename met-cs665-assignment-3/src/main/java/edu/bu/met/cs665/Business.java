/* Tomas Hornicek 
 * 17/10/2022
 * METCS622
 * This file is the Business class. The Business class implements the Strategy interface and represents the business partners.
 * The Business class contains the sendEmail method, that is overriden to contain a template email for a business partner
 * and to set the strategy to the business email strategy.
 * The Business class also contains the toString method, to show what strategy is implemented.
 * */
package edu.bu.met.cs665;

public class Business implements Strategy {
	
	// Override the interface sendEmail() and set strategy to business email
	@Override
	public void sendEmail(Sender sender) {
		System.out.println("Dear Business Partner , We value doing business with you "
				+ "and we would like to set up a time to meet. Best, your Company");
		sender.setStrategy(this);
	}
	
	public String toString() {
		return "Business partner email template";
	}

}	
