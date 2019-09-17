package dao;

import javax.enterprise.inject.Alternative;

//@StudentAnnotation
@Alternative
public class Student implements Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
