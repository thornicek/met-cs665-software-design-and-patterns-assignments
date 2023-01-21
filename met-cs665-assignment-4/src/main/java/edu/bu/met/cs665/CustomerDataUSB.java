package edu.bu.met.cs665;

/**
 * CustomerDataUSB class uses the CustomerData interface
 * CustomerDataUSB class prints out the data retrieved via USB Connect
 */
public class CustomerDataUSB implements CustomerData {
	
	
	@Override
	public void printCustomer(CustomerID id) {
		System.out.println("The Customer with id:" + id.id + ", who's data has been retrieved via USB, is being printed");
		
	}

	@Override
	public void getCustomer_withUSBConnect(CustomerID id) {
		System.out.println("Customer with id:" + id.id + ", had it's data retreived via USB Connect");
		
	}

}
