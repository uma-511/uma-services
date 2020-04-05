package com.lgmn.umaservices.basic.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

@Data
public class ViewLabelRecordDto extends LgmnDto {
    @Condition
    private Integer id;
    @Condition(except = ConditionExcept.CONTAIN, ignoreEmpty = true)
    private String labelNum;
    @Condition
    private Integer packId;
    @Condition
    private Integer orderId;
    @Condition
    private Integer prodId;
    @Condition
    private Integer modelId;
    @Condition
    private Integer status;

    private List<String> dateRange;

//    public void setDateRange(List<String> dateRange){
//        this.dateRange=dateRange;
//            if(this.dateRange.size()>1){
//                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-NN-dd");
//
//                try {
//
//                    setBeforeProdTime(new Timestamp(sdf.parse(this.dateRange.get(0)).getTime()));
//                    setEndProdTime( new Timestamp(sdf.parse(this.dateRange.get(1)).getTime()));
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//        }
//    }

    @Condition(except = ConditionExcept.BETWEEN_AND ,field = "prodTime",isMin = true)
    private Timestamp beforeProdTime;
    @Condition(except = ConditionExcept.BETWEEN_AND ,field = "prodTime",isMax = true)
    private Timestamp endProdTime;
    @Condition
    private Timestamp inTime;
    @Condition
    private Timestamp outTime;
    @Condition
    private Timestamp invalidTime;
    @Condition
    private Integer labelType;
    @Condition
    private BigDecimal netWeight;
    @Condition
    private BigDecimal grossWeight;
    @Condition
    private BigDecimal skinWeight;
    @Condition
    private String prodUser;
    @Condition
    private String inUser;
    @Condition
    private String outUser;
    @Condition
    private String invalidUser;
    @Condition
    private Byte recordType;
    @Condition
    private Integer quantity;
    @Condition
    private String machineNum;
    @Condition
    private String banci;
    @Condition(except = ConditionExcept.CONTAIN, ignoreEmpty = true)
    private String orderNo;
    @Condition
     private Integer clientId;
    @Condition
    private String requirement;
    @Condition
    private Timestamp deliveryDate;
    @Condition
    private Integer orderQuantity;
    @Condition
    private Integer floor;
    @Condition
    private Integer perPackQuantity;
    @Condition
    private String productName;
    @Condition
    private String modelName;
    @Condition
    private BigDecimal longs;
    @Condition
    private BigDecimal weight;
    @Condition
    private BigDecimal width;
    @Condition
    private String materialQuality;
    @Condition
    private String lines;
    @Condition
    private String specs;
    @Condition
    private String yard;
    @Condition
    private String color;
    @Condition
    private String inAccount;
    @Condition
    private String outAccount;
    @Condition
    private String invalidAccount;
    @Condition
    private String prodAccount;
    @Condition
    private String customerName;

}