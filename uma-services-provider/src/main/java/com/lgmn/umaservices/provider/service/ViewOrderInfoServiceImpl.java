package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.umaservices.basic.dto.ViewOrderInfoDto;
import com.lgmn.umaservices.basic.entity.ViewOrderInfoEntity;
import com.lgmn.umaservices.basic.repository.ViewOrderInfoRepository;
import com.lgmn.umaservices.basic.service.ViewOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ViewOrderInfoServiceImpl extends LgmnAbstractService<ViewOrderInfoEntity, ViewOrderInfoDto, String, ViewOrderInfoRepository> implements ViewOrderInfoService {

    @Autowired
    private ViewOrderInfoRepository viewOrderInfoRepository;

    public ViewOrderInfoServiceImpl(ViewOrderInfoRepository repository) {
        super(repository);
    }
}