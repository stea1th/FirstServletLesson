package cdi;

import dao.Student;

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
    Student student;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        student.setName("Vadim");
        resp.getWriter().write(student.getName());
//        System.out.println(student.getName());
        System.out.println("Hallo!!!!");

    }
}


