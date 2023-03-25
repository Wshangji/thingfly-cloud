# ThingFly

Thing-Fly(物飞)物联网管理平台，使用SpringCloudAlibaba搭建的物联网管理系统

## 环境依赖
> spring-boot v2.7.6 
> 
>spring-cloud v2021.0.4
> 
> spring-cloud-alibaba v2021.0.4.0

## 部署步骤
1. 等待编写


## 目录结构描述

    ├── README.md                   // 帮助文档
    ├── thingfly-common             // common基础模块
    │   ├── common-base             // 包含各模块所需的基础代码
    │       ├── src                 // 源代码
    │       └── pom.xml
    │   ├── common-mybatis-plus     // 封装mybatis-plus
    │       ├── src                 // 源代码
    │       └── pom.xml
    │   ├── common-redis            // 封装redis
    │       ├── src                 // 源代码
    │       └── pom.xml
    │   └── common-web              // 封装web服务请求头
    │       ├── src                 // 源代码
    │       └── pom.xml
    ├── LICENSE              // 开源许可证
    └── pom.xml              // 父工程maven配置文件


## 版本更新

##### V1.0.0

- 开发     common模块搭建