package com.yty.web.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
public class Myfilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("execute filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
