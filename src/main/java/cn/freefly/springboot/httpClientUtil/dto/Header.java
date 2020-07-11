package cn.freefly.springboot.httpClientUtil.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * @Author xiao.yunfei
 * @Description
 * @Date 2020/3/31 13:46
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Header {
    @NotBlank(message = "applicationName不能为空")
    private String applicationName;

    @NotBlank(message = "uuid不能为空")
    private String uuid;

    @NotBlank(message = "version不能为空")
    private String version;
}
