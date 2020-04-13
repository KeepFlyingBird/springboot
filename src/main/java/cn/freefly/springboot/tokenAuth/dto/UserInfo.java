package cn.freefly.springboot.tokenAuth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNmae UserInfo
 * @Author xiao.yunfei
 * @Date 2020/4/10 15:27
 * @Desc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    public String userName;
    public String passWord;
    public String telPhone;
}
