package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessSubject;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessSubjectCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjBusinessSubjectMapper {
    long countByExample(CacmpGjBusinessSubjectCriteria example);

    int deleteByExample(CacmpGjBusinessSubjectCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjBusinessSubject record);

    int insertSelective(CacmpGjBusinessSubject record);

    List<CacmpGjBusinessSubject> selectByExampleWithRowbounds(CacmpGjBusinessSubjectCriteria example, RowBounds rowBounds);

    List<CacmpGjBusinessSubject> selectByExample(CacmpGjBusinessSubjectCriteria example);

    CacmpGjBusinessSubject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjBusinessSubject record, @Param("example") CacmpGjBusinessSubjectCriteria example);

    int updateByExample(@Param("record") CacmpGjBusinessSubject record, @Param("example") CacmpGjBusinessSubjectCriteria example);

    int updateByPrimaryKeySelective(CacmpGjBusinessSubject record);

    int updateByPrimaryKey(CacmpGjBusinessSubject record);
}