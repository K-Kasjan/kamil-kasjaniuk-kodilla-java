package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    final String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }
    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.setBooks(new HashSet<>());
        for (Book book : books) {
            Book clonedBook = new Book(
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPublicationDate()
                    );
            clonedLibrary.addBook(clonedBook);
        }
        return clonedLibrary;
    }
}