package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.util.Date;

public class CacmpGjFileUpload {

    private String id;
    private String fileStageName;
    private String fileName;
    private String fastdfsURL;
    private Date uploadTime;
    private String fileStage;
    private String orderId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileStageName() {
        return fileStageName;
    }

    public void setFileStageName(String fileStageName) {
        this.fileStageName = fileStageName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFastdfsURL() {
        return fastdfsURL;
    }

    public void setFastdfsURL(String fastdfsURL) {
        this.fastdfsURL = fastdfsURL;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getFileStage() {
        return fileStage;
    }

    public void setFileStage(String fileStage) {
        this.fileStage = fileStage;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
