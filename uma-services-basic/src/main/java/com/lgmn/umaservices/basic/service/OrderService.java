package com.lgmn.umaservices.basic.service;

import java.util.Date;
import com.lgmn.umaservices.basic.dto.OrderDto;
import com.lgmn.umaservices.basic.entity.OrderEntity;
import com.lgmn.common.service.LgmnService;

public interface OrderService extends LgmnService<OrderEntity, OrderDto, Integer> {
}