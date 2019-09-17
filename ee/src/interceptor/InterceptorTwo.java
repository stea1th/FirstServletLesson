package interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class InterceptorTwo {
    @AroundInvoke
    private Object aroundInvoke(InvocationContext invocationContext) throws Exception {
        System.out.println("Two");
        return invocationContext.proceed();
    }
}
