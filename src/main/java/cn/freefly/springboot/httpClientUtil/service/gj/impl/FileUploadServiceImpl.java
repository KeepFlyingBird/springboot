package cn.freefly.springboot.httpClientUtil.service.gj.impl;

import cn.freefly.springboot.devUtils.DateUtil;
import cn.freefly.springboot.devUtils.UUIDUtil;
import cn.freefly.springboot.fastDFS.util.FastDFSClientUtil;
import cn.freefly.springboot.httpClientUtil.config.gj.GjChannelConfig;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.UploadFieldEnum;
import cn.freefly.springboot.httpClientUtil.dto.gj.fileUpload.ChanneFileUpload;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjFileUpload;
import cn.freefly.springboot.httpClientUtil.mapper.PathConfigMapper;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjUpload;
import cn.freefly.springboot.httpClientUtil.service.PathConfigService;
import cn.freefly.springboot.httpClientUtil.service.gj.FileUploadService;
import cn.freefly.springboot.httpClientUtil.util.GjFile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class FileUploadServiceImpl implements FileUploadService {
    @Autowired
    private CacmpGjUpload cacmpGjUpload;

    @Autowired
    private GjFile gjFile;

    @Autowired
    private PathConfigMapper pathConfigMapper;

    @Autowired
    private PathConfigService pathConfigService;

    @Autowired
    private FastDFSClientUtil fastdfsCilentUtil;

    @Override
    public List<HashMap> selectuploadURL(String fileStage) {
        List<HashMap> inmgeURL = cacmpGjUpload.selectuploadURL(fileStage);
        return inmgeURL;
    }

    @Override
    public String fileUpload(ChanneFileUpload channeFileUpload) {
        GjChannelConfig config = pathConfigService.findFundSftpPathConfig
        (channeFileUpload.getHeader().getApplicationName());
        Map<String, Object> map = gjFile.getLocalFilePath(channeFileUpload, config);
        String path = map.get("path").toString();
        String downloadFile = map.get("downloadFile").toString();
        GjFile.download(path, downloadFile, map.get("filePath").toString(), GjFile.getConnectIP(config));
        gjFile.unZip(map.get("filePath").toString(), path);
        File folder = new File(path);
        File[] files = folder.listFiles();
        for (File file : files) {

            File newFile = new File(file.getAbsolutePath());
            CacmpGjFileUpload gjFileUpload = new CacmpGjFileUpload();
            log.info("上传文件全路径" + newFile);
            String paths = fastdfsCilentUtil.uploadFile(newFile);
            gjFileUpload.setFileStageName(UploadFieldEnum.getName(channeFileUpload.getStage()));
            gjFileUpload.setFastdfsURL(newFile.getName());
            gjFileUpload.setUploadTime(DateUtil.getCurTimeSlashYmdHms());
            gjFileUpload.setId(UUIDUtil.uuidLower());
            gjFileUpload.setFileStage(channeFileUpload.getStage().toString());
            gjFileUpload.setOrderId(channeFileUpload.getOrderId());
            gjFileUpload.setFastdfsURL(paths);
            cacmpGjUpload.insert(gjFileUpload);


        }
        return "上传成功";


    }


}


