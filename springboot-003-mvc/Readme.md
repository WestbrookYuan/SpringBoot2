# SpringBoot基础知识

## 注解

```java
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(
    excludeFilters = {@Filter(
    type = FilterType.CUSTOM,
    classes = {TypeExcludeFilter.class}
), @Filter(
    type = FilterType.CUSTOM,
    classes = {AutoConfigurationExcludeFilter.class}
)}
)
public @interface SpringBootApplication {
    @AliasFor(
        annotation = EnableAutoConfiguration.class
    )
```

1. 使用了@SpringBootApplication
   1. 内含@SpringBootConfiguration注解，可以进行类的注入，可以作为配置文件使用
   2. @EnableAutoConfiguration，启动自动配置，把Java对象配置好，注入到spring容器中
   3. @ComponentScan，扫描器，找到注解，根据注解功能创建对象，给对象赋值，默认扫描注解所在的类所在的包和子包



