package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarExtend;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarExtendCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository

public interface CacmpGjAssetCarExtendMapper {
    long countByExample(CacmpGjAssetCarExtendCriteria example);

    int deleteByExample(CacmpGjAssetCarExtendCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjAssetCarExtend record);

    int insertSelective(CacmpGjAssetCarExtend record);

    List<CacmpGjAssetCarExtend> selectByExampleWithRowbounds(CacmpGjAssetCarExtendCriteria example, RowBounds rowBounds);

    List<CacmpGjAssetCarExtend> selectByExample(CacmpGjAssetCarExtendCriteria example);

    CacmpGjAssetCarExtend selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjAssetCarExtend record, @Param("example") CacmpGjAssetCarExtendCriteria example);

    int updateByExample(@Param("record") CacmpGjAssetCarExtend record, @Param("example") CacmpGjAssetCarExtendCriteria example);

    int updateByPrimaryKeySelective(CacmpGjAssetCarExtend record);

    int updateByPrimaryKey(CacmpGjAssetCarExtend record);
}