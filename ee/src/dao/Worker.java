package dao;

import interfaces.Person;

import javax.enterprise.inject.Default;

@Default
public class Worker implements Person {

//    private String name;

    @Override
    public String getName() {
        return "Worker";
    }

    @Override
    public void setName(String name) {
//        this.name = name;
    }
}
