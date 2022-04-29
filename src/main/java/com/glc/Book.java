package com.glc;

public class Book {

	String title;
	String author;
	int length;
	int year;
	

	public Book(String title, String author,int length, int year) {
		this.title = title;
		this.author = author;
		this.length = length;
		this.year = year;	
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
