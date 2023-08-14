# SpringBoot自定义配置

1. @Value

```java
public class BootController {
    @Value("${environment.country}")
    private String country;
    @Value("${environment.city}")
    private String city;
    @Value("${environment.address}")
    private String address;

    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(){
        return country+" "+city+" "+address;
    }
}
```

2. 使用@ConfigurationProperties，调用set方法注入对象，prefix属性负责按照前缀寻找，如果没有的话会试图找到所有的同名配置

```java
@Component
@ConfigurationProperties(prefix = "environment")
public class SchoolInfo {
    private String country;

    private String city;

    private String address;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SchoolInfo{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

```



