package servlets;

import ejb.ExampleBean;
import ejb.ExampleBean2;
import ejb.interfaces.LocalExampleInterface;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ejb4")
public class Servlet3 extends HttpServlet {


    @EJB
    ExampleBean2 exampleBean2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
