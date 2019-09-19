package ejb;

import dao.Book;
import ejb.interfaces.BookInterface;

import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Local
public class BookBean implements BookInterface {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(Book book) {
        entityManager.persist(book);

    }
}
