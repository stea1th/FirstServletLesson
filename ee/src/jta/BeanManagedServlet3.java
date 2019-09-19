package jta;

import beans.BookDb;
import dao.Book;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/manager3")
public class BeanManagedServlet3 extends HttpServlet {

    @Inject
    BookDb bookDb;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        bookDb.save(new Book("This is third book", 24.05));

    }
}
