package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectSpouse;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectSpouseCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjSubjectSpouseMapper {
    long countByExample(CacmpGjSubjectSpouseCriteria example);

    int deleteByExample(CacmpGjSubjectSpouseCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjSubjectSpouse record);

    int insertSelective(CacmpGjSubjectSpouse record);

    List<CacmpGjSubjectSpouse> selectByExampleWithRowbounds(CacmpGjSubjectSpouseCriteria example, RowBounds rowBounds);

    List<CacmpGjSubjectSpouse> selectByExample(CacmpGjSubjectSpouseCriteria example);

    CacmpGjSubjectSpouse selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjSubjectSpouse record, @Param("example") CacmpGjSubjectSpouseCriteria example);

    int updateByExample(@Param("record") CacmpGjSubjectSpouse record, @Param("example") CacmpGjSubjectSpouseCriteria example);

    int updateByPrimaryKeySelective(CacmpGjSubjectSpouse record);

    int updateByPrimaryKey(CacmpGjSubjectSpouse record);
}