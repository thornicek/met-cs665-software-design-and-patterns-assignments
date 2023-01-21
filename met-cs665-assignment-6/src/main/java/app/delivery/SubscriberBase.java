/* Tomas Hornicek 
 * 03/10/2022
 * METCS622
 * This file is an interface for subscriber classes
 * Contains a void method to update the delivery instructions
 * */
 

package app.delivery;

import java.util.ArrayList;

public interface SubscriberBase {
	
	void updateSelf(ArrayList<DeliveryRequest> delivery);
}
