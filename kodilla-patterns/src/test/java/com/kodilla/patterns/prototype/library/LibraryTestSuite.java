package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Test 1");
        IntStream.iterate(2000, year -> ++year)
                .limit(20)
                .forEach(year -> library.addBook(new Book("title","author",LocalDate.of(year,10,10))));
        //When
        int librarySize = library.getBooks().size();
        //Then
        Assertions.assertEquals(20,librarySize);
    }
    @Test
    void testShallowCopy(){
        //Given
        Library library = new Library("Test 1");
        IntStream.iterate(2000, year -> ++year)
                .limit(20)
                .forEach(year -> library.addBook(new Book("title","author",LocalDate.of(year,10,10))));
        try {
            Library copiedLibrary = library.shallowCopy();
            library.getBooks().removeIf(book -> book.getPublicationDate().getYear() < 2010);
            //When
            int librarySize = copiedLibrary.getBooks().size();
            //Then
            Assertions.assertEquals(10,copiedLibrary.getBooks().size());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    @Test
    void testDeepCopy(){
        //Given
        Library library = new Library("Test 1");
        IntStream.iterate(2000, year -> ++year)
                .limit(20)
                .forEach(year -> library.addBook(new Book("title","author",LocalDate.of(year,10,10))));
        try {
            Library copiedLibrary = library.deepCopy();
            library.getBooks().removeIf(book -> book.getPublicationDate().getYear() < 2010);
            //When
            int librarySize = copiedLibrary.getBooks().size();
            //Then
            Assertions.assertEquals(20,copiedLibrary.getBooks().size());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
