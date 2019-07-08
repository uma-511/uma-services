package com.lgmn.umaservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LabelFormatDto extends LgmnDto {
    	@Condition
    private Integer id;
    	@Condition
    private String name;

}