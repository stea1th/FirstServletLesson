package cdi;

import beans.ConversationBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test3")
public class DepInjectExample3 extends HttpServlet {

    @Inject
    ConversationBean conversationBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(conversationBean.getI());
        conversationBean.setI(1);
        conversationBean.startConversation();
        System.out.println(conversationBean.getI());
        System.out.println("Middle conversation");
        conversationBean.setI(3);
        conversationBean.endConversation();
        System.out.println(conversationBean.getI());
    }
}
