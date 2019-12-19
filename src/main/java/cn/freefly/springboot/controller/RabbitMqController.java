package cn.freefly.springboot.controller;

import cn.freefly.springboot.rabbitMqAuto.dto.TestSendObj;
import cn.freefly.springboot.rabbitMqAuto.service.TestService;
import cn.freefly.springboot.rabbitMqManual.dto.TestManualSendObj;
import cn.freefly.springboot.rabbitMqManual.service.TestManualService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNmae RabbitMqController
 * @Author xiao.yunfei
 * @Date 2019/11/24 17:47
 * @Desc
 */
@Api(description = "rabbitmq消息队列", tags = {"rabbitmq消息队列"})
@RestController
public class RabbitMqController {
    @Autowired
    TestService testService;

    @Autowired
    TestManualService testManualService;

    @ApiOperation(
            value = "测试mq：自动应答"
            ,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @PostMapping("/rabbitmq/test")
    public void testSendObjList(){
        List<TestSendObj> list = new ArrayList<TestSendObj>();
        list.add(new TestSendObj("001","张三001",20));
        list.add(new TestSendObj("002","张三002",21));
        list.add(new TestSendObj("003","张三003",22));
        list.add(new TestSendObj("004","张三004",23));
        list.add(new TestSendObj("005","张三005",24));
        list.add(new TestSendObj("006","张三006",25));
        testService.sendObjList(list);
    }

    @ApiOperation(
            value = "测试mq：手动应答"
            ,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @PostMapping("/rabbitmq/testManual")
    public void testManualSendObjList(){
        List<TestManualSendObj> list = new ArrayList<>();
        list.add(new TestManualSendObj("001","张三001",20));
        list.add(new TestManualSendObj("002","张三002",21));
        list.add(new TestManualSendObj("003","张三003",22));
        list.add(new TestManualSendObj("004","张三004",23));
        list.add(new TestManualSendObj("005","张三005",24));
        list.add(new TestManualSendObj("006","张三006",25));
        testManualService.sendObjList(list);
    }
}
