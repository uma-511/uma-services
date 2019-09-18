package com.lgmn.umaservices.basic.dto;

import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

@Data
public class CustomerDto extends LgmnDto {
    	@Condition
    private Integer id;
    //客户名称
    @Condition(except = ConditionExcept.CONTAIN)
    private String name;
    //联系电话
    @Condition(except = ConditionExcept.CONTAIN)
    private String phone;
    //传真
    @Condition(except = ConditionExcept.CONTAIN)
    private String fax;
    //地址
    @Condition
    private String address;
    //备注
    @Condition
    private String remark;
    //创建用户id
    @Condition
    private String createUserId;
    //创建用户（保存用户名）
    @Condition
    private String createUser;
    //创建时间
    @Condition
    private Date createTime;
    //删除标识
    @Condition
    private Integer delFlag;
    // 客户代码
    @Condition
    private String customerCode;

    @Condition
    private String contacts;

    @Condition
    private String logistics;

    @Condition
    private String logisticsPhone;

    @Condition
    private String logisticsAddress;
    @Condition
    private Integer orderReminder;
    @Condition
    private Integer hadReminded;

}