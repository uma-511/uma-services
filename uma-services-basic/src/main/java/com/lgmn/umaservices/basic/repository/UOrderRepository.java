package com.lgmn.umaservices.basic.repository;

import com.lgmn.umaservices.basic.dto.OrderDto;
import com.lgmn.umaservices.basic.entity.UOrderEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UOrderRepository extends LgmnRepository<UOrderEntity, OrderDto, Integer> {
}