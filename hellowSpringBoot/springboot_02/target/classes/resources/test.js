hello resources

在springboot中处理静态资源的方式
1.webjars          映射到localhost:8080/webjars
2.public ,static,resources,/**(项目目录下)  映射到localhost:8080/
优先级:resources>static>public


 也可以字节配置资源放置的地址:
 zai yaml或者properties配置文件中配置
 spring.mvc.static-path-pattern=/statci/,/webpage/jsp/,classpath:/xuanxie/html/