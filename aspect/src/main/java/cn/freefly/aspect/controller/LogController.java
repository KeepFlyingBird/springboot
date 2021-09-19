package cn.freefly.aspect.controller;

import cn.freefly.aspect.annotation.Log;
import cn.freefly.aspect.enums.BusinessType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/aspect/log")
public class LogController {
    @Log(title = "",businessType = BusinessType.OTHER)
    @PostMapping("/test")
    public void test(){
      log.info("----logTest---------");
    }
}
