package com.lgmn.umaservices.basic.dto;

import java.sql.Timestamp;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

@Data
public class YjOrderDto extends LgmnDto {
    	@Condition
    private Integer id;
        //订单编号
    	@Condition(except = ConditionExcept.CONTAIN,ignoreEmpty = true)
    private String orderNum;
        //产品编号
    	@Condition(ignoreEmpty = true)
    private String number;
        //名称(uma_config)
    	@Condition(ignoreEmpty = true)
    private String name;
        //规格(uma_config)
    	@Condition(ignoreEmpty = true)
    private String specs;
        //宽度(uma_config)
    	@Condition(ignoreEmpty = true)
    private String width;
        //颜色(uma_config)
    	@Condition(ignoreEmpty = true)
    private String color;
        //标签格式
    	@Condition
    private Integer labelId;
        //便签格式名称
    	@Condition(ignoreEmpty = true)
    private String labelName;
        //工艺要求
    	@Condition
    private String requirement;
        //计划数量
    	@Condition
    private Integer plannedQuantity;
        //每包饼数
    	@Condition
    private Integer perPackQuantity;
        //备注
    	@Condition
    private String remark;
        //交货日期
    	@Condition
    private Timestamp deliveryDate;
        //客户id
    	@Condition
    private Integer clientId;
        //客户名
    	@Condition(ignoreEmpty = true)
    private String clientName;
        //楼层(uma_config)
    	@Condition(ignoreEmpty = true)
    private String floor;
        //创建人id
    	@Condition
    private String createUserId;
        //创建人名称
    	@Condition
    private String createUser;
        //创建时间
    	@Condition
    private Timestamp createTime;
    @Condition(except = ConditionExcept.BETWEEN_AND, isMin = true, field = "createTime")
    private Timestamp startCreateTime;
    @Condition(except = ConditionExcept.BETWEEN_AND, isMax = true, field = "createTime")
    private Timestamp endCreateTime;

        //删除标识： 0 未删除， 1 已删除
    	@Condition
    private Integer delFlag;

}