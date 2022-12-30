import java.util.ArrayList;

public class Library {	
	String library_address;
	ArrayList<Book> books;
	
	// Assign 'address' to 'library_address' and create a new ArrayList
	public Library(String address) {
		library_address = address;
		books = new ArrayList<>();
	}
	
	// Print opening hours
	// Since all libraries have the same hours, make static method
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	
	// Print address
	public void printAddress() {
		System.out.println(library_address);
	}
	
	// Add a book to ArrayList
	public void addBook(Book book) {
		books.add(book);
	}
	
	// Borrow a book 
	public void borrowBook(String bookTitle) {
		for (int i = 0; i < books.size(); i++) {
			// If a title in ArrayList is same as 'bookTitle'
			if (books.get(i).getTitle().equals(bookTitle)) {
				// If the book is not borrowed
				if (!(books.get(i).isBorrowed())) {
					// Print a message that you successfully borrowed
					System.out.println("You successfully borrowed " + bookTitle);
					// Mark the book as borrowed
					books.get(i).borrowed();
				}
				// If the book is borrowed, print a message that the book is already borrowed
				else 
					System.out.println("Sorry, this book is already borrowed.");
				// Terminate the method named 'borrowBook' not to print a sentence below
				return;
			}
		}
		// If there's no 'bookTitle' in ArrayList, print a message that the book is not in catalog
		System.out.println("Sorry, this book is not in our catalog.");
	}
	
	// Print available books
	public void printAvailableBooks() {
		// If there's no book in ArrayList, print a message that no book in catalog
		if (books.isEmpty())
			System.out.println("No book in catalog");
		// If there's at least 1 book
		else {
			for (int i = 0; i < books.size(); i++) {
				// If the book is not borrowed, print a title of book
				if (!(books.get(i).isBorrowed()))
					System.out.println(books.get(i).getTitle());
				}
		}
	}
	
	// Return a book
	public void returnBook(String bookTitle) {
		for (int i = 0; i < books.size(); i++) {
			// If a title in ArrayList is same as 'bookTitle'
			if (books.get(i).getTitle().equals(bookTitle)) {
				// Mark the book as returned(=not borrowed) 
				books.get(i).returned();
				System.out.println("You successfully returned " + bookTitle);
				}
		}
	}
	
	public static void main(String[] args) {
		//print name and school numbers
		System.out.println("Name: Lee Jisu");
		System.out.println("School Numbers: 202155592");
		System.out.println();
		
		// Create two libraries
		Library firstLibrary = new Library("10 Main St."); 
		Library secondLibrary = new Library("228 Liberty St.");
		
		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code")); 
		firstLibrary.addBook(new Book("Le Petit Prince")); 
		firstLibrary.addBook(new Book("A Tale of Two Cities")); 
		firstLibrary.addBook(new Book("The Lord of the Rings"));
		
		// Print opening hours and the addresses
		System.out.println("Library hours:"); 
		printOpeningHours();
		System.out.println();
		System.out.println("Library addresses:"); 
		firstLibrary.printAddress();
		secondLibrary.printAddress(); 
		System.out.println();
		
		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings"); 
		System.out.println();
		
		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();
		
		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings"); 
		System.out.println();
		
		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}
