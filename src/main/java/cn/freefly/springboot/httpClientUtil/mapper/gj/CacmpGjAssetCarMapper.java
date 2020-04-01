package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCar;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjAssetCarMapper {
    long countByExample(CacmpGjAssetCarCriteria example);

    int deleteByExample(CacmpGjAssetCarCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjAssetCar record);

    int insertSelective(CacmpGjAssetCar record);

    List<CacmpGjAssetCar> selectByExampleWithRowbounds(CacmpGjAssetCarCriteria example, RowBounds rowBounds);

    List<CacmpGjAssetCar> selectByExample(CacmpGjAssetCarCriteria example);

    CacmpGjAssetCar selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjAssetCar record, @Param("example") CacmpGjAssetCarCriteria example);

    int updateByExample(@Param("record") CacmpGjAssetCar record, @Param("example") CacmpGjAssetCarCriteria example);

    int updateByPrimaryKeySelective(CacmpGjAssetCar record);

    int updateByPrimaryKey(CacmpGjAssetCar record);
}