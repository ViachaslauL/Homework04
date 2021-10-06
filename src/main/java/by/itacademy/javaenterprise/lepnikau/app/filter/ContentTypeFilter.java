package by.itacademy.javaenterprise.lepnikau.app.filter;

import by.itacademy.javaenterprise.lepnikau.app.service.ContentTypeService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter
public class ContentTypeFilter extends HttpFilter {
    ContentTypeService cTypeService;

    @Override
    public void init() throws ServletException {
        cTypeService = new ContentTypeService();
    }

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        String cType = req.getContentType();

        if (cTypeService.isExist(cType)) {
            chain.doFilter(req, res);
        } else {
            res.getWriter().write("Content-Type " + cType + " not allowed");
        }
    }
}
