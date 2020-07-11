package cn.freefly.springboot.controller;

import cn.freefly.springboot.hibernateValidator.custom.entity.CheckCase;
import cn.freefly.springboot.hibernateValidator.custom.entity.CustomMethodUser;
import cn.freefly.springboot.hibernateValidator.custom.entity.CustomUser;
import cn.freefly.springboot.hibernateValidator.groupValidator.entity.GroupPerson;
import cn.freefly.springboot.hibernateValidator.groupValidator.interfaces.GroupOrder;
import cn.freefly.springboot.hibernateValidator.hibernate.entity.Person;
import cn.freefly.springboot.hibernateValidator.simple.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import java.util.Set;

/**
 * @ClassNmae ValidatorController
 * @Author xiao.yunfei
 * @Date 2020/5/14 14:30
 * @Desc
 */
@RestController
public class ValidatorController {
    @Autowired
    public Validator validator;
    /**
     * @Author xiao.yunfei
     * @Description 简单校验
     * @Date 2020/5/14 18:48
     * @Param [demo, result]
     * @Return void
     */
    @RequestMapping("/simpleDemo")
    public void simpleDemo(@RequestBody @Valid DemoModel demo, BindingResult result){
        if(result.hasErrors()){
            result.getAllErrors().stream().forEach(item->{
                System.out.println("输出："+item.getDefaultMessage());
            });
        }
    }
    /**
     * @Author xiao.yunfei
     * @Description 对象级联校验
     * @Date 2020/5/14 19:41
     * @Param [person]
     * @Return void
     */
    @RequestMapping("/objectConcatenationVerification")
    public void objectConcatenationVerification(@RequestBody Person person){
        Set<ConstraintViolation<Person>> set = validator.validate(person);
        set.stream().forEach(item->{
            System.out.println("对象级联校验："+item.getMessage());
        });
    }
    /**
     * @Author xiao.yunfei
     * @Description 分组验证
     * @Date 2020/5/14 19:51
     * @Param []
     * @Return void
     */
    @PostMapping("/groupValidator")
    public void groupValidator(@RequestBody GroupPerson person){
        Set<ConstraintViolation<GroupPerson>> validate = validator.validate(person, GroupOrder.class);
        validate.stream().forEach(item->{
            System.out.println("分组校验："+item.getMessage());
        });
    }
    /**
     * @Author xiao.yunfei
     * @Description 自定义校验-枚举校验
     * @Date 2020/5/15 9:34
     * @Param [person]
     * @Return void
     */
    @PostMapping("/customValidator")
    public void CustomValidator(@RequestBody CheckCase customUser){
        Set<ConstraintViolation<CheckCase>> validateSet = validator.validate(customUser);
        validateSet.stream().forEach(item->{
            System.out.println("自定义校验："+item.getMessage());
        });
    }

    /**
     * @Author xiao.yunfei
     * @Description 自定义校验-条件校验（若A存在，B不能为空）
     * @Date 2020/5/15 9:34
     * @Param [person]
     * @Return void
     */
    @PostMapping("/customValidator2")
    public void CustomValidator2(@RequestBody CustomUser customUser){
        Set<ConstraintViolation<CustomUser>> validateSet = validator.validate(customUser);
        validateSet.stream().forEach(item->{
            System.out.println("自定义校验2："+item.getMessage());
        });
    }
    /**
     * @Author xiao.yunfei
     * @Description 自定义校验-条件校验 (若A存在，B不能为空  方法注解)
     * @Date 2020/5/18 11:43
     * @Param [customUser]
     * @Return void
     */
    @PostMapping("/customValidator3")
    public void CustomValidator3(@RequestBody CustomMethodUser customMethodUser){
        Set<ConstraintViolation<CustomMethodUser>> validateSet = validator.validate(customMethodUser);
        validateSet.stream().forEach(item->{
            System.out.println("自定义校验方法注解："+item.getMessage());
        });
    }
}
