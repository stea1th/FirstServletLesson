package beans;

import interceptor.Interceptor;

import javax.enterprise.context.RequestScoped;
import javax.interceptor.ExcludeClassInterceptors;
import javax.interceptor.Interceptors;

@RequestScoped
//@Interceptors(interceptor.Interceptor.class)
public class LiveCycleBean {

    public LiveCycleBean() {
        System.out.println("Construct");
    }

    @Interceptors({Interceptor.class})
    public void doJob(){
        System.out.println("Do job");
    }

    @ExcludeClassInterceptors
    public void doJob2() {
        System.out.println("Do job 2");
    }
}
