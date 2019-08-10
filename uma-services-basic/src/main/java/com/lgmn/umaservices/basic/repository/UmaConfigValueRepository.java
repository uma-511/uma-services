package com.lgmn.umaservices.basic.repository;

import com.lgmn.umaservices.basic.dto.UmaConfigValueDto;
import com.lgmn.umaservices.basic.entity.UmaConfigValueEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmaConfigValueRepository extends LgmnRepository<UmaConfigValueEntity, UmaConfigValueDto, Integer> {
}