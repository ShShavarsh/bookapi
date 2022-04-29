package com.glc;

import java.util.List;
import java.util.ArrayList;


public class ReadingList {
	
	List<ReadingBook> readBooksList = new ArrayList<ReadingBook>();
	
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
	
	public List<? extends Book> getBookByRating(int rating) {
		List<ReadingBook> readBooksListFilteredByRating = new ArrayList<ReadingBook>();
		for(int i = 0;i < readBooksList.size(); i++) {
			if(readBooksList.get(i).getRating() == rating) {
				readBooksListFilteredByRating.add(readBooksList.get(i));
			}
		}
		return readBooksListFilteredByRating;
	}
	
}
