package cn.freefly.springboot.httpClientUtil.mapper;


import cn.freefly.springboot.httpClientUtil.config.PathConfig;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PathConfigMapper extends BaseMapper<PathConfig> {

    PathConfig findValue(@Param("appkey") String appkey);

}
