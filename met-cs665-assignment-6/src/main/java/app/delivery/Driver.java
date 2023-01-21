/* Tomas Hornicek 
 * 03/10/2022
 * METCS622
 * This file is the Driver class, that implements the SubscriberBase interface
 * Contains a constructor for the Driver, overrides the SubscriberBase interface method; updateSelf, has a getter method getName and a getMyLatestUpdate method
 * to print out the product name
 * */
package app.delivery;

import java.util.ArrayList;

public class Driver implements SubscriberBase {
	
	private String name;
	private Shop shop;
	public ArrayList<DeliveryRequest> delivery;
	
	public Driver(String name, Shop shop) {
		this.name = name;
		this.shop = shop;
		this.shop.subscribe(this);
	}
	
	// Override the updateSelf() to display the drivers name and the delivery product
	@Override
	public void updateSelf(ArrayList<DeliveryRequest> delivery) {
		this.delivery = delivery;
		
		System.out.println("Driver: " + this.getName() + " has received the message and is ready to deliver: " + this.getMyLatestUpdate());
		
	}


	public String getMyLatestUpdate() {
		String last = this.delivery.get(this.delivery.size() -1).product; 
		return last;
	}


	public String getName() {
		return this.name;
	}

}
