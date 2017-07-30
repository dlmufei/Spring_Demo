## jar包打包及运行方法
### 方法1:
> mvn spring-boot:run
### 方法2:
> mvn install

> cd target

> java -jar springboot_demo-0.0.1-SNAPSHOT.jar

### 访问接口
> http://localhost:8080/demo/index

## jar包改为war包
### tomcat部署包脚本
> 启动脚本: ./tomcat-start.sh

> 停止脚本: ./tomcat-stop.sh

### 访问链接
> http://localhost:8080/springbootdemo/demo/index

### 详细改动见pom.xml文件修改,git提交log

## banner
> 网站: http://patorjk.com/software/taag/#p=display&f=Big&t=QQ

## 添加自定义Filter
> 注解形式 http://www.jianshu.com/p/05c8be17c80a
> 代码的形式 http://www.ityouknow.com/springboot/2016/02/03/springboot(%E4%BA%8C)-web%E7%BB%BC%E5%90%88%E5%BC%80%E5%8F%91.html
### (1)通过Configuration 代码的形式添加
### (2)通过注解的形式:
> @ServletComponentScan
> @Order(1)
> @WebFilter(filterName = "MyFilter", urlPatterns = "/*")
