/*
  This program takes in input from stdin and counts the number of spaces until reaching a period.
*/
class NumberSpaces {
	public static void main(String args[]) 
		throws java.io.IOException {
		char in = '\0';
		int n_spaces = 0;
		while (in != '.') { // might make more sense to do a forever loop breaking on a period?
			in = (char) System.in.read();
      if (in == ' ') n_spaces++;
		}
		System.out.println("Number of spaces: " + n_spaces);
	}
}
