package edu.bu.met.cs665;
/**
 * USBToHTTPSAdapter class uses CustomerData interface.
 * This class is the Adapter class, it is responsible for mapping the 
 * USB connect and print methods back to the adaptee and then handles it.
 * 
 */
public class USBToHTTPSAdapter implements CustomerData {
	
	private CustomerDataOverHTTPS getDataHTTPS;
	
	public USBToHTTPSAdapter(CustomerDataOverHTTPS  getDataHTTPS) {
		this.getDataHTTPS = getDataHTTPS;
	}
	// Mapping the adapter methods to the adaptee
	@Override
	public void printCustomer(CustomerID id) {
		getDataHTTPS.printCustomer(id);
		
	}

	@Override
	public void getCustomer_withUSBConnect(CustomerID id) {
		getDataHTTPS.getCustomer_withHTTPSConnect(id);
		
	}

}
