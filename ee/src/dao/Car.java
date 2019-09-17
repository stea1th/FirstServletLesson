package dao;

public class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void clean() {
        System.out.println("Car clean");
    }
}
