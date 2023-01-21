package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import app.delivery.DeliveryRequest;
import app.delivery.Shop;
import app.delivery.SubscriberBase;
import app.delivery.*;

public class TestDeliveryApp {
	
	public TestDeliveryApp() {}
	
	// Test the updateSelf method/ DeliveryRequest object
	@Test
	public void testUpdateSelf() {
		// Initialize driver list
		ArrayList<SubscriberBase> deliveryDriverListTest = new ArrayList<SubscriberBase>();
		// Initialize shop
		Shop wallmart = new Shop("Wallmart");
		// Create a delivery request
		DeliveryRequest newDelivery = new DeliveryRequest("banana", wallmart, deliveryDriverListTest);
		
		assertEquals("banana", newDelivery.product);
		assertEquals(wallmart, newDelivery.sourceShop);
		assertEquals(deliveryDriverListTest, newDelivery.deliveryDriverList);
	}
	
	
}
