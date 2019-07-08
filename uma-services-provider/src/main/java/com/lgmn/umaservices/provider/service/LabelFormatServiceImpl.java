package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.LabelFormatDto;
import com.lgmn.umaservices.basic.entity.LabelFormatEntity;
import com.lgmn.umaservices.basic.repository.LabelFormatRepository;
import com.lgmn.umaservices.basic.service.LabelFormatService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LabelFormatServiceImpl extends LgmnAbstractService<LabelFormatEntity, LabelFormatDto, Integer, LabelFormatRepository> implements LabelFormatService {

    @Autowired
    private LabelFormatRepository labelFormatRepository;

    public LabelFormatServiceImpl(LabelFormatRepository repository) {
        super(repository);
    }
}