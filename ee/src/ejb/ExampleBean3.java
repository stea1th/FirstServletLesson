package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.concurrent.TimeUnit;

@Singleton
//@Lock(LockType.WRITE)
//@AccessTimeout(unit = TimeUnit.SECONDS, value = 2)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class ExampleBean3 {

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

//    @Lock(LockType.READ)
    public synchronized void addOne() {
        i++;
    }


}
