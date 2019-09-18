package ejb;

import javax.ejb.Singleton;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

@Stateless
//@Stateful
//@Singleton
public class EjbBeanLesson {

    public String sayHello() {
        return "Hello my World!";
    }

}
