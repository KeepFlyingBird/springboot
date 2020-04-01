package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessBankPay;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessBankPayCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjBusinessBankPayMapper {
    long countByExample(CacmpGjBusinessBankPayCriteria example);

    int deleteByExample(CacmpGjBusinessBankPayCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjBusinessBankPay record);

    int insertSelective(CacmpGjBusinessBankPay record);

    List<CacmpGjBusinessBankPay> selectByExampleWithRowbounds(CacmpGjBusinessBankPayCriteria example, RowBounds rowBounds);

    List<CacmpGjBusinessBankPay> selectByExample(CacmpGjBusinessBankPayCriteria example);

    CacmpGjBusinessBankPay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjBusinessBankPay record, @Param("example") CacmpGjBusinessBankPayCriteria example);

    int updateByExample(@Param("record") CacmpGjBusinessBankPay record, @Param("example") CacmpGjBusinessBankPayCriteria example);

    int updateByPrimaryKeySelective(CacmpGjBusinessBankPay record);

    int updateByPrimaryKey(CacmpGjBusinessBankPay record);
}