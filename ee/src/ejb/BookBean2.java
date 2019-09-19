package ejb;

import dao.Book;
import ejb.interfaces.Book2;
import ejb.interfaces.BookInterface;

import javax.annotation.Resource;
import javax.ejb.*;
import javax.inject.Qualifier;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.*;

@Singleton
@TransactionManagement(TransactionManagementType.BEAN)
public class BookBean2{

    @PersistenceContext
    EntityManager entityManager;

    @Resource
    UserTransaction userTransaction;


    public void save(Book book) {
        try {
            userTransaction.begin();
            entityManager.persist(book);
            userTransaction.commit();
        } catch (NotSupportedException | SystemException | RollbackException | HeuristicRollbackException | HeuristicMixedException e) {
            e.printStackTrace();
        }
    }
}
