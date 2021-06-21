package com.kodilla.patterns2.adapter.bookclassifier;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite extends TestCase {

    @Test
    public void publicationYearMedianTest(){
        //When
        Set<Book> books = new HashSet<>();

        Book book1 = new Book("Author1", "Title1", 2000, "1");
        Book book2 = new Book("Author2", "Title2", 2001, "2");
        Book book3 = new Book("Author3", "Title3", 2002, "3");
        Book book4 = new Book("Author4", "Title4", 2003, "4");
        Book book5 = new Book("Author5", "Title5", 2004, "5");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //Given
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        System.out.println(median);
        assertEquals(median, 2002, 0);
    }
}