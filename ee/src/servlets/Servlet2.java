package servlets;

import ejb.ExampleBean;
import ejb.StatefulExample;
import ejb.TempEjb;
import ejb.interfaces.LocalExampleInterface;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ejb3")
public class Servlet2 extends HttpServlet {

    @EJB
    ExampleBean exampleBean;

    @EJB
    LocalExampleInterface localExampleInterface;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(localExampleInterface.getName());
        resp.getWriter().write(exampleBean.getSurname());

    }
}
