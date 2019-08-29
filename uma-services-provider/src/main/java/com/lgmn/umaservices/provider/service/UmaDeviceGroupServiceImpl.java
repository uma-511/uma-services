package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.UmaDeviceGroupDto;
import com.lgmn.umaservices.basic.entity.UmaDeviceGroupEntity;
import com.lgmn.umaservices.basic.repository.UmaDeviceGroupRepository;
import com.lgmn.umaservices.basic.service.UmaDeviceGroupService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UmaDeviceGroupServiceImpl extends LgmnAbstractService<UmaDeviceGroupEntity, UmaDeviceGroupDto, Integer, UmaDeviceGroupRepository> implements UmaDeviceGroupService {

    @Autowired
    private UmaDeviceGroupRepository umaDeviceGroupRepository;

    public UmaDeviceGroupServiceImpl(UmaDeviceGroupRepository repository) {
        super(repository);
    }
}