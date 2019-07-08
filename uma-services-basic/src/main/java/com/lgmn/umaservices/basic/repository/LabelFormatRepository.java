package com.lgmn.umaservices.basic.repository;

import com.lgmn.umaservices.basic.dto.LabelFormatDto;
import com.lgmn.umaservices.basic.entity.LabelFormatEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelFormatRepository extends LgmnRepository<LabelFormatEntity, LabelFormatDto, Integer> {
}