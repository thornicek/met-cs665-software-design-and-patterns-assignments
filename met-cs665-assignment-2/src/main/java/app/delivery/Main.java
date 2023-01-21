/* Tomas Hornicek 
 * 03/10/2022
 * METCS622
 * This file is the main class, used for testing the code
 * */
package app.delivery;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Initialize driver list
		ArrayList<SubscriberBase> deliveryDriverList = new ArrayList<SubscriberBase>();
		
		// Initialize shop
		Shop wallmart = new Shop("Wallmart");
		
		// Create a delivery request
		DeliveryRequest newDelivery = new DeliveryRequest("banana", wallmart, deliveryDriverList);
		
		// Initialize drivers
		Driver Joe = new Driver("Joe", wallmart, newDelivery);
		Driver John = new Driver("John", wallmart, newDelivery);
		Driver Mike = new Driver("Mike", wallmart, newDelivery);
		
		// Add the drivers to the driver list
		deliveryDriverList.add(Joe);
		deliveryDriverList.add(Mike);
		deliveryDriverList.add(John);
		
		// Send out the delivery request
		wallmart.setDeliveryRequest(newDelivery);
		
	}

}
