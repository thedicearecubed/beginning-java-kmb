/*
  Using the for loop to generate a binary progression
*/

class BinaryProgression {
  public static void main(String args[]) {
		for(int i = 1; i < 10000; i *= 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
