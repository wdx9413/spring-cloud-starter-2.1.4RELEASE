# Spring Cloud脚手架

## 先决条件

* git
* intellij idea
* java
* rabbitmq

## spring cloud starter

| 服务名 | 简介 | 端口 | 启动顺序|
| --- | --- | --- | ---|
| eureka | 服务注册中心 | 8100 | 1|
| config | 分布式配置中心 | 8140 | 2|
| gateway | API网关 | 8130 | 4|
| monitor-zipkin.jar | 链路追踪server jar包 | 9411 | 3 |
| monitor-turbine | hystrix监控聚合 | 8150 | 5 |
| ribbon-client | 服务消费客户端 | 8120 | 4|
| service-hello | 业务层hello | 8110 | 4|

## 项目结构

```

├─starter-cloud----------------------------父项目，公共依赖
|  |
│  ├─config------------------------------分布式配置服务中心
│  │
│  ├─eureka-----------------------------微服务注册中心
│  │
│  ├─gateway--------------------------微服务网关中心
│  │
│  ├─monitor----------------------------微服务监控中心
│  │  │
│  │  ├─turbine-------------------------Hystrix聚合监控板
│  │  │
│  │  └─zipkin-server--------------------------链路追踪中心jar包
|  |
│  ├─ribbon-client------------------------------服务消费客户端
|  |
|  ├─service--------------------------业务层
│  │  │
│  │  └─hello-----------------------------------hello demo


```