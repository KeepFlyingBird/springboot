package cn.freefly.springboot.httpClientUtil.util;

import cn.freefly.springboot.httpClientUtil.config.gj.GjChannelConfig;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.FielStatedEnum;
import cn.freefly.springboot.httpClientUtil.dto.gj.enums.UploadFieldEnum;
import cn.freefly.springboot.httpClientUtil.dto.gj.fileUpload.ChanneFileUpload;
import com.jcraft.jsch.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @ClassNmae GjFileServiceImpl
 * @Description 上传
 * @Author shi zhihui
 * @Date 2020/2/28
 * @Version 1.0
 **/
@Component
@Slf4j
public class GjFile {
    static Session sshSession = null;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    Date date = new Date();
    String s = simpleDateFormat.format(date);

    /**
     * 获取ChannelSftp
     */
    public static ChannelSftp getConnectIP(GjChannelConfig fundSftpPathConfig) {
        //IP
        String host = fundSftpPathConfig.getFileServerConfig().getHost();
        //端口号
        String sOnlineSftpPort = fundSftpPathConfig.getFileServerConfig().getPort();
        //账号
        String username = fundSftpPathConfig.getFileServerConfig().getUserName();
        //密码
        String password = fundSftpPathConfig.getFileServerConfig().getPassword();
        int port = 0;
        if (!("".equals(sOnlineSftpPort)) && null != sOnlineSftpPort) {
            port = Integer.parseInt(sOnlineSftpPort);
        }
        ChannelSftp sftp = null;
        try {
            JSch jsch = new JSch();
            jsch.getSession(username, host, port);
            sshSession = jsch.getSession(username, host, port);
            sshSession.setPassword(password);
            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            sshSession.setConfig(sshConfig);
            sshSession.connect();
            Channel channel = sshSession.openChannel("sftp");
            channel.connect();
            sftp = (ChannelSftp) channel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sftp;
    }


    /**
     * 下载
     */
    public static void download(String directory, String downloadFile, String saveFile, ChannelSftp sftp) {

        try {
            sftp.cd(directory);
            File file = new File(saveFile);
            sftp.get(downloadFile, new FileOutputStream(file));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sftp.isConnected()) {
                sshSession.disconnect();
                sftp.disconnect();
            }

        }
    }

    /**
     * @Description 解压zip
     * @Author shi zhihui
     * @Date 2020/3/11
     */
    public static void unZip(String sourceFilename, String targetDir) {
        try {
            GjFile gjFile = new GjFile();
            gjFile.unZip(new File(sourceFilename), targetDir);

        } catch (IOException i) {
            System.out.println(i.getMessage() + "解压失败！");
        }
    }

    /**
     * 将sourceFile解压到targetDir
     *
     * @param sourceFile
     * @param targetDir
     * @throws RuntimeException
     */
    public void unZip(File sourceFile, String targetDir) throws IOException {
        long start = System.currentTimeMillis();
        try {


            if (!sourceFile.exists()) {
                throw new FileNotFoundException("cannot find the file = " + sourceFile.getPath());
            }
            ZipFile zipFile = null;
            List<String> list = new ArrayList<>();
            try {
                zipFile = new ZipFile(sourceFile, Charset.forName("GBK"));
                Enumeration<?> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry entry = (ZipEntry) entries.nextElement();
                    String sd = entry.getName().toString();
                    if (entry.isDirectory()) {
                        String dirPath = targetDir + "/" + entry.getName();
                        createDirIfNotExist(dirPath);
                    } else {
                        File targetFile = new File(targetDir + "/" + entry.getName());
                        createFileIfNotExist(targetFile);
                        InputStream is = null;
                        FileOutputStream fos = null;

                        try {
                            is = zipFile.getInputStream(entry);
                            fos = new FileOutputStream(targetFile);
                            int len;
                            byte[] buf = new byte[1024];
                            while ((len = is.read(buf)) != -1) {
                                fos.write(buf, 0, len);
                            }
                        } finally {
                            try {
                                fos.close();
                            } catch (Exception e) {
                                log.warn("close FileOutputStream exception", e);
                            }
                            try {
                                is.close();
                            } catch (Exception e) {
                                log.warn("close InputStream exception", e);
                            }
                        }

                    }

                }
                log.info("解压完成，耗时：" + (System.currentTimeMillis() - start) + " ms");
            } finally {
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e) {
                        log.warn("close zipFile exception", e);
                    }
                }
            }
        } catch (IOException i) {
            System.out.println(i.getMessage() + "解压失败！");
        }
    }

    public static void createDirIfNotExist(String path) {
        File file = new File(path);
        createDirIfNotExist(file);
    }

    public static void createDirIfNotExist(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void createFileIfNotExist(File file) {
        try {
            createParentDirIfNotExist(file);
            file.createNewFile();
        } catch (IOException i) {
            System.out.println(i.getMessage() + "解压失败！");
        }

    }


    static void createParentDirIfNotExist(File file) {
        createDirIfNotExist(file.getParentFile());
    }

    public Map<String, Object> getLocalFilePath(ChanneFileUpload channeFileUpload, GjChannelConfig config) {
        // 本地文件路径
        //StringBuffer sb = new StringBuffer(config.getFileServerConfig().getLocalDir());
        Map<String, Object> map = new HashMap<>();
        StringBuffer sb = new StringBuffer("");

        // 渠道KEY
        sb.append(channeFileUpload.getHeader().getApplicationName()).append("/");
        // 资金方
        sb.append(config.getFundCode()).append("/");
        // 订单ID
        sb.append(channeFileUpload.getOrderId()).append("/");
        // 阶段
        sb.append(FielStatedEnum.valueOf(UploadFieldEnum.getName(channeFileUpload.getStage())).getCode()).append("/");

        File f = new File(sb.toString());
        if (!f.exists()) {
            f.mkdirs();
        }
        map.put("path", sb.toString());
        map.put("downloadFile", channeFileUpload.getOrderId() + ".zip");
        sb.append(channeFileUpload.getOrderId()).append(".zip");
        map.put("filePath", sb.toString());

        return map;
    }
}



