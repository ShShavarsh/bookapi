package com.glc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void onFirstCallBookListShouldBeEmpty() {
		// SETUP
		ReadingList cut = new ReadingList();
		// Execute
		List<? extends Book> books = cut.getBooks();
		// ASSERT
		assertEquals(0, books.size());
	}

	@Test
	public void onFirstBookAddedNumberReadShouldReturnOne() {
		// SETUP
		ReadingList cut = new ReadingList();
		Book book = new Book("Art of Loving", "Erich Fromm", 133, 4);// title,author,length,year

		// Execute
		cut.addBook(book, "January 1", 4);

		// ASSERT
		assertEquals(1, cut.numberRead());
	}

	@Test
	public void afterAddingAdditionalBooksNumberReadShouldReturnCorrectNumberOfBooks() {
		// SETUP
		ReadingList cut = new ReadingList();
		for (int i = 0; i < 4; i++) {
			Book book = new Book("Art of Loving", "Erich Fromm", 133, 4);
			cut.addBook(book, "January 1", 4);
		}

		// Execute
		int numberOfBooks = cut.numberRead();

		// ASSERT
		assertEquals(4, numberOfBooks);
	}

	@Test
	public void afterRemovingBookByTitleBookShouldNotBeInList() {
		// SETUP
		ReadingList cut = new ReadingList();
		Book book = new Book("Art of Loving", "Erich Fromm", 133, 4);
		cut.addBook(book, "January 1", 4);

		// Execute
		cut.deleteBook(book.title);

		// ASSERT
		for (int i = 0; i < cut.getReadBooksList().size(); i++) {
			assertFalse(cut.getReadBooksList().get(i).getTitle().equals(book.title));
		}
		
	}
	
	@Test
	public void afterAddingBookToEmptyListItShouldBeInList() {
		// SETUP
		ReadingList cut = new ReadingList();
		Book book = new Book("Art of Loving", "Erich Fromm", 133, 4);
		cut.addBook(book, "January 1", 4);

		// Execute
		List<? extends Book> bookList = cut.getBooks();
		Book book1 = bookList.get(0);
		
		// ASSERT	
		assertTrue(book1.equals(book));
	}
	
	//Given when I call getBooksByRating(), It should return a list of books that all have that rating.
	@Test
	public void getBooksByRatingshouldReturnListofBooksWithGivenRating() {
		// SETUP
		ReadingList cut = new ReadingList();
		Book book1 = new Book("Art of Loving", "Erich Fromm", 133, 4);
		Book book2 = new Book("Art of Being", "Erich Fromm", 144, 4);
		cut.addBook(book1, "January 1", 4);
		cut.addBook(book2, "January 3", 4);

		// Execute
		List<? extends Book> bookList = cut.getBookByRating(4);
		
		// ASSERT	
		for (int i = 0; i< bookList.size();i++) {
			assertTrue(((ReadingBook) bookList.get(i)).getRating() == 4);
			
		}
	}

}
