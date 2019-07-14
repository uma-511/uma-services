package com.lgmn.umaservices.basic.dto;

import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

@Data
public class OrderDto extends LgmnDto {
    	@Condition
    private Integer id;
    @Condition(except = ConditionExcept.CONTAIN)
    private String orderNo;
        //产品id
    	@Condition
    private Integer prodId;
        //型号id
    	@Condition
    private Integer modelId;
        //客户id
    	@Condition
    private Integer clientId;
        //工艺要求
    	@Condition
    private String requirement;
        //备注
    	@Condition
    private String remark;
        //标签id
    	@Condition
    private Integer lableId;
        //订单创建时间
    	@Condition
    private Date createTime;
        //订单创建人
    	@Condition
    private String createUser;
        //交货时间
    	@Condition
    private Date deliveryDate;
        //数量
    	@Condition
    private Integer quantity;
        //保留int1
    	@Condition
    private Integer int01;
        //保留int2
    	@Condition
    private Integer int02;
        //保留int3
    	@Condition
    private Integer int03;
        //保留int4
    	@Condition
    private Integer int04;
        //保留int5
    	@Condition
    private Integer int5;
        //保留varchar(50)1
    	@Condition
    private String var501;
        //保留varchar(50)2
    	@Condition
    private String var502;
        //保留varchar(50)3
    	@Condition
    private String var503;
        //保留varchar(50)4
    	@Condition
    private String var504;
        //保留varchar(50)5
    	@Condition
    private String var505;
        //保留varchar(100)1
    	@Condition
    private String var1001;
        //保留varchar(100)2
    	@Condition
    private String var1002;
        //保留varchar(100)3
    	@Condition
    private String var1003;
        //保留varchar(100)4
    	@Condition
    private String var1004;
        //保留varchar(100)5
    	@Condition
    private String var1005;
        //保留varchar(200)1
    	@Condition
    private String var2001;
        //保留varchar(200)2
    	@Condition
    private String var2002;
        //保留varchar(200)3
    	@Condition
    private String var2003;
        //保留varchar(200)4
    	@Condition
    private String var2004;
        //保留varchar(200)5
    	@Condition
    private String var2005;
        //保留datetime1
    	@Condition
    private Date datetime1;
        //保留datetime2
    	@Condition
    private Date datetime2;
        //保留decimal(10,2)1
    	@Condition
    private Double decimal1021;
        //保留decimal(10,2)2
    	@Condition
    private Double decimal1022;
        //保留decimal(10,2)3
    	@Condition
    private Double decimal1023;
        //保留decimal(10,2)4
    	@Condition
    private Double decimal1024;
        //保留decimal(11,3)1
    	@Condition
    private Double decimal1131;
        //保留decimal(11,3)2
    	@Condition
    private Double decimal1132;
        //保留decimal(11,3)3
    	@Condition
    private Double decimal1133;
        //保留decimal(11,3)4
    	@Condition
    private Double decimal1134;
    @Condition
    private Integer delFlag;

}