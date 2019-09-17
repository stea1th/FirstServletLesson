package cdi;

import dao.Person;
import dao.StudentAnnotation;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student")
public class DependencyInjectionExample extends HttpServlet {

    @Inject
//    @StudentAnnotation
    Person person;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        person.setName("Vadim");
        resp.getWriter().write(person.getName());
    }
}


