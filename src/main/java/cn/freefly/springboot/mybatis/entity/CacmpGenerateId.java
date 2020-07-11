package cn.freefly.springboot.mybatis.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2020/03/12
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CacmpGenerateId implements Serializable {
    private Integer id;

    private static final long serialVersionUID = 1L;
}