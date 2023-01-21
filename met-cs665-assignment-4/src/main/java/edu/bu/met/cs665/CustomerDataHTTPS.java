package edu.bu.met.cs665;

/**
 * CustomerDataUSB class uses the CustomerDataOverHTTPS interface
 * CustomerDataUSB class prints out the data retrieved via HTTPS Connect
 */

public class CustomerDataHTTPS implements CustomerDataOverHTTPS {

	@Override
	public void printCustomer(CustomerID id) {
		System.out.println("The Customer with id:" + id.id + ", who's data has been retrieved via HTTPS, is being printed");
		
	}

	@Override
	public void getCustomer_withHTTPSConnect(CustomerID id) {
		System.out.println("Customer with id:" + id.id + ", had it's data retreived via HTTPS Connect");
		
	}

}
