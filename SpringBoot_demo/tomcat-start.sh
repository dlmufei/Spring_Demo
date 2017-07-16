#!/bin/bash

#限制core文件大小为4k,用于进程coredump监控
ulimit -c 4 -S

#导入JDK
#export JAVA_HOME=/usr/local/app/jdk/
#export PATH=$JAVA_HOME/bin:$PATH

#部署包
rm -rf ../apache-tomcat-7.0.70/webapps/springbootdemo*
cp target/springbootdemo.war ../apache-tomcat-7.0.70/webapps

#检查是否运行
PID=$(ps -ef | grep tomcat | grep "Djava.util.logging.config.file" | awk '{print $2}')


if [[ -n "${PID}" ]]; then
	kill -9 ${PID}
	echo "kill old process"
fi

../apache-tomcat-7.0.70/bin/startup.sh
tail -fn 300 ../apache-tomcat-7.0.70/logs/catalina.out


