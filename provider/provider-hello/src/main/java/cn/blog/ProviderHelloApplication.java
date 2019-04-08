package cn.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHelloApplication.class, args);
    }
}
