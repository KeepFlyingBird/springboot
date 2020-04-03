package cn.freefly.springboot.httpClientUtil.entity.gj;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2020/04/03
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CacmpGjOrder implements Serializable {
    private String id;

    private String instNo;

    private String productCode;

    private String productSeriesCode;

    private String channelKey;

    private String channelName;

    private String statusCode;

    private String statusMessage;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}