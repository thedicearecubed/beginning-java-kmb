/*
  Create the Vehicle class and have some fun with it
*/

class Vehicle {
	int passengers; //number of passengers
	int fuelcap;	  //fuel capacity in gallons
	int mpg; 				//fuel consumption in miles per gallon

	//Display the range
	int range() {
		return fuelcap * mpg;
	}

	//Calculate amount of fuel needed to travel given miles
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

// This class declares an object of type Vehicle.
class CompFuel {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		int range1, range2;

		double gallons;
		int dist = 252;

		// assign values to the fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// assing values to sportscar field
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		System.out.println("Minivan can carry " + minivan.passengers + 
											" with range of " + minivan.range() + " Miles");

		System.out.println("To go " + dist + " miles, minivian needs " +
													minivan.fuelneeded(dist) + " gallons of fuel.");

		System.out.println("Sportscar can carry " + sportscar.passengers +
											" with range of " + sportscar.range() + " Miles");

		System.out.println("To go " + dist + " miles, sportscar needs " +
													sportscar.fuelneeded(dist) + " gallons of fuel.");

	}
}
