package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectPersonExtend;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectPersonExtendCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjSubjectPersonExtendMapper {
    long countByExample(CacmpGjSubjectPersonExtendCriteria example);

    int deleteByExample(CacmpGjSubjectPersonExtendCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjSubjectPersonExtend record);

    int insertSelective(CacmpGjSubjectPersonExtend record);

    List<CacmpGjSubjectPersonExtend> selectByExampleWithRowbounds(CacmpGjSubjectPersonExtendCriteria example, RowBounds rowBounds);

    List<CacmpGjSubjectPersonExtend> selectByExample(CacmpGjSubjectPersonExtendCriteria example);

    CacmpGjSubjectPersonExtend selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjSubjectPersonExtend record, @Param("example") CacmpGjSubjectPersonExtendCriteria example);

    int updateByExample(@Param("record") CacmpGjSubjectPersonExtend record, @Param("example") CacmpGjSubjectPersonExtendCriteria example);

    int updateByPrimaryKeySelective(CacmpGjSubjectPersonExtend record);

    int updateByPrimaryKey(CacmpGjSubjectPersonExtend record);
}