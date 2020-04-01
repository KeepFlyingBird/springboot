package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjPersonBank;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjPersonBankCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjPersonBankMapper {
    long countByExample(CacmpGjPersonBankCriteria example);

    int deleteByExample(CacmpGjPersonBankCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjPersonBank record);

    int insertSelective(CacmpGjPersonBank record);

    List<CacmpGjPersonBank> selectByExampleWithRowbounds(CacmpGjPersonBankCriteria example, RowBounds rowBounds);

    List<CacmpGjPersonBank> selectByExample(CacmpGjPersonBankCriteria example);

    CacmpGjPersonBank selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjPersonBank record, @Param("example") CacmpGjPersonBankCriteria example);

    int updateByExample(@Param("record") CacmpGjPersonBank record, @Param("example") CacmpGjPersonBankCriteria example);

    int updateByPrimaryKeySelective(CacmpGjPersonBank record);

    int updateByPrimaryKey(CacmpGjPersonBank record);
}