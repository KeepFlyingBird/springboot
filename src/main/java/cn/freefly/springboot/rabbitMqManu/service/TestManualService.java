package cn.freefly.springboot.rabbitMqManu.service;


import cn.freefly.springboot.rabbitMqManu.dto.TestManualSendObj;

import java.util.List;

public interface TestManualService {
    void sendObjList(List<TestManualSendObj> list);
}
