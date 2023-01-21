/* Tomas Hornicek 
 * 17/10/2022
 * METCS622
 * This file is the Strategy interface. 
 * It contains the sendEmail method, which is implemented by each class of customer/partner type
 * */
package edu.bu.met.cs665;

public interface Strategy {
	
	public void sendEmail(Sender sender);

}
