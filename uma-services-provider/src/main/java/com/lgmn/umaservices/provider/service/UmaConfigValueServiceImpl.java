package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.UmaConfigValueDto;
import com.lgmn.umaservices.basic.entity.UmaConfigValueEntity;
import com.lgmn.umaservices.basic.repository.UmaConfigValueRepository;
import com.lgmn.umaservices.basic.service.UmaConfigValueService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UmaConfigValueServiceImpl extends LgmnAbstractService<UmaConfigValueEntity, UmaConfigValueDto, Integer, UmaConfigValueRepository> implements UmaConfigValueService {

    @Autowired
    private UmaConfigValueRepository umaConfigValueRepository;

    public UmaConfigValueServiceImpl(UmaConfigValueRepository repository) {
        super(repository);
    }
}