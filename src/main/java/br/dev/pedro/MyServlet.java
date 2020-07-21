package br.dev.pedro;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().print(
            "<html>\n" +
            "<body>\n" +
            "<h1>Does this work?</h1>\n" +
            "<p>I guess yes!</p>\n" +
            "</body>\n" +
            "</html>");
    }
}