package com.lgmn.umaservices.basic.dto;

import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class ViewLabelRecordDto extends LgmnDto {
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
        //存储状态
    	@Condition
    private Integer status;
        //生产日期
    	@Condition
    private Date prodTime;
        //入库日期
    	@Condition
    private Date inTime;
        //出库日期
    	@Condition
    private Date outTime;
        //作废日期
    	@Condition
    private Date invalidTime;
        //标签类型：0：产品标签 1：打包标签
    	@Condition
    private Integer labelType;
        //净重
    	@Condition
    private Double netWeight;
        //毛重
    	@Condition
    private Double grossWeight;
        //皮重
    	@Condition
    private Double skinWeight;
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
    private byte recordType;
        //数量
    	@Condition
    private Integer quantity;
    	@Condition
    private String orderNo;
        //客户id
    	@Condition
    private Integer clientId;
        //工艺要求
    	@Condition
    private String requirement;
        //交货时间
    	@Condition
    private Date deliveryDate;
        //数量
    	@Condition
    private Integer orderQuantity;
        //楼层
    	@Condition
    private Integer floor;
        //每包数量
    	@Condition
    private Integer perPackQuantity;
        //产品名称
    	@Condition
    private String productName;
        //产品名称
    	@Condition
    private String modelName;
        //米数
    	@Condition
    private Double longs;
        //斤数
    	@Condition
    private Double weight;
        //材质
    	@Condition
    private String materialQuality;
        //纹路
    	@Condition
    private String lines;
        //规格
    	@Condition
    private String specs;
        //码数
    	@Condition
    private String yard;
        //颜色
    	@Condition
    private String color;
        //登录账号
    	@Condition
    private String inAccount;
        //登录账号
    	@Condition
    private String outAccount;
        //登录账号
    	@Condition
    private String invalidAccount;
        //登录账号
    	@Condition
    private String prodAccount;

}