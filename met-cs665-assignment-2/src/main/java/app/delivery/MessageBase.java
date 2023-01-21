/* Tomas Hornicek 
 * 03/10/2022
 * METCS622
 * This file is an interface for the deliveryRequest class
 * */
package app.delivery;

import java.util.ArrayList;

public interface MessageBase {
	
	PublisherBase sender = null;
	
	ArrayList<SubscriberBase> receiver = new ArrayList<SubscriberBase>();

}
