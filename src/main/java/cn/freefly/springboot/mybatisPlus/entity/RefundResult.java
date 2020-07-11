package cn.freefly.springboot.mybatisPlus.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 还款结果表
 * </p>
 *
 * @author admin
 * @since 2020-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cacmp_refund_result")
@ApiModel(value="RefundResult对象", description="还款结果表")
public class RefundResult extends Model<RefundResult> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderId;

    @ApiModelProperty(value = "申请状态:1728-已结清")
    private String applyStatus;

    @ApiModelProperty(value = "结清类型 1.正常结清 2.回购  3.提前结清（非回购:收违约金）4.提前结清(回购:减免违约金)")
    private String settleType;

    @ApiModelProperty(value = "回购本金 SETTLE_TYPE=2或 SETTLE_TYPE=4时必填")
    private BigDecimal totaliPrin;

    @ApiModelProperty(value = "回购正常利息")
    private BigDecimal interest;

    @ApiModelProperty(value = "回购罚息合计 SETTLE_TYPE=2或 SETTLE_TYPE=4时必填")
    private BigDecimal totaliPenaltyInterest;

    @ApiModelProperty(value = "回购日期 SETTLE_TYPE=2或 SETTLE_TYPE=4时必填")
    private LocalDateTime overdueDate;

    @ApiModelProperty(value = "提前还款计划")
    private String schedules;

    @ApiModelProperty(value = "应还款日期")
    private LocalDateTime planDate;

    @ApiModelProperty(value = "月利率‰")
    private BigDecimal planInterestrate;

    @ApiModelProperty(value = "应还金额")
    private BigDecimal planAmt;

    @ApiModelProperty(value = "应还本金")
    private BigDecimal planPrin;

    @ApiModelProperty(value = "应还利息")
    private BigDecimal planInt;

    @ApiModelProperty(value = "还款计划标记 1:未归还 2:已归还 8:已归还部分")
    private String repaymentSign;

    @ApiModelProperty(value = "违约金")
    private BigDecimal penalty;

    @ApiModelProperty(value = "期数")
    private Integer pmtTerm;

    private LocalDateTime modifyTime;

    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
