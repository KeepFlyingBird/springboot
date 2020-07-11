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
public class CacmpGjFile implements Serializable {
    private String id;

    private String fileStage;

    private String fileName;

    private String fastdfsUrl;

    private Date uploadTime;

    private String fileStageType;

    private String orderId;

    private static final long serialVersionUID = 1L;
}