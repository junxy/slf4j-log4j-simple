slf4j-logback-simple
==================

slf4j + logback 在Java Web程序中应用的简单示例


开发环境
-------
* MyEclipse
* Maven
* JDK 6 +

代码说明
--------

* logback配置示例：[`src/main/resources/logback.xml`（输出日志到控制台，输出日志到文本并按日期归档.gz压缩）](./src/main/resources/logback.xml)
* JAVA使用示例：[`src/main/java/MyProjects/App.java`](./src/main/java/MyProjects/App.java)


如何运行示例
----------
1. 安装/配置 Maven 环境
2. 获取代码：`git clone git@github.com:junxy/slf4j-log4j-simple.git -b slf4j+logback`
3. 安装依赖库：`mvn package`
4. 修改logback配置中log文件输出目录值：[`src/main/resources/logback.xml#L17-19`](./src/main/resources/logback.xml#L17-19)，部署项目至Tomcat或其他Web服务器。
5. 运行测试页：<http://localhost:8080/ReferenceImplementation/index.jsp> 

```
INFO  App - Hello, World!!
INFO  App - I'm a info message
ERROR App - I'm a error message
WARN  App - I'm a warn message
```

参考资料
--------
* <https://wiki.base22.com/display/btg/How+to+setup+SLF4J+and+LOGBack+in+a+web+app+-+fast>
* <http://logback.qos.ch/manual/configuration.html>
* <http://logback.qos.ch/manual/appenders.html>
* <https://github.com/heki1224/rabbitmq-spring-lightweight-batch-sample/blob/master/src/main/resources/logback.xml>
