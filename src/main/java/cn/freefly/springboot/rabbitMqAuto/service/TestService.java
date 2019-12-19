package cn.freefly.springboot.rabbitMqAuto.service;

import cn.freefly.springboot.rabbitMqAuto.dto.TestSendObj;

import java.util.List;

public interface TestService {
    void sendObjList(List<TestSendObj> list);
}
