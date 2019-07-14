package com.lgmn.umaservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.umaservices.basic.dto.ViewLabelRecordDto;
import com.lgmn.umaservices.basic.entity.ViewLabelRecordEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewLabelRecordRepository extends LgmnRepository<ViewLabelRecordEntity, ViewLabelRecordDto, Integer> {
}