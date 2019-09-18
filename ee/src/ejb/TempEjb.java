package ejb;

import javax.ejb.Stateless;

@Stateless
public class TempEjb {

    public void print() {
        System.out.println("Hello!");
    }
}
