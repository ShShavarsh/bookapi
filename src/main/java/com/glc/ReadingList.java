package com.glc;

import java.util.List;
import java.util.ArrayList;


public class ReadingList {
	List<BookItem> readBooksList = new ArrayList<BookItem>();
	
	private class BookItem{
		private Book book;
		private String dateRead;
		private int rating;
		public BookItem(Book book, String dateRead, int rating){
			this.book = book;
			this.dateRead = dateRead;
			this.rating = rating;
		}
	}
	
	
	
	public ReadingList() {
		
	}
	
	public List<Book> getBooks(){
		return new ArrayList<Book>();
	}
	
	public void addBook(Book book, String dateRead,int rating){
		this.readBooksList.add(new BookItem(book,dateRead,rating));
	}

	public int numberRead() {
		return this.readBooksList.size();
				
	}
	
	
}
