package edu.bu.met.cs665;


import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;


public class TestBeverageMachine {
	// JUnit test to test Coffee
	@Test
	public void testCondimentNumber() {
		// Create a coffee
		Coffee myCoffee = new Coffee(0, 0, "espresso");
		
		// add 2 unit Milk
		myCoffee.addMilk();
		myCoffee.addMilk();
		
		// add 1 unit Sugar
		myCoffee.addSugar();
		
		// Check the total number of condiments added, the answer should be 3
		assertEquals(myCoffee.getTotalNumberOfCondiments(),3);
		
	}
	
	// JUnit test to test Tea
	@Test
	public void testSugarAdded() {
		// Create a tea 
		Tea myTea = new Tea(0, 0, "black_tea");
		
		// Add 3 sugars
		myTea.addSugar();
		myTea.addSugar();
		myTea.addSugar();
		
		// Check total number of sugars added
		assertEquals(myTea.getTotalNumberOfCondiments(), 3);
		
		// Try adding 4th sugar
		myTea.addSugar();
		
		// Check total number of sugars added
		// This test passes as there can't be more than 3 units of sugar added, user gets message in the console
		assertEquals(myTea.getTotalNumberOfCondiments(), 3);
		
		
		// Add Milk to test whether a 4th condiment can be added
		myTea.addMilk();
		assertEquals(myTea.getTotalNumberOfCondiments(), 4);
		
		
		
	}
}
