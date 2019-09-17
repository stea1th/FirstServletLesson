package dao;

import javax.validation.constraints.*;
import java.util.Date;

public class People {

    //    @NotNull
    @Pattern(regexp = "[A-Za-z]*")
    private String name;

    @Min(18)
    private int age;

    @Size(max = 200)
    private String description;

    @Past
    Date birthDay;

    @Future
    Date deathDay;

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull @Size(max = 3) String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(Date deathDay) {
        this.deathDay = deathDay;
    }
}
