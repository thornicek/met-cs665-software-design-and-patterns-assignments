package edu.bu.met.cs665;

public class Coffee extends Beverage {
	// Use of enum class, to limit the selection
	private enum CoffeeType{
		Espresso,
		Americano,
		Latte_Machiato
		};
	// Instantiating the BeverageType object
	private CoffeeType kind;
	
	// Constructor for coffee
	public Coffee(int unitMilk, int unitSugar, String coffeeType) {
		super(unitMilk, unitSugar);
		 
		coffeeType = coffeeType.toLowerCase();
		
		// If else to assign correct coffee type
		if(coffeeType == "espresso") {
			kind = CoffeeType.Espresso;
		} else if(coffeeType == "americano") {
			kind = CoffeeType.Americano;
		} else if(coffeeType == "latte_machiato") {
			kind = CoffeeType.Latte_Machiato;
		} else {
			throw new IllegalArgumentException("Invalid coffee type, please select one that is available");
		}
		
	}
	

	
}
