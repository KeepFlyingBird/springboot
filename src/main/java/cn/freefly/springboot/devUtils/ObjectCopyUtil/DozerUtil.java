package cn.freefly.springboot.devUtils.ObjectCopyUtil;

import com.github.dozermapper.core.DozerBeanMapper;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.github.dozermapper.core.loader.api.BeanMappingBuilder;
import com.github.dozermapper.core.loader.api.TypeMappingOptions;
import com.google.common.collect.Lists;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.github.dozermapper.core.loader.api.TypeMappingOptions.mapNull;

/**
 * @ClassNmae DozerUtil
 * @Author xiao.yunfei
 * @Date 2020/3/29 23:43
 * @Desc
 */
public class DozerUtil {
    /**
     * @Author: xiao.yunfei
     * @Description: API 自定义 mapper 避免源对象空值属性覆盖目标对象值未匹配字段数据
     * @Date: 19:58 2020/4/9
     * @Param: [sources, destination]
     * @Return: void
     */
    public static <T, K> void copyPropertiesWithNull(final T sources, final K destination) {
        Mapper mapper = DozerBeanMapperBuilder.create().withMappingBuilder(new BeanMappingBuilder() {
            @Override
            protected void configure() {
                mapping(type(sources.getClass()), type(destination.getClass()), mapNull(false), TypeMappingOptions.mapEmptyString(false));
            }
        }).build();
        mapper.map(sources, destination);
    }
}
