# docker部署Java的springBoot.war包测试

> 自己写一些小的Javaweb服务端程序，使用docker部署很方便，但是之前一直不怎么会用，记录一下

## 创建docker容器
``````
docker run -p 8088:8080 --name sptestweb tomcat:latest
``````
## 复制war包到容器
``````
docker cp sptestweb.war sptestweb:/usr/local/tomcat/webapps/
``````
## 重启容器
``````
docker start sptestweb
``````
## 进入容器，查看日志
``````
docker exec -it sptestweb /bin/bash
``````

## 查看接口信息

``````
http://47.111.116.146:8088/sptestweb/test/getTime
``````
