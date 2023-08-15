package com.yty.config;

import com.yty.web.filter.Myfilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Configuration
public class WebApplicationFilterConfig {
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        FilterRegistrationBean bean = new FilterRegistrationBean();
//        bean.setFilter(new Myfilter());
//        bean.addUrlPatterns("/user/*");
//        return bean;
//    }

    //@Bean
    public FilterRegistrationBean characterFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("utf-8");
        characterEncodingFilter.setForceEncoding(true);
        bean.setFilter(characterEncodingFilter);
        bean.addUrlPatterns("/*");
        return bean;
    }
}
