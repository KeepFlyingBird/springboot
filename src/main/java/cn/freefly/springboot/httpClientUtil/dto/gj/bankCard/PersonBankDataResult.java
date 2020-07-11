package cn.freefly.springboot.httpClientUtil.dto.gj.bankCard;

import lombok.Data;

/**
 * @ClassNmae PersonBankDataResult
 * @Author xiao.yunfei
 * @Date 2020/3/5 11:15
 * @Desc
 */
@Data
public class PersonBankDataResult {
    private boolean success;
    private String message;
    private String cardNo;
    private String signId;
}
