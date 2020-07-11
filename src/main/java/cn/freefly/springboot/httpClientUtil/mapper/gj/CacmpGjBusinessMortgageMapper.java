package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessMortgage;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessMortgageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjBusinessMortgageMapper {
    long countByExample(CacmpGjBusinessMortgageCriteria example);

    int deleteByExample(CacmpGjBusinessMortgageCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjBusinessMortgage record);

    int insertSelective(CacmpGjBusinessMortgage record);

    List<CacmpGjBusinessMortgage> selectByExampleWithRowbounds(CacmpGjBusinessMortgageCriteria example, RowBounds rowBounds);

    List<CacmpGjBusinessMortgage> selectByExample(CacmpGjBusinessMortgageCriteria example);

    CacmpGjBusinessMortgage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjBusinessMortgage record, @Param("example") CacmpGjBusinessMortgageCriteria example);

    int updateByExample(@Param("record") CacmpGjBusinessMortgage record, @Param("example") CacmpGjBusinessMortgageCriteria example);

    int updateByPrimaryKeySelective(CacmpGjBusinessMortgage record);

    int updateByPrimaryKey(CacmpGjBusinessMortgage record);
}