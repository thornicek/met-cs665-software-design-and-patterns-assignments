package edu.bu.met.cs665;

public class Beverage {
	

	public int unitMilk = 0;
	public int unitSugar = 0;
	
	// Constructor for Beverage
	public Beverage( int unitMilk, int unitSugar) {
		this.unitMilk = unitMilk;
		this.unitSugar = unitSugar;
	}
	

	
	// Method to add Milk
	public void addMilk() {
		if(unitMilk < 3) {
			unitMilk++;
		}else {
			System.out.println("Reached the max number of Milk");
		}
		
	}
	
	// Method to add Sugar
	public void addSugar() {
		if(unitSugar < 3) {
			unitSugar++;
		}else {
			System.out.println("Reached the max number of Sugar");
		}
	}
	
	// Method to get total number of condiments
	public int getTotalNumberOfCondiments() {
		int sum;
		sum = unitMilk + unitSugar;
		return sum;
	}
	
	

}
