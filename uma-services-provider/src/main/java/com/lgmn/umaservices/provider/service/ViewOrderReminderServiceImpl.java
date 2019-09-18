package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.ViewOrderReminderDto;
import com.lgmn.umaservices.basic.entity.ViewOrderReminderEntity;
import com.lgmn.umaservices.basic.repository.ViewOrderReminderRepository;
import com.lgmn.umaservices.basic.service.ViewOrderReminderService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ViewOrderReminderServiceImpl extends LgmnAbstractService<ViewOrderReminderEntity, ViewOrderReminderDto, Integer, ViewOrderReminderRepository> implements ViewOrderReminderService {

    @Autowired
    private ViewOrderReminderRepository _repository;

    public ViewOrderReminderServiceImpl(ViewOrderReminderRepository repository) {
        super(repository);
    }
}