package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarAssessment;

public interface GjAssetCarAssessmentService {
    /**
     * @Author xiao.yunfei
     * @Description
     * @Date 2020/3/28 17:16
     * @Param [assetCarAssessment]
     * @Return void
     */
    void modifyGjAssetCarAssessment(CacmpGjAssetCarAssessment assetCarAssessment);

    /**
     * @Author xiao.yunfei
     * @Description
     * @Date 2020/3/28 17:17
     * @Param [assetCarAssessment]
     * @Return void
     */
    void insertGjAssetCarAssessment(CacmpGjAssetCarAssessment assetCarAssessment);

    /**
     * @Author xiao.yunfei
     * @Description
     * @Date 2020/3/28 17:17
     * @Param [orderId]
     * @Return com.jianyuan.fund.domain.gj.CacmpGjAssetCarAssessment
     */
    CacmpGjAssetCarAssessment getCacmpGjAssetCarAssessmentByOrderId(String orderId);
}
