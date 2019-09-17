package dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

//@ApplicationScoped
//@RequestScoped
public class ChangeMyBean {

    @Inject
    MyBean myBean;

    public void changeI() {
        myBean.setI(2);

    }
}
