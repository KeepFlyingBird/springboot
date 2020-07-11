package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetRealEstate;

import java.util.List;

public interface GjAssetRealEstatesService {
    /**
     * @Author xiao.yunfei
     * @Description 资产不动产扩展表-插入
     * @Date 2020/3/28 20:39
     * @Param [assetRealEstate]
     * @Return void
     */
    void insertGjAssetRealEstate(CacmpGjAssetRealEstate assetRealEstate);
    /**
     * @Author xiao.yunfei
     * @Description 资产不动产扩展表-修改
     * @Date 2020/3/28 20:39
     * @Param [assetRealEstate]
     * @Return void
     */
    void modifyGjAssetRealEstate(CacmpGjAssetRealEstate assetRealEstate);
    /**
     * @Author xiao.yunfei
     * @Description 资产不动产扩展表-查询
     * @Date 2020/3/28 20:40
     * @Param [orderId]
     * @Return com.jianyuan.fund.domain.gj.CacmpGjAssetRealEstate
     */
    List<CacmpGjAssetRealEstate> getCacmpGjAssetRealEstateByOrderId(String orderId);

    /**
     * @Author xiao.yunfei
     * @Description 资产不动产扩展表-删除
     * @Date 2020/4/2 10:24
     * @Param [orderId]
     * @Return void
     */
    void deleteGjAssetRealEstatesByOrderId(String orderId);
}
