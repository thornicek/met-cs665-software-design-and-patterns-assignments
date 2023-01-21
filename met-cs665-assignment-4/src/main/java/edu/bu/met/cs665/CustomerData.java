package edu.bu.met.cs665;

/**
 * CustomerData interface used for retrieving data via USB Connect
 */
public interface CustomerData {
	
   void printCustomer(CustomerID id);
   void getCustomer_withUSBConnect(CustomerID id);
}
