package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessInfo;

public interface GjBusinessService {
    /**
     * @Author xiao.yunfei
     * @Description 业务信息表-插入
     * @Date 2020/3/28 20:44
     * @Param [businessInfo]
     * @Return void
     */
    void insertGjBusinessInfo(CacmpGjBusinessInfo businessInfo);
    /**
     * @Author xiao.yunfei
     * @Description 业务信息表-修改
     * @Date 2020/3/28 20:44
     * @Param [businessInfo]
     * @Return void
     */
    void modifyGjBusinessInfo(CacmpGjBusinessInfo businessInfo);
    /**
     * @Author xiao.yunfei
     * @Description 业务信息表-查询
     * @Date 2020/3/28 20:44
     * @Param [orderId]
     * @Return com.jianyuan.fund.domain.gj.CacmpGjBusinessInfo
     */
    CacmpGjBusinessInfo getCacmpGjBusinessInfoByOrderId(String orderId);
}
