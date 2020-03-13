package cn.freefly.springboot.httpClientUtil.dto.pretrial.channel;

import cn.freefly.springboot.devUtils.FieldDesc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @ClassNmae ChannelPretrialApplyRequest
 * @Author xiao.yunfei
 * @Date 2020/3/5 23:02
 * @Desc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("预审申请")
public class ChannelPretrialApplyRequest {
    @ApiModelProperty("订单唯一标识")
    @NotBlank(message = "预审申请订单唯一标识不能为空")
    private String orderId;

    @ApiModelProperty("订单唯一标识")
    @NotBlank(message = "姓名 | Y")
    private String custName;

    @ApiModelProperty("订单唯一标识")
    @NotBlank(message = "证件类型 | Y")
    private String idType;

    @ApiModelProperty("订单唯一标识")
    @NotBlank(message = "证件号 | Y")
    private String idNo;

    @ApiModelProperty("订单唯一标识")
    @NotBlank(message = "手机号码 | Y")
    private String phoneNo;

    @ApiModelProperty("合作商业务类型")
    @NotBlank(message = "合作商业务类型不能为空")
    private String cooprBussType;
}
