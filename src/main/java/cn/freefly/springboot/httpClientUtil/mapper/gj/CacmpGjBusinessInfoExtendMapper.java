package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessInfoExtend;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessInfoExtendCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjBusinessInfoExtendMapper {
    long countByExample(CacmpGjBusinessInfoExtendCriteria example);

    int deleteByExample(CacmpGjBusinessInfoExtendCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjBusinessInfoExtend record);

    int insertSelective(CacmpGjBusinessInfoExtend record);

    List<CacmpGjBusinessInfoExtend> selectByExampleWithRowbounds(CacmpGjBusinessInfoExtendCriteria example, RowBounds rowBounds);

    List<CacmpGjBusinessInfoExtend> selectByExample(CacmpGjBusinessInfoExtendCriteria example);

    CacmpGjBusinessInfoExtend selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjBusinessInfoExtend record, @Param("example") CacmpGjBusinessInfoExtendCriteria example);

    int updateByExample(@Param("record") CacmpGjBusinessInfoExtend record, @Param("example") CacmpGjBusinessInfoExtendCriteria example);

    int updateByPrimaryKeySelective(CacmpGjBusinessInfoExtend record);

    int updateByPrimaryKey(CacmpGjBusinessInfoExtend record);
}