package cn.freefly.springboot.httpClientUtil.mapper.gj;


import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjFileUpload;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface CacmpGjUpload {
    List<HashMap> selectuploadURL(@Param("fileStage") String fileStage);

    int insert(CacmpGjFileUpload cacmpGjFileUpload);

    List<CacmpGjFileUpload> queryImageUrlsByOrderId(Map<String, Object> map);
}
