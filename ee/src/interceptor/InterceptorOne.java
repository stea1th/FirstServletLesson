package interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class InterceptorOne {
    @AroundInvoke
    private Object aroundInvoke(InvocationContext invocationContext) throws Exception {
        System.out.println("One");
        return invocationContext.proceed();
    }
}
