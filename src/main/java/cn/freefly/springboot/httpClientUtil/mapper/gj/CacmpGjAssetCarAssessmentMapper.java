package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarAssessment;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarAssessmentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjAssetCarAssessmentMapper {
    long countByExample(CacmpGjAssetCarAssessmentCriteria example);

    int deleteByExample(CacmpGjAssetCarAssessmentCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjAssetCarAssessment record);

    int insertSelective(CacmpGjAssetCarAssessment record);

    List<CacmpGjAssetCarAssessment> selectByExampleWithRowbounds(CacmpGjAssetCarAssessmentCriteria example, RowBounds rowBounds);

    List<CacmpGjAssetCarAssessment> selectByExample(CacmpGjAssetCarAssessmentCriteria example);

    CacmpGjAssetCarAssessment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjAssetCarAssessment record, @Param("example") CacmpGjAssetCarAssessmentCriteria example);

    int updateByExample(@Param("record") CacmpGjAssetCarAssessment record, @Param("example") CacmpGjAssetCarAssessmentCriteria example);

    int updateByPrimaryKeySelective(CacmpGjAssetCarAssessment record);

    int updateByPrimaryKey(CacmpGjAssetCarAssessment record);
}