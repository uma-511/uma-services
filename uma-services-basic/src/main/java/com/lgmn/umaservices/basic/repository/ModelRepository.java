package com.lgmn.umaservices.basic.repository;

import com.lgmn.umaservices.basic.dto.ModelDto;
import com.lgmn.umaservices.basic.entity.ModelEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends LgmnRepository<ModelEntity, ModelDto, Integer> {
}