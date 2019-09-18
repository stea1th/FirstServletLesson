package servlets;

import ejb.ExampleBean6;
import ejb.ExampleBean7;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ejb9")
public class Servlet8 extends HttpServlet {

    @EJB
    ExampleBean7 exampleBean7;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write(exampleBean6.getName());
//        exampleBean7.
        exampleBean7.startSayHello();
    }
}
