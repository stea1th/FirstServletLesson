package servlets;

import ejb.ExampleBean6;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ejb8")
public class Servlet7 extends HttpServlet {

//    @Resource(lookup = "java:module/ExampleBean6")
//    ExampleBean6 exampleBean6;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write(exampleBean6.getName());
        ExampleBean6 exampleBean6 = null;
        try {
            InitialContext initialContext = new InitialContext();
            exampleBean6 = (ExampleBean6) initialContext.lookup("java:module/ExampleBean6");
        } catch (NamingException e) {
            e.printStackTrace();
        }
        if (exampleBean6 != null) {
            resp.getWriter().write(exampleBean6.getName());
        }
    }
}
