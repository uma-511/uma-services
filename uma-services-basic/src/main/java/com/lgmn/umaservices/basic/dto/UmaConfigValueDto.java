package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class UmaConfigValueDto extends LgmnDto {
    @Condition
    private Integer id;
    //配置类别id
    @Condition
    private Integer configId;
    //配置值
    @Condition
    private String value;
    //状态 0：禁用 1：启用
    @Condition
    private Integer status;

}