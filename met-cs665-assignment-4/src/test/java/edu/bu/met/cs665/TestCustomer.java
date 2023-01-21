package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;



public class TestCustomer {
	
	// Testing the CustomerID 
	 @Test
	  public void testGetCustomer() {

	    CustomerID student = new CustomerID(12);
	    assertEquals(12 , student.id);

	  }
	 
	 
	
}
