package cn.freefly.springboot.rabbitMqManual.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @ClassNmae TestManualSendObj
 * @Author xiao.yunfei
 * @Date 2019/12/13 14:40
 * @Desc
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TestManualSendObj {
    private String orderNo;
    private String userName;
    private int age;
}
