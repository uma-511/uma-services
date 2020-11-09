package com.lgmn.umaservices.basic.service;

import com.lgmn.umaservices.basic.dto.LabelRecordDto;
import com.lgmn.umaservices.basic.entity.LabelRecordEntity;
import com.lgmn.common.service.LgmnService;

public interface LabelRecordService extends LgmnService<LabelRecordEntity, LabelRecordDto, Integer> {
    Integer countByLabelNum(String labelNum);
}