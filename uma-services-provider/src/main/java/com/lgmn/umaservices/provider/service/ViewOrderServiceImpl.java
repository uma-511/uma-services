package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.umaservices.basic.dto.ViewOrderDto;
import com.lgmn.umaservices.basic.dto.ViewOrderInfoDto;
import com.lgmn.umaservices.basic.entity.ViewOrderEntity;
import com.lgmn.umaservices.basic.entity.ViewOrderInfoEntity;
import com.lgmn.umaservices.basic.repository.ViewOrderInfoRepository;
import com.lgmn.umaservices.basic.repository.ViewOrderRepository;
import com.lgmn.umaservices.basic.service.ViewOrderInfoService;
import com.lgmn.umaservices.basic.service.ViewOrderService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ViewOrderServiceImpl extends LgmnAbstractService<ViewOrderEntity, ViewOrderDto, Integer, ViewOrderRepository> implements ViewOrderService {

    @Autowired
    private ViewOrderRepository viewOrderRepository;

    public ViewOrderServiceImpl(ViewOrderRepository repository) {
        super(repository);
    }
}