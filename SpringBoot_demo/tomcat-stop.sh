#!/bin/bash

#检查是否运行
PID=$(ps -ef | grep tomcat | grep "Djava.util.logging.config.file" | awk '{print $2}')

if [[ -n "${PID}" ]]; then
	kill -9 ${PID}
	echo "kill old tomcat process:"${PID}
fi



