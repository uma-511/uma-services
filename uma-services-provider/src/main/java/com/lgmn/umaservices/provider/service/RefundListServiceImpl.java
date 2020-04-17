package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.umaservices.basic.dto.RefundListDto;
import com.lgmn.umaservices.basic.entity.RefundListEntity;
import com.lgmn.umaservices.basic.repository.RefundListRepository;
import com.lgmn.umaservices.basic.service.RefundListService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class RefundListServiceImpl extends LgmnAbstractService<RefundListEntity, RefundListDto, Integer, RefundListRepository> implements RefundListService {

    @Autowired
    private RefundListRepository refundListRepository;

    public RefundListServiceImpl(RefundListRepository repository) {
        super(repository);
    }
}