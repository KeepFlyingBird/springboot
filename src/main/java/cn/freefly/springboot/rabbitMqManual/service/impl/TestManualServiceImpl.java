package cn.freefly.springboot.rabbitMqManual.service.impl;

import cn.freefly.springboot.rabbitMqManual.dto.TestManualSendObj;
import cn.freefly.springboot.rabbitMqManual.producer.TestManualProducer;
import cn.freefly.springboot.rabbitMqManual.service.TestManualService;
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
public class TestManualServiceImpl implements TestManualService {
    @Autowired
    private TestManualProducer testProducer;

    @Override
    public void sendObjList(List<TestManualSendObj> list) {
        list.forEach((TestManualSendObj sendObj) -> {
            testProducer.sendMsgTest(sendObj);
        });
    }

}
