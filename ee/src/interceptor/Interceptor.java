package interceptor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class Interceptor {

    @AroundConstruct
    private void aroundConstruct(InvocationContext invocationContext) throws Exception {
        System.out.println("Before construct");
        invocationContext.proceed();
    }

    @PostConstruct
    private void postConstruct(InvocationContext invocationContext) {
        System.out.println("Post counstruct");
        try {
            invocationContext.proceed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AroundInvoke
    private Object aroundMethods(InvocationContext context) throws Exception {
        System.out.println("Beforre method");
        return context.proceed();
    }

    @PreDestroy
    private void preDestroy(InvocationContext context) {
        System.out.println("Destroy live cycle bean");
    }
}
