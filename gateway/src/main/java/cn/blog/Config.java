package cn.blog;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
//        return routeLocatorBuilder.routes()
//                .route(p -> p
//                    .path("/hello/**")
//                    .filters(f -> f.hystrix(config -> config.setName("mycmd")))
//                    .uri("lb://CLIENT"))
//                .build();
//    }
}
