package jta;

import dao.Book;
import ejb.BookBean2;
import ejb.interfaces.Book2;
import ejb.interfaces.BookInterface;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/manager2")
public class BeanManagedServlet2 extends HttpServlet {

//    @EJB
//    @Book2
//    BookInterface bookInterface;
//
    @EJB
    BookBean2 bookBean2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = new Book();
        book.setTitle("This new Book");
        book.setPreis(9.99);
        bookBean2.save(book);
        resp.getWriter().write("Book " + book.getTitle() + " with id: " + book.getId() + " was saved successful");

    }
}
