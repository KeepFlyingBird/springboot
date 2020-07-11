package cn.freefly.springboot.httpClientUtil.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
@Data
@TableName(value = "cacmp_config")
public class PathConfig implements Serializable {
    //主键
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    //渠道编号（渠道/资金方/资产方）
    @TableField(value = "appkey")
    private String appkey;
    //名称
    @TableField(value = "name")
    private String name;
    //路径数据（json类型）
    @TableField(value = "value")
    private String value;
    //是否启用（启用-1/禁用-0，默认启用）
    @TableField(value = "enabled")
    private String enabled;
    //创建时间
    @TableField(value = "create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    //修改时间
    @TableField(value = "modify_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;
    //描述
    @TableField(value = "description")
    private String description;
}
