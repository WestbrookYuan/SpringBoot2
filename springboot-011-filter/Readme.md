# Springboot使用过滤器

1. 创建过滤器

   ```java
   public class Myfilter implements Filter {
       @Override
       public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
           System.out.println("execute filter");
           filterChain.doFilter(servletRequest, servletResponse);
       }
   }
   		
   ```

2. 使用FilterRegistrationBean注册过滤器

   ```java
   @Configuration
   public class WebApplictionConfig {
       @Bean
       public FilterRegistrationBean filterRegistrationBean(){
           FilterRegistrationBean bean = new FilterRegistrationBean();
           bean.setFilter(new Myfilter());
           bean.addUrlPatterns("/user/*");
           return bean;
       }
   }
   ```

3. 