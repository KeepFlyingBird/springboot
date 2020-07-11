package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessFinance;

public interface GjBusinessFinaceService {
    /**
     * @Author xiao.yunfei
     * @Description 融租信息-插入
     * @Date 2020/3/28 20:47
     * @Param [businessFinance]
     * @Return void
     */ 
    void insertGjBusinessFinance(CacmpGjBusinessFinance businessFinance);
    /**
     * @Author xiao.yunfei
     * @Description 融租信息-修改
     * @Date 2020/3/28 20:47
     * @Param [businessFinance]
     * @Return void
     */
    void modifyGjBusinessFinance(CacmpGjBusinessFinance businessFinance);
    /**
     * @Author xiao.yunfei
     * @Description 融租信息-查找
     * @Date 2020/3/28 20:47
     * @Param [orderId]
     * @Return com.jianyuan.fund.domain.gj.CacmpGjBusinessFinance
     */
    CacmpGjBusinessFinance getCacmpGjBusinessFinanceByOrderId(String orderId);
}
