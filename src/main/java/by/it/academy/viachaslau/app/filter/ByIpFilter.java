package by.it.academy.viachaslau.app.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/first")
public class ByIpFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        String remoteAddr = req.getRemoteAddr();

        if ("0:0:0:0:0:0:0:1".equals(remoteAddr)) {
            chain.doFilter(req, res);
            res.getWriter().write("Ip address: " + remoteAddr);
        } else {
            res.getWriter().write("Ip address " + remoteAddr + " not allowed");
        }

    }
}
