// Demonstrate protected
package bookpackext;
import bookpack.*;

class ExtBook extends Book {
	private String publisher;

	public ExtBook(String t, String a, int d, String p) {
		super(t,a,d);
		publisher = p;
	}

	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}

	public String getPublisher() { return publisher; }
	public void setPublisher(String p) { publisher = p; }

	/* These are okay because subclass can access
	a proctected member */
	public String getTitle() { return title; }
	public void setTitle(String t) { title = t; }
	public String getAuthor() { return author; }
	public void setAuthor(String a) { author = a; }
	public int getPubDate() { return pubDate; }
	public void setPubDate(int d) { pubDate = d; }
}

class ProtectDemo {
	public static void main(String args[]) {
		ExtBook books[] = new ExtBook[5];

		books[0] = new ExtBook("Alice in Wonderland", "Charles Dickens", 1923, "Scholastic"); 
		books[1] = new ExtBook("Treasure Island", "Some Guy", 1923, "Barnes and Noble"); 
		books[2] = new ExtBook("Tale of Two Cities", "Karl Marx", 1893, "Penguin"); 
		books[3] = new ExtBook("Man on Fire", "Susan Knowles", 1999, "Man Pants"); 
		books[4] = new ExtBook("AmpliTUDE", "Keanu Reeves", 1994, "McGraw-Hill"); 

		for(int i = 0; i < books.length; i++) books[i].show();

		//Find books by author
		System.out.println("Showing all books by Keanu Reeves.");
		for(int i=0; i < books.length; i++)
			if(books[i].getAuthor() == "Keanu Reeves")
				System.out.println(books[i].getTitle());

//	books[0].title = "Captain Meowmers McGarnacle";  //This will fail because Book.title is protected
	}
}
