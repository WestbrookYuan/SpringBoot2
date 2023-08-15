# 在Springboot中使用Servlet

1. 实现Servlet对象

```java
package com.yty.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // use HttpServletRequest print out this
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("execute servlet object");
        writer.flush();
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}

```

2. 注册Servlet，使用ServletRegistrationBean进行注册

```java
package com.yty.config;

import com.yty.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Configuration
public class SystemConfig {
    // register servlet bean
    @Bean
    public ServletRegistrationBean servletRegistration(){
        /**
         * servlet, url address
         */
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login", "/test");
        return bean;
    }

}
		
```