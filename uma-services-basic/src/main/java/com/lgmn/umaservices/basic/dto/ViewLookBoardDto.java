package com.lgmn.umaservices.basic.dto;

import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class ViewLookBoardDto extends LgmnDto {
    	@Condition(ignoreZero = true)
    private Integer id;
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
        //计划数量
        @Condition(ignoreZero = true)
    private Integer plannedQuantity;
        //楼层(uma_config)
        @Condition(ignoreEmpty = true)
    private String floor;
    	@Condition(ignoreZero = true)
    private Integer finishedQuantity;
        //交货日期
    	@Condition(ignoreEmpty = true)
    private Date deliveryDate;

}