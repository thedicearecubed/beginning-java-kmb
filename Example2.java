/*
  This demonstrates a variable

  Call this file Example2.java
*/
class FindPrimes {

	public static void main(String args[]) {

	int pc;
	int bound = 100;

	for (pc = 2; pc <= bound; pc++) {
		int dc;
		for (dc = 2; dc <= (int) Math.sqrt(pc); dc++) {
			if (((pc % dc) == 0) && (dc == Math.sqrt(pc))) {
				System.out.println("Number " + pc + " is prime.");
			}
		}

	}
}
