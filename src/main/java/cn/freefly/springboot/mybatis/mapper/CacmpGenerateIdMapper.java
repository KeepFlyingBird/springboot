package cn.freefly.springboot.mybatis.mapper;

import cn.freefly.springboot.mybatis.entity.CacmpGenerateId;
import cn.freefly.springboot.mybatis.entity.CacmpGenerateIdCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/12
*/
@Repository
public interface CacmpGenerateIdMapper {
    long countByExample(CacmpGenerateIdCriteria example);

    int deleteByExample(CacmpGenerateIdCriteria example);

    int insert(CacmpGenerateId record);

    int insertSelective(CacmpGenerateId record);

    List<CacmpGenerateId> selectByExampleWithRowbounds(CacmpGenerateIdCriteria example, RowBounds rowBounds);

    List<CacmpGenerateId> selectByExample(CacmpGenerateIdCriteria example);

    int updateByExampleSelective(@Param("record") CacmpGenerateId record, @Param("example") CacmpGenerateIdCriteria example);

    int updateByExample(@Param("record") CacmpGenerateId record, @Param("example") CacmpGenerateIdCriteria example);

    Integer getMaxId();

    void generateNextId();

    void truncateTable();
}