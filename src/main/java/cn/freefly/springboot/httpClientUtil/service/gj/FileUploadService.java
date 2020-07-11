package cn.freefly.springboot.httpClientUtil.service.gj;

import cn.freefly.springboot.httpClientUtil.dto.gj.fileUpload.ChanneFileUpload;

import java.util.HashMap;
import java.util.List;

/**
 * @Author shizhihui
 * @Description 文件上传
 * @Date 17:33 2020/3/3
 **/
public interface FileUploadService {
    /**
     * @Param 阶段信息
     * @Description  返回渠道URL
     * @Author shizhihui
     * */
    List<HashMap> selectuploadURL(String state);
    /**
     * @Param 阶段
     * @Description  上传文件
     * @Author shizhihui
     * */
     String fileUpload(ChanneFileUpload channeFileUpload);
/*
     String uploadFile(File file, CacmpGjFileUpload cacmpGjFileUpload);
*/
}
