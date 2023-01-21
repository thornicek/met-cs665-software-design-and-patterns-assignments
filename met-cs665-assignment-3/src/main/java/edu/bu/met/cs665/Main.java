package edu.bu.met.cs665;


public class Main {



  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {
	  Sender sender = new Sender();
	  
	  // New Customer
	  New newCustomer = new New();
	  newCustomer.sendEmail(sender);
	  // Print out the email strategy template
	  System.out.println(sender.getStrategy().toString());
	  
	  // VIP Customer
	  VIP vipCustomer = new VIP();
	  vipCustomer.sendEmail(sender);
	  System.out.println(sender.getStrategy().toString());
	  
	  // Business Partner
	  Business businessCustomer = new Business();
	  businessCustomer.sendEmail(sender);
	  System.out.println(sender.getStrategy().toString());
	  
	  // Returning Customer 
	  Returning returningCustomer = new Returning();
	  returningCustomer.sendEmail(sender);
	  System.out.println(sender.getStrategy().toString());
	  
	  

  }
}
