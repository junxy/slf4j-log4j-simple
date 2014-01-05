slf4j-log4j-simple
==================

slf4j + log4j 在Java Web程序中应用的简单示例


开发环境
-------
* MyEclipse
* Maven
* JDK 6 +

代码说明
--------

* log4j配置示例：[src/main/resources/log4j.xml](src/main/resources/log4j.xml)
* JAVA使用示例：[src/main/java/MyProjects/App.java](src/main/java/MyProjects/App.java)


如何运行示例
----------
1. 安装/配置 Maven 环境
2. 获取代码：`git clone git@github.com:junxy/slf4j-log4j-simple.git`
3. 安装依赖库：`mvn package`
4. 修改log4j配置中log文件输出目录值：[src/main/resources/log4j.xml#L11](src/main/resources/log4j.xml#L11)，[src/main/resources/log4j.xml#L20](src/main/resources/log4j.xml#L20)，部署项目至Tomcat或其他Web服务器。
5. 运行测试页：<http://localhost:8080/ReferenceImplementation/index.jsp> 

```
INFO  App - Hello, World!!
INFO  App - I'm a info message
ERROR App - I'm a error message
WARN  App - I'm a warn message
```

参考资料
--------
* <http://blog.johnnyathome.com/?p=53>
* <http://wiki.apache.org/logging-log4j/Log4jXmlFormat>
* <http://www.mkyong.com/hibernate/how-to-configure-log4j-in-hibernate-project>