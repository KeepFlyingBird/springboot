package cn.freefly.springboot.controller;

import cn.freefly.springboot.entity.BaseRes;
import cn.freefly.springboot.exception.SystemException;
import cn.freefly.springboot.tokenAuth.dto.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNmae ExceptionTest
 * @Author xiao.yunfei
 * @Date 2020/5/11 15:49
 * @Desc
 */
@RestController
@Slf4j
public class ExceptionTest {

    @PostMapping("test/exception")
    public BaseRes testException(@RequestBody UserInfo userInfo) {
        if (StringUtils.isEmpty(userInfo.getUserName())) {
            throw new SystemException("测试异常");
        }
        return null;
    }
}
