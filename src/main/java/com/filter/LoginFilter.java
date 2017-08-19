package com.filter;

import com.bean.UserPO;
import com.common.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter{

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        HttpSession session = httpServletRequest.getSession();

        UserPO user= (UserPO) session.getAttribute(Constants.CURRENT_USER);
        String servletPath = httpServletRequest.getServletPath();
        String contextPath = httpServletRequest.getContextPath();

        if (user == null) {
            //we need to show user the page before login. so we add the servlet path as the params.
            httpServletResponse.sendRedirect(contextPath + "/login.html?" + servletPath);
        } else if ("login.html".equals(servletPath)) {
            httpServletRequest.getRequestDispatcher("/index.jsp").forward(servletRequest, servletResponse);
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
