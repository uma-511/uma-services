package com.lgmn.umaservices.basic.dto;

import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

@Data
public class CustomerContactDto extends LgmnDto {
    @Condition
    private Integer id;
    //客户id
    @Condition
    private Integer customerId;
    //联系人姓名
    @Condition(except = ConditionExcept.CONTAIN)
    private String name;
    //联系电话
    @Condition(except = ConditionExcept.CONTAIN)
    private String phone;
    //职位
    @Condition(except = ConditionExcept.CONTAIN)
    private String position;
    //备注
    @Condition
    private String remark;
    //创建人
    @Condition
    private String createUser;
    //创建时间
    @Condition
    private Date createTime;
    //删除标识
    @Condition
    private Integer delFlag;

}