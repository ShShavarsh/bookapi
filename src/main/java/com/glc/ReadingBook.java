package com.glc;

public class ReadingBook extends Book{
	
	private String dateRead;
	private int rating;
	
	public ReadingBook(Book book, String dateRead, int rating){
		super(book.title,book.author,book.length,book.year);
		this.setDateRead(dateRead);
		this.setRating(rating);
	}
	
	public void setDateRead(String dateRead) {
		this.dateRead = dateRead;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return rating;
		
	}
}