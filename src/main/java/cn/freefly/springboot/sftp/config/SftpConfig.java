package cn.freefly.springboot.sftp.config;

import cn.freefly.springboot.sftp.utils.SftpFactory;
import cn.freefly.springboot.sftp.utils.SftpHelper;
import cn.freefly.springboot.sftp.utils.SftpPool;
import cn.freefly.springboot.sftp.utils.SftpProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SftpProperties.class)
public class SftpConfig {
    // 工厂
    @Bean
    public SftpFactory sftpFactory(SftpProperties properties) {
        return new SftpFactory(properties);
    }

    // 连接池
    @Bean
    public SftpPool sftpPool(SftpFactory sftpFactory) {
        return new SftpPool(sftpFactory);
    }

    // 辅助类
    @Bean
    public SftpHelper sftpHelper(SftpPool sftpPool) {
        return new SftpHelper(sftpPool);
    }
}
