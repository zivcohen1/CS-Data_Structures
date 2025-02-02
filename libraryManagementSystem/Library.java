package libraryManagementSystem;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;
	private ArrayList<Member> members;

	public Library() {
		this.books = new ArrayList<>();
		this.members = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added: "+book.getTitle());
	}

	public void removeBook(Book book) {
		books.remove(book);
	}

	public void searchBook(String title) {

		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				System.out.println("Yes! we have this book" + title);
				return;
			} 
		}System.out.println("Sorry we can't find the requsted book " + title);
			
		
	}

	public void registerMember(Member member) {
		members.add(member);
		System.out.println("Member registered: " + member.getName());
	}

	public void borrowBook(Member member, Book book) {

		books.remove(book);
		member.borrowBook(book);
		book.borrowBook(); // Mark as unavailable
		System.out.println(member.getName() + " borrowed: " + book.getTitle());

		// System.out.println("Book is not available.");

	}

	public void returnBook(Member member, Book book) {
		member.returnBook(book);
		book.returnBook();
		books.add(book);
		System.out.println(member.getName() + " returned: " + book.getTitle());

	}

}
