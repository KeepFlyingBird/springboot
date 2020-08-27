package cn.freefly.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {
    @RequestMapping("/api/consulTest")
    public String consulTest() {
        return "hello,springBoot";
    }
}
