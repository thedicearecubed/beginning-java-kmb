class Stack {
	private char q[]; // this array holds the Stack
	private int putloc; // the put and get indices

	Stack(int size) {
		q = new char[size + 1]; // allocate memory for Stack
		putloc = 0;
	}

	// Construct a Stack from a Stack
	Stack(Stack ob) {
		putloc = ob.putloc;
		q = new char[ob.q.length];
		
		// copy elements
		for(int i=0; i <= putloc; i++)
			q[i] = ob.q[i];
	}

	// put a character into the Stack
	void push(char ch) {
		if(putloc==q.length-1) {
			System.out.println(" - Stack is full.");
			return;
		}


		q[putloc] = ch;
		putloc++;
	}

	// get a character from the Stack
	char pop() {
		if(putloc == 0) {
			System.out.println(" - Stack is empty.");
			return (char) 0;
		}
		
		putloc--;
		return q[putloc];
	}
}

class SDemo {
	public static void main(String args[]) {
		Stack s = new Stack(5);
		int i;
		
		for(i=0; i<5; i++)
			s.push((char) ('a' + i));

		for(i=0; i<3; i++)
			System.out.print(s.pop() + " ");
		System.out.println();

		for(i=0; i<4; i++)
			s.push((char) ('j' + i));

		for(i=0; i<5; i++)
			System.out.print(s.pop() + " ");

		System.out.println();

		s.pop();
		
	}
}
