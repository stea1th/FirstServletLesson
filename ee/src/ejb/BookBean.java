package ejb;

import dao.Book;
import ejb.interfaces.Book1;
import ejb.interfaces.BookInterface;

import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Book1
@Local
public class BookBean implements BookInterface {

    @PersistenceContext
    EntityManager entityManager;

    @Resource
    SessionContext sessionContext;

    @Override
    public void save(Book book) {
        entityManager.persist(book);
        sessionContext.setRollbackOnly();

    }
}
