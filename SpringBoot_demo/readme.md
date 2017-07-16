## jar包打包及运行方法
### 方法1:
> mvn spring-boot:run
### 方法2:
> nvm install

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