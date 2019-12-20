package cn.freefly.springboot.swagger2.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "进件请求参数")
public class LoanParamBody {
    @ApiModelProperty(value = "名称")
    public String name;
    @ApiModelProperty(value = "年龄")
    public String age;
    @ApiModelProperty(value = "证件号")
    public String identityNo;
}
