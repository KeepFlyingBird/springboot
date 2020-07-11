package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectPerson;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectPersonCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjSubjectPersonMapper {
    long countByExample(CacmpGjSubjectPersonCriteria example);

    int deleteByExample(CacmpGjSubjectPersonCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjSubjectPerson record);

    int insertSelective(CacmpGjSubjectPerson record);

    List<CacmpGjSubjectPerson> selectByExampleWithRowbounds(CacmpGjSubjectPersonCriteria example, RowBounds rowBounds);

    List<CacmpGjSubjectPerson> selectByExample(CacmpGjSubjectPersonCriteria example);

    CacmpGjSubjectPerson selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjSubjectPerson record, @Param("example") CacmpGjSubjectPersonCriteria example);

    int updateByExample(@Param("record") CacmpGjSubjectPerson record, @Param("example") CacmpGjSubjectPersonCriteria example);

    int updateByPrimaryKeySelective(CacmpGjSubjectPerson record);

    int updateByPrimaryKey(CacmpGjSubjectPerson record);
}