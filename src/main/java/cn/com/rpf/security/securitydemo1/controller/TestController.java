package cn.com.rpf.security.securitydemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/10/10 17:31
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello security";
    }

    @GetMapping("/hi")
    public String sayHi() {
        return "hi security";

    }
}
