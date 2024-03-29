package servlets;

import dao.Book;
import ejb.BookBean;
import ejb.ExampleBean7;
import ejb.interfaces.Book1;
import ejb.interfaces.BookInterface;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ejb10")
public class Servlet9 extends HttpServlet {

    @EJB
    @Book1
    BookInterface bookInterface;

//    @EJB
//    BookBean bookBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = new Book();
        book.setTitle("Makarena");
        book.setPreis(12.90);
        bookInterface.save(book);
//        bookBean.save(book);

    }
}
