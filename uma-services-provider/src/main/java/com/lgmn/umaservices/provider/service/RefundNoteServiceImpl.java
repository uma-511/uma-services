package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.umaservices.basic.dto.DeliveryNoteDto;
import com.lgmn.umaservices.basic.dto.RefundNoteDto;
import com.lgmn.umaservices.basic.entity.DeliveryNoteEntity;
import com.lgmn.umaservices.basic.entity.RefundNoteEntity;
import com.lgmn.umaservices.basic.repository.DeliveryNoteRepository;
import com.lgmn.umaservices.basic.repository.RefundNoteRepository;
import com.lgmn.umaservices.basic.service.DeliveryNoteService;
import com.lgmn.umaservices.basic.service.RefundNoteService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class RefundNoteServiceImpl extends LgmnAbstractService<RefundNoteEntity, RefundNoteDto, Integer, RefundNoteRepository> implements RefundNoteService {

    @Autowired
    private RefundNoteRepository refundNoteRepository;

    public RefundNoteServiceImpl(RefundNoteRepository repository) {
        super(repository);
    }
}