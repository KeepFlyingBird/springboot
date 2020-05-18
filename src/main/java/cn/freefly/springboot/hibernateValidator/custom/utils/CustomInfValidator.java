package cn.freefly.springboot.hibernateValidator.custom.utils;

import cn.freefly.springboot.hibernateValidator.custom.entity.CustomUser;
import cn.freefly.springboot.hibernateValidator.custom.interfaces.CustomInf;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassNmae CustomInfValidator
 * @Author xiao.yunfei
 * @Date 2020/5/15 18:07
 * @Desc
 */
@Slf4j
public class CustomInfValidator implements ConstraintValidator<CustomInf,Object> {
    private String firstArgs;
    private String[] argsArray;
    @Override
    public void initialize(CustomInf customInf) {
        firstArgs = customInf.firstArgs();
        argsArray = customInf.argsArray();
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {
        log.info("----进入自定义----"+ JSON.toJSONString(obj));
        if(Objects.isNull(firstArgs) || firstArgs.length() == 0){
            return true;
        }else{
            Map map = JSON.parseObject(JSON.toJSONString(obj), Map.class);
            long count = Arrays.stream(argsArray).filter(item->Objects.isNull(map.get(item)) || String.valueOf(map.get(item)).length()==0).count();
            if(count > 0){
                return false;
            }
        }
        return true;
    }
}
