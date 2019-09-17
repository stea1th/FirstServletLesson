package beans;

import javax.enterprise.inject.Specializes;

@Specializes
public class MyChildBean extends MyBean {
    @Override
    public void print() {
        System.out.println("This is " + this.getClass().getSimpleName());
    }
}
