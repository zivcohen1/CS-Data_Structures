package libraryManagementSystem;

import java.util.ArrayList;

public class Member {
	private String memberID;
	private String name;
	private ArrayList<Book> borrowedBooks;
	private boolean isRegistered;
	
	public Member(String memberID,String name) {
		this.memberID = memberID;
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
		this.isRegistered = true;
	}
	public String getMemberID() {
		return memberID;
		
	}
	public String getName() {
		return name;
	}
	
	public void registerMember() {
		if(!isRegistered) {
			isRegistered=true;
		}
	}
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
			
			
		}
		
	
	public void returnBook(Book book) {
		 borrowedBooks.remove(book);
			
		}
	public ArrayList<Book> getBorrowedBooks(){
		return borrowedBooks;
	}
		
	

}
