package cn.freefly.springboot.rabbitMqManual.service;


import cn.freefly.springboot.rabbitMqManual.dto.TestManualSendObj;

import java.util.List;

public interface TestManualService {
    void sendObjList(List<TestManualSendObj> list);
}
