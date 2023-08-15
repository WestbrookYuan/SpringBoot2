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
