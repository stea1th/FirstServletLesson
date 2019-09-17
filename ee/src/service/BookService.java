package service;

import beans.Book;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class BookService {

    @Inject
    @AddEvent
    Event<Book> addEvent;

    @Inject
    @DeleteEvent
    Event<Book> deleteEvent;


    public void addBook(Book book) {
        System.out.println(book.getName() + " was added!");
        addEvent.fire(book);
    }

    public void deleteBook(Book book) {
        System.out.println(book.getName() + " was deleted!");
        deleteEvent.fire(book);
    }
}
