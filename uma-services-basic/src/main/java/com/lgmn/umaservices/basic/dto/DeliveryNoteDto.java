package com.lgmn.umaservices.basic.dto;

import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

@Data
public class DeliveryNoteDto extends LgmnDto {
    @Condition
    private Integer id;
    //客户名称
    @Condition(except = ConditionExcept.CONTAIN)
    private String customer;
    //联系人
    @Condition(except = ConditionExcept.CONTAIN)
    private String contact;
    //地址
    @Condition(except = ConditionExcept.CONTAIN)
    private String address;
    //联系电话
    @Condition(except = ConditionExcept.CONTAIN)
    private String phone;
    //送货单号
    @Condition(except = ConditionExcept.CONTAIN)
    private String deliveryNum;
    //司机
    @Condition(except = ConditionExcept.CONTAIN)
    private String driver;
    //车牌号
    @Condition(except = ConditionExcept.CONTAIN)
    private String carNum;
    //开单时间
    @Condition
    private Date createTime;
    //开单人
    @Condition(except = ConditionExcept.CONTAIN)
    private String createUser;
    //备注
    @Condition
    private String remark;
    //仓管
    @Condition
    private String store;
    //收货人
    @Condition
    private String revicer;
    //删除标识
    @Condition
    private Integer delFlag;

}