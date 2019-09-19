package beans;

import dao.Book;
import ejb.interfaces.Book1;
import ejb.interfaces.BookInterface;

import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@RequestScoped
public class BookDb implements BookInterface {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(Book book) {
        entityManager.persist(book);
    }
}
