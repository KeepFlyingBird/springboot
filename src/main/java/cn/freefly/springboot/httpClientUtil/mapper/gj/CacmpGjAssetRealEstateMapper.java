package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetRealEstate;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetRealEstateCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjAssetRealEstateMapper {
    long countByExample(CacmpGjAssetRealEstateCriteria example);

    int deleteByExample(CacmpGjAssetRealEstateCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjAssetRealEstate record);

    int insertSelective(CacmpGjAssetRealEstate record);

    List<CacmpGjAssetRealEstate> selectByExampleWithRowbounds(CacmpGjAssetRealEstateCriteria example, RowBounds rowBounds);

    List<CacmpGjAssetRealEstate> selectByExample(CacmpGjAssetRealEstateCriteria example);

    CacmpGjAssetRealEstate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjAssetRealEstate record, @Param("example") CacmpGjAssetRealEstateCriteria example);

    int updateByExample(@Param("record") CacmpGjAssetRealEstate record, @Param("example") CacmpGjAssetRealEstateCriteria example);

    int updateByPrimaryKeySelective(CacmpGjAssetRealEstate record);

    int updateByPrimaryKey(CacmpGjAssetRealEstate record);
}