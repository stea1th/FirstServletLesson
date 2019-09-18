package servlets;

import ejb.StatefulExample;
import ejb.TempEjb;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ejb2")
public class Servlet extends HttpServlet {

    @EJB
    TempEjb tempEjb;

    @EJB
    StatefulExample statefulExample;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(statefulExample.getI() + "");
        statefulExample.setI(statefulExample.getI() + 1);
    }
}
