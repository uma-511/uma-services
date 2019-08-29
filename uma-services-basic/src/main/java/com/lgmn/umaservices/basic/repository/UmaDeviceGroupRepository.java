package com.lgmn.umaservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.umaservices.basic.dto.UmaDeviceGroupDto;
import com.lgmn.umaservices.basic.entity.UmaDeviceGroupEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UmaDeviceGroupRepository extends LgmnRepository<UmaDeviceGroupEntity, UmaDeviceGroupDto, Integer> {
}