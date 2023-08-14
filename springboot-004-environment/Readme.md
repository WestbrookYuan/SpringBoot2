## SpringBoot的配置文件

配置文件名称：application

扩展名有：.properties(k = v) .yaml(k : v) .yml

默认使用properties文件

1. 使用application.properties

```properties
# 端口号
server.port=8082
server.servlet.context-path=/myboot

```

2. 使用application.yaml

```yaml
server:
  port: 8083
  servlet:
    context-path: /myboot2
```

