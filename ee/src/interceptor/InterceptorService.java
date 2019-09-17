package interceptor;

import javax.interceptor.Interceptors;

@Interceptors({InterceptorOne.class, InterceptorTwo.class, InterceptorThree.class})
public class InterceptorService {

    public void doJob(){
        System.out.println("Do your job!");
    }
}
