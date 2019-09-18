package dao;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckChronoDates implements ConstraintValidator<ChronDates, Person2> {

    @Override
    public void initialize(ChronDates constraintAnnotation) {

    }

    @Override
    public boolean isValid(Person2 person2, ConstraintValidatorContext constraintValidatorContext) {
        return person2.getBirthDay().isBefore(person2.getDeathDate());
    }
}
