package app.delivery;

import java.util.ArrayList;

public class DeliveryRequest implements MessageBase {
	
	public PublisherBase sourceShop = null;
	
	public ArrayList<SubscriberBase> deliveryDriverList = new ArrayList<SubscriberBase>();
	
	public String product = "";

	public DeliveryRequest(String product, PublisherBase sourceShop, ArrayList<SubscriberBase>deliveryDriverList) {
		this.sourceShop = sourceShop;
		this.deliveryDriverList = deliveryDriverList;
		this.product = product;
	}
}
