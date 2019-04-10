package cn.blog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MyController {

    @Value("${version}")
    String version;
    @GetMapping("/version")
    public String version() {
        return "version:" + version;
    }
}
