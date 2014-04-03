// Uppercase letters.
class UpCase {
	public static void main(String args[]) {
		char ch;

		for(int i=0;i < 10; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);

			// This statement turns of the 6th bit (subtracts 32).
			ch = (char) ((int) ch & 65503); // ch is now uppercase

			System.out.print(ch + " ");
		}
	}
}
