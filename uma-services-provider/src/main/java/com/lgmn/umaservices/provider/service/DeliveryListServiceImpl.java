package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.DeliveryListDto;
import com.lgmn.umaservices.basic.entity.DeliveryListEntity;
import com.lgmn.umaservices.basic.repository.DeliveryListRepository;
import com.lgmn.umaservices.basic.service.DeliveryListService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DeliveryListServiceImpl extends LgmnAbstractService<DeliveryListEntity, DeliveryListDto, Integer, DeliveryListRepository> implements DeliveryListService {

    @Autowired
    private DeliveryListRepository deliveryListRepository;

    public DeliveryListServiceImpl(DeliveryListRepository repository) {
        super(repository);
    }
}