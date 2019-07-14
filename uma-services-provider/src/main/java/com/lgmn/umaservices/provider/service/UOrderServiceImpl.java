package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.OrderDto;
import com.lgmn.umaservices.basic.entity.UOrderEntity;
import com.lgmn.umaservices.basic.repository.UOrderRepository;
import com.lgmn.umaservices.basic.service.UOrderService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UOrderServiceImpl extends LgmnAbstractService<UOrderEntity, OrderDto, Integer, UOrderRepository> implements UOrderService {

    @Autowired
    private UOrderRepository orderRepository;

    public UOrderServiceImpl(UOrderRepository repository) {
        super(repository);
    }
}