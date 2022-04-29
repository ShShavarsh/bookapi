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
    
   // Given that I have an empty list, when I add additional books to the list I expect the numberRead to return the total number of books in my list
    @Test
    public void afterAddingAdditionalBooksNumberReadShouldReturnCorrectNumberOfBooks()
    {
    	//SETUP
    	ReadingList cut = new ReadingList();
    	
    	Book book1 = new Book("Art of Loving","Erich Fromm",133,4);
    	Book book2 = new Book("Art of Loving","Erich Fromm",133,4);
    	Book book3 = new Book("Art of Loving","Erich Fromm",133,4);
    	Book book4 = new Book("Art of Loving","Erich Fromm",133,4);
    	
    	cut.addBook(book1,"January 1", 4);
    	cut.addBook(book2,"January 1", 4);
    	cut.addBook(book3,"January 1", 4);
    	cut.addBook(book4,"January 1", 4);
    	
    	//Execute
    	int numberOfBooks = cut.numberRead();
    	
    	//ASSERT
    	assertEquals(4,numberOfBooks);
    }
}
