package validation;

import dao.Man;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.io.IOException;
import java.util.Set;

@WebServlet("/validation2")
public class ValidatorExamp2 extends HttpServlet {

    @Inject
    Validator validator;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Set<ConstraintViolation<Man>> set = validator.validateValue(Man.class, "email", "email@mail.ru");
        set.forEach(i-> System.out.println(i.getMessage() + " -> " + i.getInvalidValue()));
    }
}
