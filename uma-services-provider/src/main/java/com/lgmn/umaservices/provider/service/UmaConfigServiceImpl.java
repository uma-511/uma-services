package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.UmaConfigDto;
import com.lgmn.umaservices.basic.entity.UmaConfigEntity;
import com.lgmn.umaservices.basic.repository.UmaConfigRepository;
import com.lgmn.umaservices.basic.service.UmaConfigService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UmaConfigServiceImpl extends LgmnAbstractService<UmaConfigEntity, UmaConfigDto, Integer, UmaConfigRepository> implements UmaConfigService {

    @Autowired
    private UmaConfigRepository umaConfigRepository;

    public UmaConfigServiceImpl(UmaConfigRepository repository) {
        super(repository);
    }
}