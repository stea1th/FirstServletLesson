package cdi;

import dao.Car;
import dao.Str2;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class DependencyInjection extends HttpServlet {

    @Inject
    @Str2
    String str;

    @Inject
    int i;

    @Inject
    double d;

    @Inject
    Car car;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(str + " " + i + " " + d);
        resp.getWriter().write(car.getName());
    }
}
