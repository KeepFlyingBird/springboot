package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessProject;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessProjectCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjBusinessProjectMapper {
    long countByExample(CacmpGjBusinessProjectCriteria example);

    int deleteByExample(CacmpGjBusinessProjectCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjBusinessProject record);

    int insertSelective(CacmpGjBusinessProject record);

    List<CacmpGjBusinessProject> selectByExampleWithRowbounds(CacmpGjBusinessProjectCriteria example, RowBounds rowBounds);

    List<CacmpGjBusinessProject> selectByExample(CacmpGjBusinessProjectCriteria example);

    CacmpGjBusinessProject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjBusinessProject record, @Param("example") CacmpGjBusinessProjectCriteria example);

    int updateByExample(@Param("record") CacmpGjBusinessProject record, @Param("example") CacmpGjBusinessProjectCriteria example);

    int updateByPrimaryKeySelective(CacmpGjBusinessProject record);

    int updateByPrimaryKey(CacmpGjBusinessProject record);
}