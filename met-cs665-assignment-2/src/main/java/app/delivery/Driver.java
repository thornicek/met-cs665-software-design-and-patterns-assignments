/* Tomas Hornicek 
 * 03/10/2022
 * METCS622
 * This file is the Driver class, that implements the SubscriberBase interface
 * Contains a constructor for the Driver, overrides the SubscriberBase interface method; updateSelf, has a getter method getName and a getMyLatestUpdate method
 * to print out the product name
 * */
package app.delivery;

public class Driver implements SubscriberBase {
	
	private String name;
	private Shop shop;
	public DeliveryRequest delivery;
	
	public Driver(String name, Shop shop, DeliveryRequest delivery) {
		this.name = name;
		this.shop = shop;
		this.delivery = delivery;
		this.shop.subscribe(this);
	}
	
	// Override the updateSelf() to display the drivers name and the delivery product
	@Override
	public void updateSelf(DeliveryRequest delivery) {
		this.delivery = delivery;
		
		System.out.println("Driver: " + this.getName() + " has received the message and is ready to deliver: " + getMyLatestUpdate());
		
	}


	public String getMyLatestUpdate() {
		return this.delivery.product;
	}


	public String getName() {
		return this.name;
	}

}
