package beans;

import interfaces.Parent;

public class Child implements Parent {

    @Override
    public void print() {
        System.out.println("I#m a Child");

    }
}
