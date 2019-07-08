package com.lgmn.umaservices.basic.repository;

import java.util.Date;
import com.lgmn.umaservices.basic.dto.OrderDto;
import com.lgmn.umaservices.basic.entity.OrderEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends LgmnRepository<OrderEntity, OrderDto, Integer> {
}