/* Tomas Hornicek 
 * 03/10/2022
 * METCS622
 * This file is the Shop class. It implements the publisher interface. 
 * Contains setter and getter method for name, Shop constructor, setDeliveryRequest(),
 * and overrides the subscribe, unsubscribe and notifySubscribers methods from interface
 * */
package app.delivery;

import java.util.ArrayList;

public class Shop implements PublisherBase {
	
	public String name;
	public ArrayList<DeliveryRequest> delivery;
	
	// ArrayList to contain delivery drivers
	private ArrayList<SubscriberBase> deliveryDriverList = new ArrayList<SubscriberBase>();
	
	public Shop(String name) {
		this.name = name;
		this.setDeliveryRequest(delivery);
	}
	
	String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// Method to notify the subscribers that product is ready for delivery
	public void setDeliveryRequest(ArrayList<DeliveryRequest> delivery) {
		this.delivery = delivery;
		this.notifySubscribers();	
	}
	
	// Add subscriber
	@Override
	public void subscribe(SubscriberBase o) {
		deliveryDriverList.add(o);
		
	}
	
	// Remove subscriber
	@Override
	public void unsubscribe(SubscriberBase o) {
		deliveryDriverList.remove(o);
		
	}
	
	// Call the update method on subscribers, when there is change
	@Override
	public void notifySubscribers() {
		for(SubscriberBase o : deliveryDriverList) {
			o.updateSelf(this.delivery);
		}
		
	}

}
