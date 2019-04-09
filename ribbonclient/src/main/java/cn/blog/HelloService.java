package cn.blog;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloServiceFallback")
    public String hello() {
        return restTemplate.getForObject("http://SERVICE-HELLO/hello", String.class);
    }

    public String helloServiceFallback() {
        return "error";
    }
}
