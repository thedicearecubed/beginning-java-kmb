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
}

// This class declares an object of type Vehicle.
class AddMeth {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		// assign values to the fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// assing values to sportscar field
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		System.out.print("Minivan can carry " + minivan.passengers + ". ");
		minivan.range();

		System.out.print("Sportscar can carry " + minivan.passengers + ". ");
		sportscar.range();			
	}
}
