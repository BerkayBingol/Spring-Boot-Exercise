package io.javabrains.springbootstarter.books;

public class Book {

	private int BookID;
	private String BookName;
	private String bookdescription;

	public Book() {
		
	}
	public Book(int BookID, String BookName, String bookdescription) {
		super();
		this.BookID = BookID;
		this.BookName = BookName;
		this.bookdescription = bookdescription;
	}
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int BookID) {
		this.BookID = BookID;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String BookName) {
		this.BookName = BookName;
	}
	public String getBookdescription() {
		return bookdescription;
	}
	public void setBookdescription(String bookdescription) {
		this.bookdescription = bookdescription;
	}

	

	


	


	
	
}
