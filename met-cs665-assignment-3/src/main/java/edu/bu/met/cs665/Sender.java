/* Tomas Hornicek 
 * 17/10/2022
 * METCS622
 * This file is the Sender class.
 * The Sender class contains an object that implements the Strategy interface and that is used as an argument in the setter method.
 * The class also has a constructor, that sets the strategy to null and setter and getter methods for strategy.
 * */
package edu.bu.met.cs665;

public class Sender {
	
	// Create an object that implements the Strategy interface
	private Strategy strategy;
	
	public Sender() {
		strategy = null;
	}
	
	// Setters and Getters 
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public Strategy getStrategy() {
		return strategy;
	}

}
