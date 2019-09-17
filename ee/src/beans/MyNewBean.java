package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("newName")
@RequestScoped
public class MyNewBean {

    private String s = "Hello World! I#m your bean";

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
