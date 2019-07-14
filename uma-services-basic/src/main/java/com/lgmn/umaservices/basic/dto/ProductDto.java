package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

@Data
public class ProductDto extends LgmnDto {
    @Condition
    private Integer id;
    //产品名称
    @Condition(except = ConditionExcept.CONTAIN)
    private String name;
    @Condition
    private Integer delFlag;
}