package dao;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

public class Producer {

    @Produces
    @Default
    String str = "Hello world";

    @Produces
    @Str2
    String str2 = "Bye bye world";

    @Produces
    int i = 5;

    @Produces
    double getDouble() {
        return 1 + 3.3 + 5.8;
    }

    @Produces
    Car getCar() {
        return new Car("Lada");
    }
}
