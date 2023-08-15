# SpringBoot中使用拦截器

1. 实现一个拦截器，实现HandlerInterceptor接口中的方法

   ```java
   package com.yty.web;
   
   import org.springframework.web.servlet.HandlerInterceptor;
   
   import javax.servlet.http.HttpServletRequest;
   import javax.servlet.http.HttpServletResponse;
   
   /**
    * @author yty
    * @version 1.0
    * @since 1.0
    **/
   public class LoginInterceptor implements HandlerInterceptor {
       /**
        *
        * @param request
        * @param response
        * @param handler
        * @return boolean
        *  true: can be dealed by controller
        *  false: cannot
        * @throws Exception
        */
       @Override
       public boolean preHandle(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler) throws Exception {
           System.out.println("pre handler executed");
           return false;
       }
   }
   
   ```

2. 将拦截器注入配置类，设定拦截器生效和排除的路径

   ```java
   package com.yty.config;
   
   import com.yty.web.LoginInterceptor;
   import org.springframework.context.annotation.Configuration;
   import org.springframework.web.servlet.HandlerInterceptor;
   import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
   import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
   
   /**
    * @author yty
    * @version 1.0
    * @since 1.0
    *
    * migrate SpringMVC xml to this interface
    **/
   @Configuration
   public class MyAppConfig implements WebMvcConfigurer {
       @Override
       public void addInterceptors(InterceptorRegistry registry) {
           HandlerInterceptor interceptor = new LoginInterceptor();
   
           String[] path = new String[]{"/user/**", };
           String[] excludepath = new String[]{"/user/login"};
           registry.addInterceptor(interceptor)
                   .addPathPatterns(path)
                   .excludePathPatterns(excludepath);
       }
   }
   ```

3. 实现Controller进行路径对应

   ```java
   package com.yty.controller;
   
   import org.springframework.stereotype.Controller;
   import org.springframework.web.bind.annotation.RequestBody;
   import org.springframework.web.bind.annotation.RequestMapping;
   import org.springframework.web.bind.annotation.ResponseBody;
   
   /**
    * @author yty
    * @version 1.0
    * @since 1.0
    **/
   @Controller
   public class BootController {
       @RequestMapping("/user/account")
       @ResponseBody
       public String userAccount(){
           return "go to user/account";
       }
   
       @RequestMapping("/user/login")
       @ResponseBody
       public String userLogin(){
           return "go to /user/login";
       }
   
   }
   ```

   