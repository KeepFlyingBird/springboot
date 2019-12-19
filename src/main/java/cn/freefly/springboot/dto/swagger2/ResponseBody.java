package cn.freefly.springboot.dto.swagger2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBody {
    public String code;
    public String msg;
    public Object data;
}
