package com.lgmn.umaservices.provider.service;

import java.util.Date;
import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.OrderDto;
import com.lgmn.umaservices.basic.entity.OrderEntity;
import com.lgmn.umaservices.basic.repository.OrderRepository;
import com.lgmn.umaservices.basic.service.OrderService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class OrderServiceImpl extends LgmnAbstractService<OrderEntity, OrderDto, Integer, OrderRepository> implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository repository) {
        super(repository);
    }
}