package cn.freefly.springboot.controller;

import cn.freefly.springboot.exception.SystemException;
import cn.freefly.springboot.httpClientUtil.dto.BaseResponse;
import cn.freefly.springboot.sftp.utils.SftpHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;

@Api(description = "文件服务器", tags = {"sftp"})
@RestController
public class SftpController {
    @Autowired
    private SftpHelper sftpHelper;

    @ApiOperation(value = "测试上传",
            httpMethod = "POST",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            response = BaseResponse.class)
    @PostMapping("/sftp/upload")
    public void testSftpUpload(){
        String remoteDir = "/tmp/jianyuan/jianyuan/CACMP/5de0f9957c4f421b4e02cb3e/RB_SUPP_INSURE";
        String remoteName = "5de0f9957c4f421b4e02cb3e.tar.gz";
        String destDir = "C:\\Users\\Administrator\\Desktop\\newFile\\";
        String destName = "test.tar.gz";
        try {
            FileInputStream fileInputStream = FileUtils.openInputStream(FileUtils.getFile(destDir + destName));
            sftpHelper.upload(remoteDir,remoteName,fileInputStream);
        } catch (IOException e) {
            new SystemException("测试sftp文件上传异常："+e.getMessage());
        }
    }
    @ApiOperation(value = "测试下载",
            httpMethod = "POST",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            response = BaseResponse.class)
    @PostMapping("/sftp/download")
    public void testSftpDownload(){
        String remoteDir = "/tmp/jianyuan/jianyuan/CACMP/5de0f9957c4f421b4e02cb3e/RB_SUPP_INSURE";
        String remoteName = "5de0f9957c4f421b4e02cb3e.tar.gz";
        String destDir = "C:\\Users\\Administrator\\Desktop\\newFile\\";
        String destName = "test.tar.gz";
        sftpHelper.download(remoteDir, remoteName, destDir, destName);
    }
}
