package cn.freefly.springboot.httpClientUtil.util.gj;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNmae GjResponseBank
 * @Author xiao.yunfei
 * @Date 2020/4/1 10:48
 * @Desc
 */
@Data
@NoArgsConstructor
public class GjResponseBank {
    public boolean success;
    public String message;
    public String cardNo;
}
