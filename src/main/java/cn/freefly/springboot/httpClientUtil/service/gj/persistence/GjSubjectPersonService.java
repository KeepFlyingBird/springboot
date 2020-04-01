package cn.freefly.springboot.httpClientUtil.service.gj.persistence;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectPerson;

public interface GjSubjectPersonService {
    /**
     * @return void
     * @Author houjianhui
     * @Description 修改主体自然人信息
     * @Date 16:27 2020/3/25
     * @Param [subjectPerson]
     **/
    void modifyGjSubjectPerson(CacmpGjSubjectPerson subjectPerson);

    /**
     * @return void
     * @Author houjianhui
     * @Description 新增主体自然人信息
     * @Date 16:27 2020/3/25
     * @Param [subjectPerson]
     **/
    void insertGjSubjectPerson(CacmpGjSubjectPerson subjectPerson);

    /**
     * @return void
     * @Author houjianhui
     * @Description 通过订单ID查询主体自然人信息
     * @Date 16:27 2020/3/25
     * @Param [subjectPerson]
     **/
    CacmpGjSubjectPerson getCacmpGjSubjectPersonByOrderId(String orderId);
}
