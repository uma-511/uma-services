package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class DeliveryListDto extends LgmnDto {
    	@Condition
    private Integer id;
    	@Condition
    private Integer deliveryId;
    	@Condition
    private Integer clientId;
    	@Condition
    private String clientName;
        //编号
    	@Condition
    private String number;
        //名称
    	@Condition
    private String name;
        //规格
    	@Condition
    private String specs;
        //宽度
    	@Condition
    private String width;
        //颜色
    	@Condition
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