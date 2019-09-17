package interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class InterceptorThree {
    @AroundInvoke
    private Object aroundInvoke(InvocationContext invocationContext) throws Exception {
        System.out.println("Three");
        return invocationContext.proceed();
    }
}
