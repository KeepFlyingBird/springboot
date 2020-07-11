package cn.freefly.springboot.controller;

import cn.freefly.springboot.exception.SystemException;
import cn.freefly.springboot.fastDFS.util.FastDFSClientUtil;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.sftp.utils.SftpHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;

@Api(description = "远程文件服务器", tags = {"fastDFS"})
@RestController
@Slf4j
public class FastDFSController {
    @Autowired
    private FastDFSClientUtil fastDFSClientUtil;

    @ApiOperation(value = "测试上传",
            httpMethod = "POST",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            response = BaseResponse.class)
    @PostMapping("/fastDFS/upload")
    public void testSftpUpload(){
        String destDir = "C:\\Users\\Administrator\\Desktop\\newFile\\test\\";
        String destName = "RB_411521198812263993_cldyhty.png";
        String storeKey = fastDFSClientUtil.uploadFile(FileUtils.getFile(destDir + destName));
        log.info("fastDFS-storeKey："+storeKey);
        String previewUrl = fastDFSClientUtil.transferToPreviewUrl(storeKey);
        log.info("fastDFS-可视地址："+previewUrl);
    }
}
