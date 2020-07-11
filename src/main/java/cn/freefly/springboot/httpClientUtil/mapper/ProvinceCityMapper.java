package cn.freefly.springboot.httpClientUtil.mapper;

import cn.freefly.springboot.httpClientUtil.config.ProvinceCityConfig;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceCityMapper extends BaseMapper<ProvinceCityConfig> {

  List<ProvinceCityConfig> findByProvinceCityCountry(@Param("proCode") String proCode, @Param("countryCode") String countryCode);

  ProvinceCityConfig findByProvinceCityCounty(@Param("provinceCode") String provinceCode, @Param("cityCode") String cityCode, @Param("countyCode") String countyCode);

}
