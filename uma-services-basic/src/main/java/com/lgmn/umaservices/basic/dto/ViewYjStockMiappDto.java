package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import com.lgmn.common.enums.ConditionLogic;
import lombok.Data;

@Data
public class ViewYjStockMiappDto  extends LgmnDto {
    @Condition
    private Integer id;
    //名称(uma_config)

    @Condition(ignoreEmpty = true, except = ConditionExcept.CONTAIN, logic = ConditionLogic.OR)
    private String number;

    @Condition(ignoreEmpty = true, except = ConditionExcept.CONTAIN, logic = ConditionLogic.OR)
    private String name;
    //规格(uma_config)

    @Condition(ignoreEmpty = true, except = ConditionExcept.CONTAIN, logic = ConditionLogic.OR)
    private String specs;
    //宽度(uma_config)

    @Condition(ignoreEmpty = true, except = ConditionExcept.CONTAIN, logic = ConditionLogic.OR)
    private String width;
    //颜色(uma_config)

    @Condition(ignoreEmpty = true, except = ConditionExcept.CONTAIN, logic = ConditionLogic.OR)
    private String color;

    @Condition
    private Double stock;

    @Condition
    private Double drk;
}