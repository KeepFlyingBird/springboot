package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessMortgage;

public interface GjBusinessMortgageService {
    /**
     * @return void
     * @Author houjianhui
     * @Description 新增抵押办理信息
     * @Date 14:43 2020/3/25
     * @Param [businessMortgage]
     **/
    void insertBusinessMortgage(CacmpGjBusinessMortgage businessMortgage);

    /**
     * @return void
     * @Author houjianhui
     * @Description 修改抵押办理信息
     * @Date 14:43 2020/3/25
     * @Param [businessMortgage]
     **/
    void modifyBusinessMortgage(CacmpGjBusinessMortgage businessMortgage);

    /**
     * @return com.jianyuan.fund.domain.gj.CacmpGjBusinessMortgage
     * @Author houjianhui
     * @Description 通订单ID查询抵押办理信息
     * @Date 14:43 2020/3/25
     * @Param [orderId]
     **/
    CacmpGjBusinessMortgage getCacmpGjBusinessMortgageByOrderId(String orderId);
}
