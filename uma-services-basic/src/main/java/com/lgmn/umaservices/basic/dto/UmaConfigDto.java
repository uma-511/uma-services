package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class UmaConfigDto extends LgmnDto {
    @Condition
    private Integer id;
    //配置类别名称
    @Condition
    private String name;
    //状态 0：禁用 1：启用
    @Condition
    private Integer status;
    @Condition
    private String number;

}