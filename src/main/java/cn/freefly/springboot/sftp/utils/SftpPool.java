package cn.freefly.springboot.sftp.utils;

import cn.freefly.springboot.exception.SystemException;
import com.jcraft.jsch.ChannelSftp;
import org.apache.commons.pool2.impl.GenericObjectPool;

public class SftpPool {
    private GenericObjectPool<ChannelSftp> pool;

    public SftpPool(SftpFactory factory) {
        this.pool = new GenericObjectPool<>(factory, factory.getProperties().getPool());
    }

    /**
     * 获取一个sftp连接对象
     * @return sftp连接对象
     */
    public ChannelSftp borrowObject() {
        try {
            return pool.borrowObject();
        } catch (Exception e) {
            throw new SystemException("获取ftp连接失败"+e.getMessage());
        }
    }

    /**
     * 归还一个sftp连接对象
     * @param channelSftp sftp连接对象
     */
    public void returnObject(ChannelSftp channelSftp) {
        if (channelSftp!=null) {
            pool.returnObject(channelSftp);
        }
    }
}
