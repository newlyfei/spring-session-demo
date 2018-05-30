# spring-session 实例

## 注解说明

| 注释 | 说明 |
| :--- | :--- |
| @ServletComponentScan | 开启Servlet注解扫描 |
| @EnableRedisHttpSession | 开启Redis缓存会话 |


## SpringBoot集成jsp页面

> 1. jsp页面应该放置在/src/main/resources/META-INF/resources/WEB-INF/views下面
> 2. /WEB-INF/views和配置文件application.properties中配置的MVC前缀一致

application.properties

```properties
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
```

内嵌Tomcat启动要注释掉

```xml
<dependency>
   <groupId>org.apache.tomcat.embed</groupId>
   <artifactId>tomcat-embed-jasper</artifactId>
   <!--<scope>provided</scope>-->
</dependency>
```

## 参考文献

[【spring-session】](https://github.com/spring-projects/spring-session)

[【Spring Session - HttpSession (Quick Start)】](https://docs.spring.io/spring-session/docs/current/reference/html5/guides/java-redis.html)

[【Spring Data Redis】](https://docs.spring.io/spring-data/data-redis/docs/2.0.7.RELEASE/reference/html/)