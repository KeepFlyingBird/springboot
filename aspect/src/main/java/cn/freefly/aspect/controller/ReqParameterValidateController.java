package cn.freefly.aspect.controller;

import cn.freefly.aspect.annotation.ReqParameterValidate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/aspect/reqParameterValidate")
public class ReqParameterValidateController {

    @ReqParameterValidate
    @PostMapping("/test")
    public void test(){
        log.info("---test====");
    }
}
