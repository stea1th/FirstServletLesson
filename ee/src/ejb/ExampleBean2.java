package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
@DependsOn("SecondBean")
public class ExampleBean2 {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Example2 Bean");
    }
}
