package cdi;

import beans.Book;
import helper.Subscriber;
import service.BookService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test8")
public class CDI8 extends HttpServlet {
    @Inject
    BookService bookService;

    @Inject
    Subscriber subscriber;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = new Book("Where are u, wolf?");
        bookService.addBook(book);
        System.out.println(subscriber.getSize());
        bookService.deleteBook(book);
        System.out.println(subscriber.getSize());
    }
}
