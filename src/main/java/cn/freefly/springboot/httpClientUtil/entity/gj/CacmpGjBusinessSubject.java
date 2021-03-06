package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2020/03/31
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CacmpGjBusinessSubject implements Serializable {
    private String id;

    private String orderId;

    private String subName;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}