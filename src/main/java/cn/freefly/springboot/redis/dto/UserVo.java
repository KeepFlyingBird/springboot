package cn.freefly.springboot.redis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @ClassNmae UserVo
 * @Author xiao.yunfei
 * @Date 2020/1/17 16:00
 * @Desc
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserVo {
    public  static final String Table = "t_user";

    private String name;
    private String address;
    private Integer age;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }


    @Override
    public String toString() {
        return "UserVo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
