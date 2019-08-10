package com.lgmn.umaservices.basic.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LabelRecordDto extends LgmnDto {
    	@Condition
    private Integer id;
        //存货编码
    	@Condition
    private String labelNum;
        //包号
    	@Condition
    private Integer packId;
        //订单号
    	@Condition
    private Integer orderId;
        //产品id
    	@Condition
    private Integer prodId;
        //型号id
    	@Condition
    private Integer modelId;
        //存储状态 0:车间入库，1：车间出库，2：车间出仓 8：报废
    	@Condition
    private Integer status;
        //生产日期
    	@Condition
    private Timestamp prodTime;
        //入库日期
    	@Condition
    private Timestamp inTime;
        //出库日期
    	@Condition
    private Timestamp outTime;
        //作废日期
    	@Condition
    private Timestamp invalidTime;
        //标签类型：0：产品标签 1：打包标签
    	@Condition
    private Integer labelType;
        //净重
    	@Condition
    private BigDecimal netWeight;
        //毛重
    	@Condition
    private BigDecimal grossWeight;
        //皮重
    	@Condition
    private BigDecimal skinWeight;
        //生产人id
    	@Condition
    private String prodUser;
        //入库人id
    	@Condition
    private String inUser;
        //出库人id
    	@Condition
    private String outUser;
        //作废人id
    	@Condition
    private String invalidUser;
        //记录类型 0：生成 1：导入
    	@Condition
    private Byte recordType;
        //数量
    	@Condition
    private Integer quantity;
        //机台号
    	@Condition
    private String machineNum;
        //班次
    	@Condition
    private String banci;
    @Condition
    private String deliveryNum;
}