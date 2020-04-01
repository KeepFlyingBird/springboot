package cn.freefly.springboot.devUtils.ObjectCopyUtil;

import com.github.dozermapper.core.DozerBeanMapper;
import com.github.dozermapper.core.Mapper;
import com.google.common.collect.Lists;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @ClassNmae BeanMapperUtil
 * @Author xiao.yunfei
 * @Date 2020/3/29 23:43
 * @Desc
 */
public class BeanMapperUtil {
    @Autowired
    private static DozerBeanMapper dozer;

    /**
     * @Author xiao.yunfei
     * @Description 对象-》对象
     * @Date 2020/3/30 0:09
     * @Param
     * @Return
     */
    public static void copy(Object source, Object destinationObject) {
        if(Objects.nonNull(source)){
            dozer.map(source, destinationObject);
        }
    }
    /**
     * @Author xiao.yunfei
     * @Description 对象-》Class 类
     * @Date 2020/3/30 0:10
     * @Param [source, destinationClass]
     * @Return T
     */
    public static <T> T map(Object source, Class<T> destinationClass) {
        if(Objects.isNull(source)){
            return null;
        }
        return dozer.map(source, destinationClass);
    }


    /**
     * @Author xiao.yunfei
     * @Description LIST->LIST
     * @Date 2020/3/30 0:11
     * @Param [sourceList, destinationClass]
     * @Return java.util.List<T>
     */
    public static <T> List<T> mapList(Collection<?> sourceList, Class<T> destinationClass) {
        if(sourceList == null || sourceList.isEmpty()){
            return null;
        }
        return sourceList.stream()
                .map(tem->dozer.map(tem,destinationClass))
                .collect(Collectors.toList());
    }

}
