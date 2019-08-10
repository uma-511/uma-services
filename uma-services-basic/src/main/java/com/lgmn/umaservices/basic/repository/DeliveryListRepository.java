package com.lgmn.umaservices.basic.repository;

import com.lgmn.umaservices.basic.dto.DeliveryListDto;
import com.lgmn.umaservices.basic.entity.DeliveryListEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryListRepository extends LgmnRepository<DeliveryListEntity, DeliveryListDto, Integer> {
}