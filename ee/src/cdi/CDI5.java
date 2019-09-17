package cdi;

import beans.LiveCycleBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test5")
public class CDI5 extends HttpServlet {
    @Inject
    LiveCycleBean liveCycleBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        liveCycleBean.doJob();
        liveCycleBean.doJob2();

    }
}
