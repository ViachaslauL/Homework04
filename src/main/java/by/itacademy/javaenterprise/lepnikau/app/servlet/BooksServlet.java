package by.itacademy.javaenterprise.lepnikau.app.servlet;

import by.itacademy.javaenterprise.lepnikau.app.util.Parser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BooksServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String queryStr = req.getQueryString();

        writer.write("<html><body><h1>Books page</h1>");

        if (queryStr != null) {
            writer.write("<h4>-=Parameters=-</h4>");
            writer.write("<p>" + Parser.parseQueryString(queryStr).toString() + "</p>");
        }

        writer.write("</body></html>");
    }
}
