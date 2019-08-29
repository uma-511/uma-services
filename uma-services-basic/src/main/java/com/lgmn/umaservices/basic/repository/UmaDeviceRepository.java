package com.lgmn.umaservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.umaservices.basic.dto.UmaDeviceDto;
import com.lgmn.umaservices.basic.entity.UmaDeviceEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UmaDeviceRepository extends LgmnRepository<UmaDeviceEntity, UmaDeviceDto, Integer> {
}