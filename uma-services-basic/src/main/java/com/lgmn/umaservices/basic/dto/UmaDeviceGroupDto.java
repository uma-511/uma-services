package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class UmaDeviceGroupDto extends LgmnDto {
    	@Condition
    private Integer id;
        //设备分组名称
    	@Condition
    private String name;
        //使用状态：0：停用 1：正常
    	@Condition
    private Integer status;

}