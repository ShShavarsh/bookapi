package com.glc;

import java.util.List;
import java.util.ArrayList;


public class ReadingList {
	
	List<ReadingBook> readBooksList = new ArrayList<ReadingBook>();
	

	protected class ReadingBook extends Book{
		
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
	}
	
	
	
	public ReadingList() {
		
	}
	
	public List<ReadingBook> getReadBooksList() {
		return readBooksList;
	}
	
	public List<? extends Book> getBooks(){
		return readBooksList;
	}
	
	public void addBook(Book book, String dateRead,int rating){
		this.readBooksList.add(new ReadingBook(book,dateRead,rating));
	}

	public int numberRead() {
		return this.readBooksList.size();
				
	}

	public void deleteBook(String title) {
		for(int i = 0;i < readBooksList.size(); i++) {
			if(readBooksList.get(i).getTitle().equals(title)) {
				readBooksList.remove(i);
			}
			
		}
	}
	
	
}
