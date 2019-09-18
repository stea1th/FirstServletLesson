package ejb;

import javax.ejb.Singleton;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import java.util.concurrent.TimeUnit;

//@Stateful
//@StatefulTimeout(unit = TimeUnit.SECONDS, value = 10)
//@Singleton
@Stateful
@RequestScoped
public class StatefulExample {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
