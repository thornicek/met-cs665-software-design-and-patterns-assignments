/* Tomas Hornicek 
 * 03/10/2022
 * METCS622
 * This file is an interface for publisher classes
 * Contains a void methods; subscribe, unsubscribe and notifySubscribers
 * */
package app.delivery;

public interface PublisherBase {
	
	public void subscribe(SubscriberBase o);
	
	public void unsubscribe(SubscriberBase o);
	
	public void notifySubscribers();
		
}
