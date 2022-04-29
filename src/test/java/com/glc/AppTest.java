package com.glc;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void onFirstCallBookListShouldBeEmpty()
    {
    	//SETUP
    	ReadingList cut = new ReadingList();
    	//Execute
    	List<? extends Book> books = cut.getBooks();
    	//ASSERT
    	assertEquals(0, books.size());
    }
    
    @Test
    public void onFirstBookAddedNumberReadShouldReturnOne()
    {
    	//SETUP
    	ReadingList cut = new ReadingList();
    	Book book = new Book("Art of Loving","Erich Fromm",133,4);//title,author,length,year
    	
    	//Execute
    	cut.addBook(book,"January 1", 4);
    	
    	//ASSERT
    	assertEquals(1, cut.numberRead());
    }
    
  
    @Test
    public void afterAddingAdditionalBooksNumberReadShouldReturnCorrectNumberOfBooks()
    {
    	//SETUP
    	ReadingList cut = new ReadingList();
    	for(int i = 0;i < 4; i++) {
    		Book book = new Book("Art of Loving","Erich Fromm",133,4);
    		cut.addBook(book,"January 1", 4);
    	}
    	
    	//Execute
    	int numberOfBooks = cut.numberRead();
    	
    	//ASSERT
    	assertEquals(4,numberOfBooks);
    }
}
