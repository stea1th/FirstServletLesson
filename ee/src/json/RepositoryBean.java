package json;

import dao.Book;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class RepositoryBean {

    @PersistenceContext
    EntityManager entityManager;

    public Book findById(int id) {
        return entityManager.find(Book.class, id);
    }
}
