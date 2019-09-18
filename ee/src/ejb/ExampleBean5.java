package ejb;

import javax.ejb.Asynchronous;
import javax.ejb.Singleton;

@Singleton
@Asynchronous
public class ExampleBean5 {

    public void getName()  {
        int i = 0;
        while (i < 10) {
            try {
                Thread.sleep(10000);
                ++i;
                System.out.println("Step " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
