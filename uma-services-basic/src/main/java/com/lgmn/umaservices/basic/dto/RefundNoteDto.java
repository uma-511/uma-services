package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class RefundNoteDto extends LgmnDto {

    // 
    @Condition
    private Integer id;

    // 客户id
    @Condition
    private Integer customerId;

    // 客户名称
    @Condition(except = ConditionExcept.CONTAIN, ignoreEmpty = true)
    private String customer;

    // 联系人
    @Condition(except = ConditionExcept.CONTAIN, ignoreEmpty = true)
    private String contact;

    // 地址
    @Condition
    private String address;

    // 联系电话
    @Condition(except = ConditionExcept.CONTAIN, ignoreEmpty = true)
    private String phone;

    // 送货单号
    @Condition(except = ConditionExcept.CONTAIN, ignoreEmpty = true)
    private String refundNum;

    // 司机
    @Condition
    private String driver;

    // 车牌号
    @Condition
    private String carNum;

    // 开单时间
    @Condition
    private Timestamp createTime;

    // 开单人
    @Condition(except = ConditionExcept.CONTAIN)
    private String createUser;

    // 备注
    @Condition
    private String remark;

    // 仓管
    @Condition
    private String store;

    // 收货人
    @Condition
    private String revicer;

    // 删除标识 0：未删除 1：已删除
    @Condition
    private Integer delFlag;

    // 是否已打印送货单 0：未打印 1：已打印
    @Condition
    private Integer printed;

    // 是否已汇款
    @Condition
    private Integer hadPaid;

    // 回款日期
    @Condition
    private Timestamp paymentTime;

    // 回款日期
    @Condition(except = ConditionExcept.LT_OR_EQUAL, isMin = true, field = "paymentTime")
    private Timestamp ltPaymentTime;

    // 回款确认人
    @Condition
    private String payConfirmer;

    @Condition(except = ConditionExcept.BETWEEN_AND, isMin = true, field = "createTime")
    private Timestamp startCreateTime;

    @Condition(except = ConditionExcept.BETWEEN_AND, isMax = true, field = "createTime")
    private Timestamp endCreateTime;

}