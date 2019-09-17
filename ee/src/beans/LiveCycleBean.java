package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

@RequestScoped
public class LiveCycleBean {

    @PostConstruct
    private void postConstruct() {
        System.out.println("Post counstruct");
    }

    @AroundInvoke
    private Object aroundMethods(InvocationContext context) throws Exception {
        System.out.println("Beforre method");
        return context.proceed();
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("Destroy live cycle bean");
    }

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
