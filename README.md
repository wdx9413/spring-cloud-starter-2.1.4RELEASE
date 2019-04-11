# Spring Cloud脚手架

spring cloud starter

| name | desc | port | start-order|
| --- | --- | --- | ---|
| eureka | 服务注册中心 | 8100 | 1|
| config | 分布式配置中心git | 8140 | 2|
| gateway | API网关 | 8130 | 4|
| ribbonclient | 服务消费客户端 | 8120 | 4|
| service | 业务层 | -- | --|
| service-hello | 业务hello | 8110 | 4|
| monitor | 监控层 | -- | -- |
| monitor-turbine | hystrix监控聚合 | 8150 | 5 |
| monitor-zipkin.jar | 链路追踪server jar包 | 9411 | 3 |
