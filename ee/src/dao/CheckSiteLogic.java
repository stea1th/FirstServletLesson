package dao;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.net.MalformedURLException;
import java.net.URL;

public class CheckSiteLogic implements ConstraintValidator<CheckSiteUrl, String> {

    String protocol;
    String host;
    int port;

    @Override
    public void initialize(CheckSiteUrl constraintAnnotation) {
        protocol = constraintAnnotation.protocol();
        host = constraintAnnotation.host();
        port = constraintAnnotation.port();

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null || s.equals("")){
            return true;
        }
        URL url;
        try {
            url = new URL(s);
        } catch (MalformedURLException e) {
           return false;
        }
        if(protocol != null && protocol.length() > 0 && !protocol.equals(url.getProtocol())){
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("Invalid host").addConstraintViolation();
            return false;
        }
        return true;
    }
}
