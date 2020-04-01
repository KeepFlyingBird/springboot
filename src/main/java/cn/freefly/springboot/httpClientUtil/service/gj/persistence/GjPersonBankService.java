package cn.freefly.springboot.httpClientUtil.service.gj.persistence;


import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjPersonBank;

public interface GjPersonBankService {
    /**
     * @Author xiao.yunfei
     * @Description
     * @Date 2020/3/29 15:45
     * @Param [personBank]
     * @Return void
     */
    void modifyGjPersonBank(CacmpGjPersonBank personBank);

    /**
     * @Author xiao.yunfei
     * @Description
     * @Date 2020/3/29 15:45
     * @Param [personBank]
     * @Return void
     */
    void insertGjPersonBank(CacmpGjPersonBank personBank);

    /**
     * @Author xiao.yunfei
     * @Description
     * @Date 2020/3/29 15:47
     * @Param [orderId]
     * @Return com.jianyuan.fund.domain.gj.CacmpGjPersonBank
     */
    CacmpGjPersonBank getCacmpGjPersonBankByOrderId(String orderId, String bankAccount);
}
