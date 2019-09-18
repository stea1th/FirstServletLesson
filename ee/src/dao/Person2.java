package dao;


import java.time.LocalDate;

@ChronDates
public class Person2 {
    private LocalDate birthDay = LocalDate.of(2011, 5, 28);
    private LocalDate deathDate = LocalDate.of(2010, 5, 28);

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }
}
