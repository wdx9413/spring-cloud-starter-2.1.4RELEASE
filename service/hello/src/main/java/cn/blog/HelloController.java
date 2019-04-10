package cn.blog;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello, it's provider.";
    }
}
