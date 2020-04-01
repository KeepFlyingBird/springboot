package cn.freefly.springboot.httpClientUtil.service.gj;

import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.httpClientUtil.dto.enums.GjOrderStatusE;
import cn.freefly.springboot.httpClientUtil.dto.gj.order.channel.ChannelOrderRequest;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjOrder;

public interface OrderService {
    /**
     * @return com.jianyuan.fund.web.dto.BaseResponse
     * @Author houjianhui
     * @Description 进件API接口
     * @Date 16:56 2020/2/28
     * @Param [orderRequest]
     **/
    BaseResponse createOrder(ChannelOrderRequest orderRequest);

    /**
     * @return com.jianyuan.fund.domain.gj.CacmpGjOrder
     * @Author houjianhui
     * @Description 通过订单ID查询订单信息
     * @Date 19:39 2020/2/28
     * @Param [orderId]
     **/
    CacmpGjOrder findOrderInfoById(String orderId);

    /**
     * @return void
     * @Author houjianhui
     * @Description 修改订单状态
     * @Date 15:36 2020/3/25
     * @Param [orderId, orderStatus]
     **/
    void modifyOrderStatus(String orderId, GjOrderStatusE orderStatus);
}
