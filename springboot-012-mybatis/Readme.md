# SpringBoot ORM操作MySQL

1. 导入Mybatis起步以来
2. 将src/main/java目录中的xml文件包含到classpath中
3. 创建实体类Student
4. 创建Dao类接口
5. 创建Dao接口对应的mapper文件
6. 创建Service层对象，创建对象和他的实现类
7. 创建Controller对象，访问Service
8. 写application.properties配置连接信息



## @Mapper注解

放在Dao接口上，每一个都需要，创建接口的代理对象

缺点：Dao接口多的时候很麻烦

## @MapperScan注解