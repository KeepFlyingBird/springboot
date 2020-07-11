package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectSpouse;

public interface GjSubjectSpouseService {
    /**
     * @Author xiao.yunfei
     * @Description 主体配偶表-插入
     * @Date 2020/3/28 21:00
     * @Param [subjectSpouse]
     * @Return void
     */
    void insertGjSubjectSpouse(CacmpGjSubjectSpouse subjectSpouse);
    /**
     * @Author xiao.yunfei
     * @Description 主体配偶表-修改
     * @Date 2020/3/28 21:00
     * @Param [subjectSpouse]
     * @Return void
     */
    void modifyGjSubjectSpouse(CacmpGjSubjectSpouse subjectSpouse);
    /**
     * @Author xiao.yunfei
     * @Description 主体配偶表-查询
     * @Date 2020/3/28 21:00
     * @Param [orderId]
     * @Return com.jianyuan.fund.domain.gj.CacmpGjSubjectSpouse
     */
    CacmpGjSubjectSpouse getCacmpGjSubjectSpouseByOrderId(String orderId);
}
