package cn.freefly.springboot.tokenAuth.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassNmae UserInfo
 * @Author xiao.yunfei
 * @Date 2020/4/10 15:27
 * @Desc
 */
@Data
@Builder
public class UserInfo {
    public String userName;
    public String passWord;
    public String telPhone;
}
