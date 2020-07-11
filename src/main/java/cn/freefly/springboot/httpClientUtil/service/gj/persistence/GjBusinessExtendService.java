package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessInfoExtend;

public interface GjBusinessExtendService {
    /**
     * @return void
     * @Author houjianhui
     * @Description 保存业务信息扩展信息
     * @Date 17:19 2020/3/25
     * @Param [businessInfoExtend]
     **/
    void insertBusiExtend(CacmpGjBusinessInfoExtend businessInfoExtend);

    /**
     * @return void
     * @Author houjianhui
     * @Description 修改业务信息扩展信息
     * @Date 17:19 2020/3/25
     * @Param [businessInfoExtend]
     **/
    void modifyBusiExtend(CacmpGjBusinessInfoExtend businessInfoExtend);

    /**
     * @return com.jianyuan.fund.domain.gj.CacmpGjBusinessInfoExtend
     * @Author houjianhui
     * @Description 通过订单ID查询业务信息扩展信息
     * @Date 17:20 2020/3/25
     * @Param [orderId]
     **/
    CacmpGjBusinessInfoExtend getBusinessInfoExtendByOrderId(String orderId);
}
