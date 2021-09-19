package cn.freefly.exception.controller;

import cn.freefly.exception.MyException;
import cn.freefly.exception.dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class MyRestController {
    @PostMapping("/insert")
    public boolean insert(@RequestBody User user) {
        System.out.println("开始新增...");
        //如果姓名为空就手动抛出一个自定义的异常！
        if(user.getName()==null){
            throw  new MyException("-1","用户姓名不能为空！");
        }
        return true;
    }

    @PostMapping("/update")
    public boolean update(@RequestBody User user) {
        System.out.println("开始更新...");
        //这里故意造成一个空指针的异常，并且不进行处理
        String str=null;
        str.equals("111");
        return true;
    }

    @PostMapping("/del")
    public boolean delete(@RequestBody User user) {
        System.out.println("开始删除...");
        //这里故意造成一个异常，并且不进行处理
        Integer.parseInt("abc123");
        return true;
    }

    @PostMapping("/getUser")
    public List<User> findByUser(User user) {
        System.out.println("开始查询...");
        List<User> userList =new ArrayList<>();
        User user2=new User();
        user2.setId(1);
        user2.setName("孙悟空");
        user2.setBirthday("2021-01-01");
        user2.setSex(1);
        userList.add(user2);
        return userList;
    }

}
