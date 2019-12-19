package cn.freefly.springboot.rabbitMqAuto.service.impl;

import cn.freefly.springboot.rabbitMqAuto.dto.TestSendObj;
import cn.freefly.springboot.rabbitMqAuto.service.TestService;
import cn.freefly.springboot.rabbitMqAuto.producer.TestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae TestServiceImpl
 * @Author xiao.yunfei
 * @Date 2019/12/15 14:16
 * @Desc
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestProducer testProducer;

    @Override
    public void sendObjList(List<TestSendObj> list) {
        list.forEach((TestSendObj sendObj) -> {
            testProducer.sendMsgTest(sendObj);
        });
    }
}
