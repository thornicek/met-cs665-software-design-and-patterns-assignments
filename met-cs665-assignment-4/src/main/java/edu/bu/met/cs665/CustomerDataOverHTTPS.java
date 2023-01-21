package edu.bu.met.cs665;

/**
 * CustomerDataOverHTTPS interface used for retrieving data via HTTPS Connect
 */
public interface CustomerDataOverHTTPS {
	
	void printCustomer(CustomerID id);
	void getCustomer_withHTTPSConnect(CustomerID id);
}
