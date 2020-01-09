package cn.freefly.springboot.mybatis.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2020/01/02
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TDataZnjcHuanKuan implements Serializable {
    private Integer projectId;

    private String paylistCode;

    private String beginningReceiveData;

    private String realityTime;

    private Integer beginningNum;

    private Double yhBenjin;

    private Double yhLixi;

    private Double penaltyPaid;

    private Double ysBenjin;

    private Double ysLixi;

    private Double penaltyRece;

    private static final long serialVersionUID = 1L;
}