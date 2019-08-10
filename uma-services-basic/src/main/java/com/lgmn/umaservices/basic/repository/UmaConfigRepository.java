package com.lgmn.umaservices.basic.repository;

import com.lgmn.umaservices.basic.dto.UmaConfigDto;
import com.lgmn.umaservices.basic.entity.UmaConfigEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmaConfigRepository extends LgmnRepository<UmaConfigEntity, UmaConfigDto, Integer> {
}