package servlets;

import ejb.ExampleBean3;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.stream.IntStream;


@WebServlet("/ejb5")
public class Servlet4 extends HttpServlet {

    @EJB
    private ExampleBean3 exampleBean3;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        exampleBean3.addOne();
        resp.getWriter().write(exampleBean3.getI() + "");

    }

    public static void main(String[] args) {
        IntStream.range(1, 1001)
                .forEach(i -> {
                    new Thread(() -> {
                        URLConnection urlConnection = null;
                        try {
                            urlConnection = new URL("http://localhost:8080/ejb5").openConnection();
                            Scanner scanner = new Scanner(urlConnection.getInputStream());
                            while (scanner.hasNext()) {
                                System.out.println(scanner.next());
                            }
                        } catch (
                                IOException e) {
                            e.printStackTrace();
                        }
                    }).start();
                });
    }
}
