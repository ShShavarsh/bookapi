package com.glc;

import static org.junit.Assert.assertTrue;
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
}
