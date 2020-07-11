package cn.freefly.springboot.httpClientUtil.mapper.gj;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjFile;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjFileCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Repository
public interface CacmpGjFileMapper {
    long countByExample(CacmpGjFileCriteria example);

    int deleteByExample(CacmpGjFileCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(CacmpGjFile record);

    int insertSelective(CacmpGjFile record);

    List<CacmpGjFile> selectByExampleWithRowbounds(CacmpGjFileCriteria example, RowBounds rowBounds);

    List<CacmpGjFile> selectByExample(CacmpGjFileCriteria example);

    CacmpGjFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CacmpGjFile record, @Param("example") CacmpGjFileCriteria example);

    int updateByExample(@Param("record") CacmpGjFile record, @Param("example") CacmpGjFileCriteria example);

    int updateByPrimaryKeySelective(CacmpGjFile record);

    int updateByPrimaryKey(CacmpGjFile record);
}