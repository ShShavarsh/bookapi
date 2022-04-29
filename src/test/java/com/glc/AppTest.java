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
    	List<Book> books = cut.getBooks();
    	//ASSERT
    	assertEquals(0, books.size());
    }
    
    @Test
    public void onFirstBookAddedNumberReadShouldReturnOne()
    {
    	//SETUP
    	ReadingList cut = new ReadingList();
    	Book book = new Book("Art of Loving","Arich Fromm",133,4);//title,author,length,year
    	
    	
    	//Execute
    	cut.addBook(book,"January 1", 4);
    	
    	//ASSERT
    	assertEquals(1, cut.numberRead());
    }
}
