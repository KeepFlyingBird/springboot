package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectContacts;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectContactsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjSubjectContactsMapper {
    long countByExample(CacmpGjSubjectContactsCriteria example);

    int deleteByExample(CacmpGjSubjectContactsCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjSubjectContacts record);

    int insertSelective(CacmpGjSubjectContacts record);

    List<CacmpGjSubjectContacts> selectByExampleWithRowbounds(CacmpGjSubjectContactsCriteria example, RowBounds rowBounds);

    List<CacmpGjSubjectContacts> selectByExample(CacmpGjSubjectContactsCriteria example);

    CacmpGjSubjectContacts selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjSubjectContacts record, @Param("example") CacmpGjSubjectContactsCriteria example);

    int updateByExample(@Param("record") CacmpGjSubjectContacts record, @Param("example") CacmpGjSubjectContactsCriteria example);

    int updateByPrimaryKeySelective(CacmpGjSubjectContacts record);

    int updateByPrimaryKey(CacmpGjSubjectContacts record);
}