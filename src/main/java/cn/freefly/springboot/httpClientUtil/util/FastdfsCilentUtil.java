package cn.freefly.springboot.httpClientUtil.util;

import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjUpload;
import com.github.tobato.fastdfs.domain.conn.FdfsWebServer;
import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Service
@Slf4j
public class FastdfsCilentUtil {

    @Autowired
    private FastFileStorageClient fastFileStorageClient;
    @Autowired
    private FdfsWebServer fdfsWebServer;



    @Autowired
    private CacmpGjUpload cacmpGjUpload;

    /**
     *	MultipartFile类型的文件上传ַ
     * @param file
     * @return
     * @throws IOException
     */
    public String uploadFile(File file)  {
        try {
            FileInputStream inputStream = new FileInputStream(file);
            StorePath path = fastFileStorageClient.uploadFile(inputStream,
            file.length(),
            FilenameUtils.getExtension(file.getName()),
            null);
            return getResAccessUrl(path);
        }catch (Exception i){
            log.info(i.getMessage());
            return "上传失败！";
        }


    }

    /**
     * 返回文件上传成功后的地址
     * @param storePath
     * @return
     */
    private String getResAccessUrl(StorePath storePath) {
        String fileUrl = fdfsWebServer.getWebServerUrl()+ storePath.getFullPath();
        return fileUrl;
    }


}
