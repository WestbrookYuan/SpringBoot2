# CommandLineRunner接口

如果有需要容器对象创建好后，需要执行的方法，可以在application类实现commandLineRunner接口的run()方法

```java
@SpringBootApplication
public class Springboot008ContainerApplication implements CommandLineRunner {

    public static void main(String[] args) {
//        ConfigurableApplicationContext run = SpringApplication.run(Springboot008ContainerApplication.class, args);
//        UserService userServiceImpl = run.getBean("userServiceImpl", UserService.class);
//        userServiceImpl.select();
//        userServiceImpl.update();
        ConfigurableApplicationContext run = SpringApplication.run(Springboot008ContainerApplication.class, args);
        CommandLineRunnerService commandLineRunnerService = run.getBean("commandLineRunnerService", CommandLineRunnerService.class);
        commandLineRunnerService.reportLogin("yty");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("container just created: codes will be run");
    }
  
  /// output: 
  // container just created: codes will be run
  // yty logon
```

