package edu.bu.met.cs665;



public class Main {
  /**
   * A main method to run examples.
   * Testing retrieving data via the USB connect, HTTPS connect and via the adapter
   */
  public static void main(String[] args) {
	  
	  // The USB Connect data retrieval
	  CustomerID customerUSB = new CustomerID(1);
	  CustomerDataUSB searchUSB = new CustomerDataUSB();
	  searchUSB.getCustomer_withUSBConnect(customerUSB);
	  searchUSB.printCustomer(customerUSB);
	  
	  // The HTTPS Connect data retrieval
	  CustomerID customerHTTPS = new CustomerID(2);
	  CustomerDataHTTPS searchHTTPS = new CustomerDataHTTPS();
	  searchHTTPS.getCustomer_withHTTPSConnect(customerHTTPS);
	  searchHTTPS.printCustomer(customerHTTPS);
	  
	  // Retrieving data via HTTPS Connect, using the adapter
	  CustomerID customerAdapter = new CustomerID(3);
	  // Adaptee
	  CustomerDataOverHTTPS searchAdapter = new CustomerDataHTTPS();
	  // Adapter
	  CustomerData adapterSearch = new USBToHTTPSAdapter(searchAdapter);
	  adapterSearch.getCustomer_withUSBConnect(customerAdapter);
	  adapterSearch.printCustomer(customerAdapter);
	  



  }
}