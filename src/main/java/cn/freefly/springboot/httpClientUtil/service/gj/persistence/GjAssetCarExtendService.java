package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarExtend;

/**
 * @ClassNmae GjAssetCarExtendService
 * @Description 资产汽车扩展信息
 * @Author houjianhui
 * @Date 2020/3/25 14:32
 * @Version 1.0
 **/
public interface GjAssetCarExtendService {
    /**
     * @return void
     * @Author houjianhui
     * @Description 修改资产汽车扩展信息
     * @Date 14:34 2020/3/25
     * @Param [assetCarExtend]
     **/
    void modifyAssetCarExtend(CacmpGjAssetCarExtend assetCarExtend);

    /**
     * @return void
     * @Author houjianhui
     * @Description 新增资产汽车扩展信息
     * @Date 14:34 2020/3/25
     * @Param [assetCarExtend]
     **/
    void insertGjAssetCarExtend(CacmpGjAssetCarExtend assetCarExtend);

    /**
     * @return com.jianyuan.fund.domain.gj.CacmpGjAssetCarExtend
     * @Author houjianhui
     * @Description 通过资产ID查询汽车资产扩展信息
     * @Date 14:34 2020/3/25
     * @Param [orderId]
     **/
    CacmpGjAssetCarExtend getAssetCarExtendByOrderId(String orderId);
}
