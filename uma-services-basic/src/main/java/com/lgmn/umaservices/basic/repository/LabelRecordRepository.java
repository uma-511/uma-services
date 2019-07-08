package com.lgmn.umaservices.basic.repository;

import java.util.Date;
import com.lgmn.umaservices.basic.dto.LabelRecordDto;
import com.lgmn.umaservices.basic.entity.LabelRecordEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelRecordRepository extends LgmnRepository<LabelRecordEntity, LabelRecordDto, Integer> {
}