package jta;

import dao.Book;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.*;
import java.io.IOException;

@WebServlet("/manager")
public class BeanManagedServlet extends HttpServlet {

    @PersistenceContext
    EntityManager entityManager;

    @Resource
    UserTransaction userTransaction;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            userTransaction.begin();
            Book book = new Book();
            book.setTitle("This new Book");
            book.setPreis(9.99);
            entityManager.persist(book);
            userTransaction.commit();
            resp.getWriter().write("Book " + book.getTitle() + " with id: " +book.getId() + " was saved successful");
        } catch (NotSupportedException | SystemException | RollbackException | HeuristicRollbackException | HeuristicMixedException e) {
            e.printStackTrace();
        }

    }
}
