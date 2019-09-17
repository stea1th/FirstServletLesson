package helper;

import beans.Book;
import service.AddEvent;
import service.DeleteEvent;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class Subscriber {

    private List<Book> bookList = new ArrayList<>();

    public void addBook(@Observes @AddEvent Book book) {
        bookList.add(book);
        System.out.println(book.getName() + " was added to List");
    }

    public int getSize() {
        return bookList.size();
    }

    public void deleteBook(@Observes @DeleteEvent Book book) {
        System.out.println(book.getName() + " was deleted from list");
        bookList.remove(book);
    }
}
