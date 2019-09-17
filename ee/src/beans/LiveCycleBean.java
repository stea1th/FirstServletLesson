package beans;

import javax.enterprise.context.RequestScoped;
import javax.interceptor.Interceptors;

@RequestScoped
@Interceptors(interceptor.Interceptor.class)
public class LiveCycleBean {

    public LiveCycleBean() {
        System.out.println("Construct");
    }

    public void doJob(){
        System.out.println("Do job");
    }

    public void doJob2() {
        System.out.println("Do job 2");
    }
}
