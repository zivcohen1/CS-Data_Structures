package libraryManagementSystem;

public class TestLibrary {

	public static void main(String[] args) {
	 Library lib = new Library();
	 
	//create books
	 Book b1 = new Book("1234445","Java 2012", "Qu Wehio");
	 Book b2 = new Book("12278","c++ 2012", "Elon Mask");
	 Book b3 = new Book("129805","Around The World", "Donalnd Trump");
	 
	 //create members
	 Member m1 = new Member("1221","Ziv");
	 Member m2 = new Member("2234","Avi");
	 
	 //adding books
	 lib.addBook(b3);
	 lib.addBook(b2);
	 lib.addBook(b1);
	 
	 
	 
	 lib.registerMember(m2);
	 lib.registerMember(m1);
	 
	 lib.borrowBook(m2, b3);
	 
	 
	 lib.searchBook("Around The World");
	 lib.searchBook("WW2");
	 
	 lib.borrowBook(m1, b1);
	 
	 
	 lib.returnBook(m2, b3);
	 lib.searchBook("Around The World");
	 
	 }
	
	

	}

