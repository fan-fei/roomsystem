package com.feifan.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoginFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;

        if (httpServletRequest.getServletPath().contains("styles/styles.css")) {
            chain.doFilter(request, response);
            return;
        }
        if (httpServletRequest.getServletPath().contains("javascript/javascript.js")) {
            chain.doFilter(request, response);
            return;
        }
        if (httpServletRequest.getServletPath().contains("images/")) {
            chain.doFilter(request, response);
            return;
        }
        if (httpServletRequest.getServletPath().contains("/loginManageLogin.do")) {
            chain.doFilter(request, response);
            return;
        }

        if (httpServletRequest.getSession().getAttribute("username") == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }

        if (httpServletRequest.getServletPath().contains("/login.jsp")) {
            request.getRequestDispatcher("main.jsp").forward(request, response);
            return;
        }

        if ("general".equals(httpServletRequest.getSession().getAttribute("authority"))
                && httpServletRequest.getServletPath().contains("/userManage")) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }

        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
