package com.lgmn.umaservices.provider.service;

import java.util.Date;
import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.YjOrderDto;
import com.lgmn.umaservices.basic.entity.YjOrderEntity;
import com.lgmn.umaservices.basic.repository.YjOrderRepository;
import com.lgmn.umaservices.basic.service.YjOrderService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class YjOrderServiceImpl extends LgmnAbstractService<YjOrderEntity, YjOrderDto, Integer, YjOrderRepository> implements YjOrderService {

    @Autowired
    private YjOrderRepository yjOrderRepository;

    public YjOrderServiceImpl(YjOrderRepository repository) {
        super(repository);
    }
}