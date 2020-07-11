package cn.freefly.springboot.httpClientUtil.service;

import cn.freefly.springboot.devUtils.JsonUtil;
import cn.freefly.springboot.httpClientUtil.config.ChannelConfig;
import cn.freefly.springboot.httpClientUtil.config.FundPathConfig;
import cn.freefly.springboot.httpClientUtil.config.FundServerConfig;
import cn.freefly.springboot.httpClientUtil.config.PathConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjChannelConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjFundPathConfig;
import cn.freefly.springboot.httpClientUtil.config.gj.GjFundServerConfig;
import cn.freefly.springboot.httpClientUtil.mapper.PathConfigMapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
@Slf4j
public class PathConfigService {

    @Autowired
    PathConfigMapper pathConfigMapper;


    public PathConfig findValue(String appKey) {
        return pathConfigMapper.findValue(appKey);
    }

    /**
     * 获取配置表信息
     *
     * @param appKey
     * @return
     */
    public PathConfig findPathConfig(String appKey) {
        PathConfig pathConfig = findValue(appKey);

        if (Objects.equals(pathConfig, null)) {
            return null;
        }

        return pathConfig;
    }

    /**
     * 获取资金方接口请求地址
     *
     * @param appKey
     * @return
     */
    public String findFundServiceUrl(String appKey) {
        ChannelConfig channelConfig = findChannelConfig(appKey);
        if (Objects.equals(channelConfig, null)) {
            return null;
        }
        String fundCode = channelConfig.getFundCode();
        FundPathConfig config = findFundPathConfig(fundCode);
        if (Objects.equals(config, null)) {
            return null;
        }
        FundServerConfig serverConfig = config.getServerConfig();
        if (Objects.equals(serverConfig, null))
            return null;
        return serverConfig.getHost();
    }

    /**
     * 获取配置表value字符串信息
     *
     * @param appKey
     * @return
     */
    public FundPathConfig findFundPathConfig(String appKey) {
        PathConfig value = findValue(appKey);
        if (!Objects.equals(value, null) && StringUtils.isNotEmpty(value.getValue())) {
            return JsonUtil.parseObject(value.getValue(), FundPathConfig.class);
        }
        return null;
    }

    /**
     * @return com.jianyuan.fund.web.dto.channel.jianyuan.config.ChannelConfig
     * @Author houjianhui
     * @Description 查询零售基础配置
     * @Date 11:56 2019/7/10
     * @Param [appKey]
     **/
    public ChannelConfig findChannelConfig(String appKey) {
        PathConfig pathConfig = findValue(appKey);
        if (Objects.equals(pathConfig, null)) {
            return null;
        }

        ChannelConfig config = new ChannelConfig();
        if (!Objects.equals(pathConfig.getValue(), null)) {
            Mapper mapper = DozerBeanMapperBuilder.buildDefault();
            mapper.map(JsonUtil.parseObject(pathConfig.getValue(), Map.class), config);
        }
        return config;
    }

    /**
     * @return com.jianyuan.fund.domain.GjChannelConfig
     * @Author houjianhui
     * @Description 查询国金零售基础配置
     * @Date 16:02 2020/2/28
     * @Param [appKey]
     **/
    public GjChannelConfig findGjChannelConfig(String appKey) {
        PathConfig pathConfig = findValue(appKey);
        if (Objects.equals(pathConfig, null)) {
            return null;
        }

        GjChannelConfig config = new GjChannelConfig();
        if (!Objects.equals(pathConfig.getValue(), null)) {
            Mapper mapper = DozerBeanMapperBuilder.buildDefault();
            mapper.map(JsonUtil.parseObject(pathConfig.getValue(), Map.class), config);
        }
        return config;
    }

    /**
     * @Author houjianhui
     * @Description 获取国金资金方参数配置
     * @Date 16:17 2020/2/28
     * @Param [appKey]
     * @return com.jianyuan.fund.domain.GjFundServerConfig
     **/
    public GjFundServerConfig findGjFundService(String appKey) {
        GjChannelConfig channelConfig = findGjChannelConfig(appKey);
        if (Objects.equals(channelConfig, null)) {
            return null;
        }
        String fundCode = channelConfig.getFundCode();
        GjFundPathConfig config = findGjFundPathConfig(fundCode);
        if (Objects.equals(config, null)) {
            return null;
        }
        GjFundServerConfig serverConfig = config.getServerConfig();
        if (Objects.equals(serverConfig, null))
            return null;
        return serverConfig;
    }

    /**
     * @Author houjianhui
     * @Description 获取配置表value字符串信息
     * @Date 16:14 2020/2/28
     * @Param [appKey]
     * @return com.jianyuan.fund.domain.GjFundPathConfig
     **/
    public GjFundPathConfig findGjFundPathConfig(String appKey) {
        PathConfig value = findValue(appKey);
        if (!Objects.equals(value, null) && StringUtils.isNotEmpty(value.getValue())) {
            return JsonUtil.parseObject(value.getValue(), GjFundPathConfig.class);
        }
        return null;
    }
    /**
     * 获取配置表value字符串信息
     *
     * @param appKey
     * @return
     */
    public GjChannelConfig findFundSftpPathConfig(String appKey) {
        PathConfig value = findValue(appKey);
        if (!Objects.equals(value, null) && StringUtils.isNotEmpty(value.getValue())) {
            return JsonUtil.parseObject(value.getValue(), GjChannelConfig.class);
        }
        return null;
    }
}
