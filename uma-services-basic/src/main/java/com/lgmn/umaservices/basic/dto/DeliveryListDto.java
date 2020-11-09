package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

@Data
public class DeliveryListDto extends LgmnDto {
    	@Condition
    private Integer id;
    	@Condition
    private Integer deliveryId;
    	@Condition
    private Integer clientId;
    	@Condition(except = ConditionExcept.CONTAIN,ignoreEmpty = true)
    private String clientName;
        //编号
    	@Condition(except = ConditionExcept.CONTAIN,ignoreEmpty = true)
    private String number;
        //名称
        @Condition(except = ConditionExcept.CONTAIN,ignoreEmpty = true)
    private String name;
        //规格
        @Condition(except = ConditionExcept.CONTAIN,ignoreEmpty = true)
    private String specs;
        //宽度
        @Condition(except = ConditionExcept.CONTAIN,ignoreEmpty = true)
    private String width;
        //颜色
        @Condition(except = ConditionExcept.CONTAIN,ignoreEmpty = true)
    private String color;
        //工艺要求
    	@Condition
    private String requirement;
        //扫描数量
    	@Condition
    private Integer scanQuantity;
        //剩余数量
    	@Condition
    private Integer residualQuantity;
    	@Condition
    private Double unitPrice;
    	@Condition
    private Double totalPrice;
    	@Condition
    private Integer printed;
    	@Condition
    private Integer customerId;
    	@Condition
    private Integer quantity;
}