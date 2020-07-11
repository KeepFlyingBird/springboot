package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectContacts;

import java.util.List;

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
    List<CacmpGjSubjectContacts> getCacmpGjSubjectContactsByOrderId(String orderId);

    /**
     * @Author xiao.yunfei
     * @Description 主体联系人表-删除
     * @Date 2020/4/2 11:21
     * @Param [orderId]
     * @Return void
     */
    void deleteGjSubjectContacts(String orderId);
}
