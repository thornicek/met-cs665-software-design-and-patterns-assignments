/* Tomas Hornicek 
 * 03/10/2022
 * METCS622
 * This file is the main class, used for testing the code
 * Contains the main() for testing code and the addDrivers() for adding drivers to
 * the specific shop drivers list
 * */
package app.delivery;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Initialize driver list
		ArrayList<SubscriberBase> deliveryDriverListMeijer = new ArrayList<SubscriberBase>();
		ArrayList<SubscriberBase> deliveryDriverListWallmart = new ArrayList<SubscriberBase>();
		
		// Initialize delivery list
		ArrayList<DeliveryRequest> productDeliveryListWallmart = new ArrayList<DeliveryRequest>();
		ArrayList<DeliveryRequest> productDeliveryListMeijer = new ArrayList<DeliveryRequest>();
		
		// Initialize shop
		Shop wallmart = new Shop("Wallmart");
		
		Shop meijer = new Shop("Meijer");
		
		// Create a delivery request
		DeliveryRequest newDelivery = new DeliveryRequest("banana", wallmart, deliveryDriverListWallmart);
		productDeliveryListWallmart.add(newDelivery);
		// Initialize drivers
		Driver Joe = new Driver("Joe", wallmart);
		Driver John = new Driver("John", wallmart);
		Driver Mike = new Driver("Mike", meijer);

		
		// After 3rd refactoring add the drivers to the driver list
		addDrivers(deliveryDriverListWallmart,Joe);
		addDrivers(deliveryDriverListWallmart,Mike);
		addDrivers(deliveryDriverListMeijer,John);
		
		DeliveryRequest newerDelivery = new DeliveryRequest("apple", meijer, deliveryDriverListMeijer);
		productDeliveryListMeijer.add(newerDelivery);
		
		// Send out the delivery request
		wallmart.setDeliveryRequest(productDeliveryListWallmart);
		meijer.setDeliveryRequest(productDeliveryListMeijer);
		
	}
	
	// Add drivers to drivers list
	private static void addDrivers(ArrayList<SubscriberBase> deliveryDriverList, Driver driver) {
		deliveryDriverList.add(driver);
		
	}

}
