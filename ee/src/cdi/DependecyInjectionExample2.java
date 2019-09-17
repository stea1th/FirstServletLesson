package cdi;

import dao.ChangeMyBean;
import dao.MyBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test2")
public class DependecyInjectionExample2 extends HttpServlet {

    @Inject
    MyBean myBean;

    @Inject
    ChangeMyBean changeMyBean;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       myBean.setI(5);
       changeMyBean.changeI();
       resp.getWriter().write("this is my result " + myBean.getI());
    }
}
