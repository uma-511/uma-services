package com.lgmn.umaservices.basic.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class ViewOrderInfoDto extends LgmnDto {
    @Condition
    private Integer orderId;
    @Condition
    private Integer prodId;
    @Condition
    private Integer modelId;
    @Condition
    private String orderNo;
    @Condition
    private Integer clientId;
    @Condition
    private Integer labelId;
    @Condition
    private String requirement;
    @Condition
    private Timestamp deliveryDate;
    @Condition
    private Integer orderQuantity;
    @Condition
    private Integer floor;
    @Condition
    private Integer perPackQuantity;
    @Condition
    private String productName;
    @Condition
    private String modelName;
    @Condition
    private BigDecimal longs;
    @Condition
    private BigDecimal weight;
    @Condition
    private BigDecimal width;
    @Condition
    private String materialQuality;
    @Condition
    private String lines;
    @Condition
    private String specs;
    @Condition
    private String yard;
    @Condition
    private String color;
    @Condition
    private String cumulativeWeight;
    @Condition
    private String cumulativeQuantity;
    @Condition
    private Integer labelCount;
    @Condition
    private String labelNum;
    @Condition
    private Integer packNum;
}