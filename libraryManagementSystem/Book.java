package libraryManagementSystem;

public class Book {
	private String bookID;
	private String title;
	private String author;
	private boolean isAvailable;
	
	public Book(String bookID, String title, String author) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	public String getBookID() {
		return bookID;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	
	public void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
		}
	}
	public void returnBook() {
		if (!isAvailable) {
			isAvailable = true;
		}
	}
	public void displayBookDetails() {
		System.out.println("BookID"+ bookID+"\nTitle: "+title+"\nAuthor "+ author+"\nIs Available? "+isAvailable); 
	}

}
