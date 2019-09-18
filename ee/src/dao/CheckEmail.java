package dao;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@NotNull
@Size(min = 7)
@Pattern(regexp = "[A-Za-z]*@[A-Za-z]*\\.com")
@Constraint(validatedBy = {})
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CheckEmail {
    String message() default "Email address doesn't look good";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
