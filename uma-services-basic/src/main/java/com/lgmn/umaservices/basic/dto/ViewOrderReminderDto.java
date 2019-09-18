package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ViewOrderReminderDto extends LgmnDto {

    // 
    @Condition
    private Integer id;

    // 客户名称
    @Condition
    private String name;

    // 联系电话
    @Condition
    private String phone;

    // 创建时间
    @Condition
    private Timestamp createTime;

}