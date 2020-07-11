package cn.freefly.springboot;

import cn.freefly.springboot.devUtils.ObjCopyUtil.DozerUtil;
import cn.freefly.springboot.devUtils.ObjCopyUtil.ManPerson;
import cn.freefly.springboot.devUtils.ObjCopyUtil.Person;
import com.alibaba.fastjson.JSON;
import com.github.dozermapper.core.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassNmae DozerTest
 * @Author xiao.yunfei
 * @Date 2020/4/10 9:08
 * @Desc
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DozerTest {
    @Autowired
    public Mapper dozerMapper;

    @Test
    public void testDozer(){
        Person person = new Person();
        person.setName("张三");
//        person.setTelPhone("11111111111");

        ManPerson manPerson = new ManPerson();
        manPerson.setSex("man");
        manPerson.setPhone("11111111111");
        System.out.println(JSON.toJSONString(manPerson));
//        dozerMapper.map(person,manPerson);
        DozerUtil.copyPropertiesWithNull(person,manPerson);
        System.out.println(JSON.toJSONString(manPerson));
    }
}
