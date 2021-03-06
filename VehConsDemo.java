/*
  Create the Vehicle class and have some fun with it
*/

class Vehicle {
	int passengers; //number of passengers
	int fuelcap;	  //fuel capacity in gallons
	int mpg; 				//fuel consumption in miles per gallon

	// This is a constructor for Vehicle.
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

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
class VehConsDemo {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		double gallons;
		int dist = 252;

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
