package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.DeliveryNoteDto;
import com.lgmn.umaservices.basic.entity.DeliveryNoteEntity;
import com.lgmn.umaservices.basic.repository.DeliveryNoteRepository;
import com.lgmn.umaservices.basic.service.DeliveryNoteService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DeliveryNoteServiceImpl extends LgmnAbstractService<DeliveryNoteEntity, DeliveryNoteDto, Integer, DeliveryNoteRepository> implements DeliveryNoteService {

    @Autowired
    private DeliveryNoteRepository deliveryNoteRepository;

    public DeliveryNoteServiceImpl(DeliveryNoteRepository repository) {
        super(repository);
    }
}