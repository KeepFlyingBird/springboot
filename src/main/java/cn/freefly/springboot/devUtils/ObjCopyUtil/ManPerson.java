package cn.freefly.springboot.devUtils.ObjCopyUtil;

import com.github.dozermapper.core.Mapping;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassNmae ManPerson
 * @Author xiao.yunfei
 * @Date 2020/4/10 9:03
 * @Desc
 */
@Data
@NoArgsConstructor
public class ManPerson {
    public String name;
    @Mapping("telPhone")
    public String phone;
    public String sex;
}
