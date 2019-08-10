package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class ViewOrderDto extends LgmnDto {
    @Condition
    private Integer id;
    @Condition
    private String orderNo;
    @Condition
    private Integer prodId;
    @Condition
    private Integer modelId;
    @Condition
    private Integer clientId;
    @Condition
    private String requirement;
    private String remark;
    private Integer lableId;
    @Condition
    private Timestamp createTime;
    @Condition
    private String createUser;
    @Condition
    private Date deliveryDate;
    @Condition
    private Integer quantity;
    @Condition
    private Integer int01;
    @Condition
    private Integer int02;
    @Condition
    private Integer delFlag;
    private String createUserName;
    private String productName;
    private String modelName;
    private String labelFormatName;
    private String customerName;
}