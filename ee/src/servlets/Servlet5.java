package servlets;

import ejb.ExampleBean5;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ejb6")
public class Servlet5 extends HttpServlet {


    @EJB
    ExampleBean5 exampleBean5;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        exampleBean5.getName();
        resp.getWriter().write("Complete");

    }
}
