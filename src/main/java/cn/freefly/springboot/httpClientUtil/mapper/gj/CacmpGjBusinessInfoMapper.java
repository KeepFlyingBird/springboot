package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessInfo;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjBusinessInfoMapper {
    long countByExample(CacmpGjBusinessInfoCriteria example);

    int deleteByExample(CacmpGjBusinessInfoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjBusinessInfo record);

    int insertSelective(CacmpGjBusinessInfo record);

    List<CacmpGjBusinessInfo> selectByExampleWithRowbounds(CacmpGjBusinessInfoCriteria example, RowBounds rowBounds);

    List<CacmpGjBusinessInfo> selectByExample(CacmpGjBusinessInfoCriteria example);

    CacmpGjBusinessInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjBusinessInfo record, @Param("example") CacmpGjBusinessInfoCriteria example);

    int updateByExample(@Param("record") CacmpGjBusinessInfo record, @Param("example") CacmpGjBusinessInfoCriteria example);

    int updateByPrimaryKeySelective(CacmpGjBusinessInfo record);

    int updateByPrimaryKey(CacmpGjBusinessInfo record);
}