package ejb;

import dao.Car;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

@Singleton
public class ExampleBean4 {

    @PersistenceUnit
    EntityManagerFactory factory;

    @PersistenceContext
    EntityManager entityManager;

    @EJB
    ExampleBean exampleBean;

    @Inject
    Car car;

    @Resource
    UserTransaction userTransaction;

    @Resource
    SessionContext context;

//    @WebServiceRef
//    MyWebService myWebService;

    public String getName() {
        return "Max";
    }
}
