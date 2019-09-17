package validation;

import dao.People;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.util.Set;

@WebServlet("/validation")
public class ValidatorExample extends HttpServlet {

//    @Inject
//    Validation validation;

    @Inject
    People people;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        people.setName("Max");
        people.setAge(13);

        try(ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory()) {
            Validator validator = validatorFactory.getValidator();
            Set<ConstraintViolation<People>> violationSet = validator.validate(people);
            violationSet.forEach(i-> System.out.println(i.getMessage()));
        }
    }
}
