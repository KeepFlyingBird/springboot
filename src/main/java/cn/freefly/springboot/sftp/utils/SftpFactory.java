package cn.freefly.springboot.sftp.utils;

import cn.freefly.springboot.exception.SystemException;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.util.Properties;

@Data
@Slf4j
public class SftpFactory extends BasePooledObjectFactory<ChannelSftp> {
    private SftpProperties properties;

    public SftpFactory(SftpProperties properties) {
        this.properties = properties;
    }

    @Override
    public ChannelSftp create() {
        log.info("pool-maxTotal："+properties.getPool().getMaxTotal()+"，pool-minIdle："+properties.getPool().getMinIdle());
        try {
            JSch jsch = new JSch();
            Session sshSession = jsch.getSession(properties.getUsername(), properties.getHost(), properties.getPort());
            sshSession.setPassword(properties.getPassword());
            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            sshSession.setConfig(sshConfig);
            sshSession.connect();
            ChannelSftp channel = (ChannelSftp) sshSession.openChannel(properties.getType());
            channel.connect();
            return channel;
        } catch (JSchException e) {
            throw new SystemException("连接sfpt失败"+e.getMessage());
        }
    }

    @Override
    public PooledObject<ChannelSftp> wrap(ChannelSftp channelSftp) {
        return new DefaultPooledObject<>(channelSftp);
    }

    // 销毁对象
    @Override
    public void destroyObject(PooledObject<ChannelSftp> p) {
        ChannelSftp channelSftp = p.getObject();
        channelSftp.disconnect();
    }
}
