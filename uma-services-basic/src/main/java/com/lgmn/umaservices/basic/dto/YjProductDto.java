package com.lgmn.umaservices.basic.dto;

import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

@Data
public class YjProductDto extends LgmnDto {
    @Condition
    private Integer id;
    @Condition(except = ConditionExcept.CONTAIN,ignoreEmpty = true)
    private String num;
    @Condition(except = ConditionExcept.CONTAIN,ignoreEmpty = true)
    private String name;
    @Condition
    private String specs;
    @Condition
    private String width;
    @Condition
    private String str1;
    @Condition
    private String str2;
    @Condition
    private String str3;
    @Condition
    private String str4;
    @Condition
    private String str5;
    @Condition
    private String createUserId;
    @Condition
    private String createUserName;
    @Condition
    private Date createTime;
    //状态：0：停用 1：启用
    @Condition
    private Integer status;

}