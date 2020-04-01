package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjNode;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjNodeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjNodeMapper {
    long countByExample(CacmpGjNodeCriteria example);

    int deleteByExample(CacmpGjNodeCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjNode record);

    int insertSelective(CacmpGjNode record);

    List<CacmpGjNode> selectByExampleWithRowbounds(CacmpGjNodeCriteria example, RowBounds rowBounds);

    List<CacmpGjNode> selectByExample(CacmpGjNodeCriteria example);

    CacmpGjNode selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjNode record, @Param("example") CacmpGjNodeCriteria example);

    int updateByExample(@Param("record") CacmpGjNode record, @Param("example") CacmpGjNodeCriteria example);

    int updateByPrimaryKeySelective(CacmpGjNode record);

    int updateByPrimaryKey(CacmpGjNode record);
}