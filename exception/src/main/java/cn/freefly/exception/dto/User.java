package cn.freefly.exception.dto;

import java.io.Serializable;

public class User implements Serializable{
    /** 编号 */
    private int id;
    /** 姓名 */
    private String name;
    /** 出生日期 */
    private String birthday;
    /** 性别 */
    private int sex;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
