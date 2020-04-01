package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectContacts;

public interface GjSubjectContactsService {
    /**
     * @Author xiao.yunfei
     * @Description 主体联系人表-插入
     * @Date 2020/3/28 20:51
     * @Param [subjectContacts]
     * @Return void
     */
    void insertGjSubjectContacts(CacmpGjSubjectContacts subjectContacts);
    /**
     * @Author xiao.yunfei
     * @Description 主体联系人表-修改
     * @Date 2020/3/28 20:51
     * @Param [subjectContacts]
     * @Return void
     */
    void modifyGjSubjectContacts(CacmpGjSubjectContacts subjectContacts);
    /**
     * @Author xiao.yunfei
     * @Description 主体联系人表-查找
     * @Date 2020/3/28 20:51
     * @Param [orderId]
     * @Return com.jianyuan.fund.domain.gj.CacmpGjSubjectContacts
     */
    CacmpGjSubjectContacts getCacmpGjSubjectContactsByOrderId(String orderId);
}
