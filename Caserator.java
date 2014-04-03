/*
	Caserator: Uppers lowercase letters and lowers uppercase letters. Stops at a period
*/

class Caserator {
	public static void main(String args[]) 
		throws java.io.IOException {

		char ch;
		int ncc = 0;

		do {
			ch = (char) System.in.read();
			if (ch >= 'a' & ch <= 'z') {
				System.out.print((char)(ch - 32));
				ncc++;
			} else if (ch >= 'A' & ch <= 'Z') {
				System.out.print((char) (ch + 32));
				ncc++;
			} else {
				System.out.print(ch);
			}
		} while (ch != '.');
		System.out.println("\nNumber of case changes: " + ncc);
	}
}
