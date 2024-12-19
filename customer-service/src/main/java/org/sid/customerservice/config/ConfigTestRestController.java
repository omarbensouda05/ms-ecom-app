package org.sid.customerservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class ConfigTestRestController {

    @Value("${global.params.p1}")
    private String a;
    @Value("${global.params.p2}")
    private String b;
    @GetMapping("/configtest1")
    public Map<String,String> configtest(){
        return Map.of("p1",a,"p2",b);
    }
}
