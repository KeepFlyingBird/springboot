package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessFinance;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessFinanceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjBusinessFinanceMapper {
    long countByExample(CacmpGjBusinessFinanceCriteria example);

    int deleteByExample(CacmpGjBusinessFinanceCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjBusinessFinance record);

    int insertSelective(CacmpGjBusinessFinance record);

    List<CacmpGjBusinessFinance> selectByExampleWithRowbounds(CacmpGjBusinessFinanceCriteria example, RowBounds rowBounds);

    List<CacmpGjBusinessFinance> selectByExample(CacmpGjBusinessFinanceCriteria example);

    CacmpGjBusinessFinance selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjBusinessFinance record, @Param("example") CacmpGjBusinessFinanceCriteria example);

    int updateByExample(@Param("record") CacmpGjBusinessFinance record, @Param("example") CacmpGjBusinessFinanceCriteria example);

    int updateByPrimaryKeySelective(CacmpGjBusinessFinance record);

    int updateByPrimaryKey(CacmpGjBusinessFinance record);
}