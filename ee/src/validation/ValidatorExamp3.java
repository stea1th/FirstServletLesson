package validation;

import dao.Man;
import dao.Person2;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Set;

@WebServlet("/validation3")
public class ValidatorExamp3 extends HttpServlet {

    @Inject
    Validator validator;

    @Inject
    Person2 person2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Set<ConstraintViolation<Person2>> set = validator.validate(person2);
        set.forEach(i-> System.out.println(i.getMessage() + " -> " + i.getInvalidValue()));

    }
}
