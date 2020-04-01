package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCar;

public interface GjAssetCarService {
    /**
     * @return void
     * @Author houjianhui
     * @Description 修改资产汽车信息
     * @Date 14:10 2020/3/25
     * @Param [assetCar]
     **/
    void modifyAssetCar(CacmpGjAssetCar assetCar);

    /**
     * @return void
     * @Author houjianhui
     * @Description 新增资产汽车信息
     * @Date 14:10 2020/3/25
     * @Param [assetCar]
     **/
    void insertGjAssetCar(CacmpGjAssetCar assetCar);

    /**
     * @return com.jianyuan.fund.domain.gj.CacmpGjAssetCar
     * @Author houjianhui
     * @Description 通过订单ID查询汽车资产信息
     * @Date 14:23 2020/3/25
     * @Param [orderId]
     **/
    CacmpGjAssetCar getAssetCarInfoByOrderId(String orderId);
}
