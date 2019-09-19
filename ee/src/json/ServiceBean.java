package json;

import dao.Book;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.inject.Inject;

@Singleton
public class ServiceBean {

    @EJB
    RepositoryBean repositoryBean;

    @Inject
    Helper helper;

    public Book get(int id) {
        return repositoryBean.findById(id);
    }

    public boolean saveBookAsJson(int id) {
        Book book = get(id);
        return helper.saveBookAsJson(book);
    }


}
