package edu.bu.met.cs665;


public class Tea extends Beverage {
	
	// Use of enum class, to limit the selection
	enum TeaType{
		Black_Tea,
		Green_Tea,
		Yellow_Tea
		};
	// Instantiating the BeverageType object
	private TeaType kind;
	
	// Constructor for Tea
	public Tea(int unitMilk, int unitSugar, String teaType) {
		
		super(unitMilk, unitSugar);
		
		teaType = teaType.toLowerCase();
		
		// if else, to assign correct tea type
		if(teaType == "black_tea") {
			kind = TeaType.Black_Tea;
		} else if(teaType == "green_tea") {
			kind = TeaType.Green_Tea;
		} else if(teaType == "yellow_tea") {
			kind = TeaType.Yellow_Tea;
		} else {
			throw new IllegalArgumentException("Invalid tea type, please select one that is available");
		}
		
	}
	
	
}
