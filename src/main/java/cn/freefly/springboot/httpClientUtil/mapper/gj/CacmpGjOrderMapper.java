package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjOrder;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/04/07
*/
@Repository
public interface CacmpGjOrderMapper {
    long countByExample(CacmpGjOrderCriteria example);

    int deleteByExample(CacmpGjOrderCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjOrder record);

    int insertSelective(CacmpGjOrder record);

    List<CacmpGjOrder> selectByExampleWithRowbounds(CacmpGjOrderCriteria example, RowBounds rowBounds);

    List<CacmpGjOrder> selectByExample(CacmpGjOrderCriteria example);

    CacmpGjOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjOrder record, @Param("example") CacmpGjOrderCriteria example);

    int updateByExample(@Param("record") CacmpGjOrder record, @Param("example") CacmpGjOrderCriteria example);

    int updateByPrimaryKeySelective(CacmpGjOrder record);

    int updateByPrimaryKey(CacmpGjOrder record);
}