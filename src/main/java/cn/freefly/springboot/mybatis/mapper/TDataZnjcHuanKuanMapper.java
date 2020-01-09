package cn.freefly.springboot.mybatis.mapper;

import cn.freefly.springboot.mybatis.entity.TDataZnjcHuanKuan;
import cn.freefly.springboot.mybatis.entity.TDataZnjcHuanKuanCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/01/02
*/
@Repository
@Component
public interface TDataZnjcHuanKuanMapper {
    long countByExample(TDataZnjcHuanKuanCriteria example);

    int deleteByExample(TDataZnjcHuanKuanCriteria example);

    int insert(TDataZnjcHuanKuan record);

    int insertSelective(TDataZnjcHuanKuan record);

    List<TDataZnjcHuanKuan> selectByExampleWithRowbounds(TDataZnjcHuanKuanCriteria example, RowBounds rowBounds);

    List<TDataZnjcHuanKuan> selectByExample(TDataZnjcHuanKuanCriteria example);

    int updateByExampleSelective(@Param("record") TDataZnjcHuanKuan record, @Param("example") TDataZnjcHuanKuanCriteria example);

    int updateByExample(@Param("record") TDataZnjcHuanKuan record, @Param("example") TDataZnjcHuanKuanCriteria example);

    int insertTDataHuanKuanBatch(List<TDataZnjcHuanKuan> list);

    int insertObjListBatch(List<TDataZnjcHuanKuan> list);
    int insertObjStrListBatch(List<Object[]> list);
//    int insertTDataHuanKuanBatchOrcl(List<TDataZnjcHuanKuan> list);
}