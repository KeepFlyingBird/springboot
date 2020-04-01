package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectGuarantee;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectGuaranteeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjSubjectGuaranteeMapper {
    long countByExample(CacmpGjSubjectGuaranteeCriteria example);

    int deleteByExample(CacmpGjSubjectGuaranteeCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjSubjectGuarantee record);

    int insertSelective(CacmpGjSubjectGuarantee record);

    List<CacmpGjSubjectGuarantee> selectByExampleWithRowbounds(CacmpGjSubjectGuaranteeCriteria example, RowBounds rowBounds);

    List<CacmpGjSubjectGuarantee> selectByExample(CacmpGjSubjectGuaranteeCriteria example);

    CacmpGjSubjectGuarantee selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjSubjectGuarantee record, @Param("example") CacmpGjSubjectGuaranteeCriteria example);

    int updateByExample(@Param("record") CacmpGjSubjectGuarantee record, @Param("example") CacmpGjSubjectGuaranteeCriteria example);

    int updateByPrimaryKeySelective(CacmpGjSubjectGuarantee record);

    int updateByPrimaryKey(CacmpGjSubjectGuarantee record);
}