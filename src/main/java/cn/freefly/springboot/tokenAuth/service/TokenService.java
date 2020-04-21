package cn.freefly.springboot.tokenAuth.service;

import cn.freefly.springboot.entity.BaseRes;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.tokenAuth.dto.UserInfo;

public interface TokenService {
    BaseResponse login(UserInfo userInfo);

    void query(String token);
}
