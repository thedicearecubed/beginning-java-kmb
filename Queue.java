class Queue {
	private char q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices

	Queue(int size) {
		q = new char[size + 1]; // allocate memory for queue
		putloc = getloc = 0;
	}

	// Construct a Queue from a Queue
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		// copy elements
		for(int i=getloc+1; i <= putloc; i++)
			q[i] = ob.q[i];
	}

	// put a character into the queue
	void put(char ch) {
		if(putloc==q.length-1) {
			System.out.println(" - Queue is full.");
			return;
		}

		putloc++;
		q[putloc] = ch;
	}

	// get a character from the queue
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		getloc++;
		return q[getloc];
	}
}
