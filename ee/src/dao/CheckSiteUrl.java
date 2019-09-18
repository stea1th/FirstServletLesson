package dao;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {CheckSiteLogic.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface CheckSiteUrl {
    String message() default "Url of this site doesn't look good";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    int port() default -1;
    String host() default "";
    String protocol() default "";

}
