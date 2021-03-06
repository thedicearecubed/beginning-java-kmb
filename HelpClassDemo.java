/*
	This is a little Java help file created for you, Kenny Bell!
*/
class Help {

	void helpon(int what) {
			switch (what) {
				case '1': //if
					System.out.println("The if statement:\n");
					System.out.println("if (condition) statement;");
					System.out.println("else statement;");
					break;
				case '2': //switch
					System.out.println("The switch statement:\n");
					System.out.println("switch (expression) {");
					System.out.println("  case constant:");
					System.out.println("    statement sequence");
					System.out.println("    break;");
					System.out.println("  //...");
					System.out.println("}");
					break;
				case '3': //for
					System.out.println("The for statement:\n");
					System.out.println("for(initialization;condition;iteration)");
					System.out.println("statement;");
					break;
				case '4': //while
					System.out.println("The while statement:\n");
					System.out.println("while(condition) statement;");
					break;
				case '5': //do-while
					System.out.println("The do-while:\n");
					System.out.println("do {");
					System.out.println("  statement;");
					System.out.println("} while (condition);");
					break;
				case '6': //break
					System.out.println("The break:\n");
					System.out.println("break; or break label;");
					break;
				case '7': //continue
					System.out.println("The continue:\n");
					System.out.println("continue; or continue label;");
					break;
				default:
					System.out.println("Selection not found");
			}
			System.out.println();
		}
	
	void showmenu() {
		System.out.println("Select a help topic:");
		System.out.println("	1. if");
		System.out.println("	2. switch");
		System.out.println("	3. for");
		System.out.println("	4. while");
		System.out.println("	5. do-while");
		System.out.println("	6. break");
		System.out.println("	7. continue");
		System.out.println("Choose one (q to quit):");
	}

	boolean isvalid(int ch) {
		if(ch < '1' | ch > '7' & ch != 'q') return false;
		else return true;
	}
}

class HelpClassDemo {
	public static void main(String args[])
	 throws java.io.IOException {
		char sel, ignore;
    Help helpinstance = new Help();

		for(;;) {

			do {
				helpinstance.showmenu();

				sel = (char) System.in.read(); //get the selection

				do {
					ignore = (char) System.in.read();
				} while(ignore != '\n');

			} while(!helpinstance.isvalid(sel));  //keep looping until we get a valid selection

			if (sel == 'q') break;

			System.out.println("\n");

			helpinstance.helpon(sel);

		}
	}
}
