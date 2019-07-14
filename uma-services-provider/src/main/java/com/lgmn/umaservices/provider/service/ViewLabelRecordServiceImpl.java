package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.umaservices.basic.dto.ViewLabelRecordDto;
import com.lgmn.umaservices.basic.entity.ViewLabelRecordEntity;
import com.lgmn.umaservices.basic.repository.ViewLabelRecordRepository;
import com.lgmn.umaservices.basic.service.ViewLabelRecordService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ViewLabelRecordServiceImpl extends LgmnAbstractService<ViewLabelRecordEntity, ViewLabelRecordDto, Integer, ViewLabelRecordRepository> implements ViewLabelRecordService {

    @Autowired
    private ViewLabelRecordRepository viewLabelRecordRepository;

    public ViewLabelRecordServiceImpl(ViewLabelRecordRepository repository) {
        super(repository);
    }
}