package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectGuarantee;

public interface GjSubjectGuaranteeService {
    /**
     * @Author xiao.yunfei
     * @Description 主体担保人表-插入
     * @Date 2020/3/28 20:55
     * @Param [subjectGuarantee]
     * @Return void
     */
    void insertGjSubjectGuarantee(CacmpGjSubjectGuarantee subjectGuarantee);
    /**
     * @Author xiao.yunfei
     * @Description 主体担保人表-修改
     * @Date 2020/3/28 20:55
     * @Param [subjectGuarantee]
     * @Return void
     */
    void modifyGjSubjectGuarantee(CacmpGjSubjectGuarantee subjectGuarantee);
    /**
     * @Author xiao.yunfei
     * @Description 主体担保人表-查找
     * @Date 2020/3/28 20:55
     * @Param [orderId]
     * @Return com.jianyuan.fund.domain.gj.CacmpGjSubjectGuarantee
     */
    CacmpGjSubjectGuarantee getCacmpGjSubjectGuaranteeByOrderId(String orderId);
}
