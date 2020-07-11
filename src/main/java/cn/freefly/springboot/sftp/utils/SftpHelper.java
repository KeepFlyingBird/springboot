package cn.freefly.springboot.sftp.utils;

import cn.freefly.springboot.exception.SystemException;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.SftpException;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.io.InputStream;

public class SftpHelper {
    private SftpPool pool;

    public SftpHelper(SftpPool pool) {
        this.pool = pool;
    }

    /**
     * 下载文件
     * @param remoteDir 远程目录
     * @param remoteName 远程文件名
     * @param destDir 目标目录
     * @param destName 目标文件名
     */
    public void download(String remoteDir, String remoteName, String destDir, String destName) {
        ChannelSftp sftp = pool.borrowObject();
        try {
            sftp.cd(remoteDir);
            InputStream in = sftp.get(remoteName);
            FileUtils.copyInputStreamToFile(in,FileUtils.getFile(destDir+destName));
        } catch (SftpException | IOException e) {
            throw new SystemException("sftp下载文件出错"+ e.getMessage());
        } finally {
            pool.returnObject(sftp);
        }
    }

    /**
     * 上传文件
     * @param remoteDir 远程目录
     * @param remoteName 远程文件名
     * @param in 输入流
     */
    public void upload(String remoteDir, String remoteName, InputStream in) {
        ChannelSftp sftp = pool.borrowObject();
        try {
            this.mkdirs(sftp, remoteDir);
            sftp.cd(remoteDir);
            sftp.put(in, remoteName);
        } catch (SftpException e) {
            throw new SystemException("sftp上传文件出错"+ e.getMessage());
        } finally {
            pool.returnObject(sftp);
        }
    }

    /**
     * 删除文件
     * @param remoteDir 远程目录
     * @param remoteName 远程文件名
     */
    public void delete(String remoteDir, String remoteName) {
        ChannelSftp sftp = pool.borrowObject();
        try {
            sftp.cd(remoteDir);
            sftp.rm(remoteName);
        } catch (SftpException e) {
            throw new SystemException("sftp删除文件出错"+ e.getMessage());
        } finally {
            pool.returnObject(sftp);
        }
    }

    /**
     * 递归创建多级目录
     * @param remoteDir 多级目录
     */
    private void mkdirs(ChannelSftp sftp, String remoteDir) {
        String[] folders = remoteDir.split("/");
        try {
            sftp.cd("/");
            for (String folder: folders) {
                if (folder.length()>0) {
                    try {
                        sftp.cd(folder);
                    } catch (Exception e) {
                        sftp.mkdir(folder);
                        sftp.cd(folder);
                    }
                }
            }
        } catch (SftpException e) {
            throw new SystemException("sftp创建目录出错"+ e.getMessage());
        }
    }
}
