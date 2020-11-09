package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.LabelRecordDto;
import com.lgmn.umaservices.basic.entity.LabelRecordEntity;
import com.lgmn.umaservices.basic.repository.LabelRecordRepository;
import com.lgmn.umaservices.basic.service.LabelRecordService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LabelRecordServiceImpl extends LgmnAbstractService<LabelRecordEntity, LabelRecordDto, Integer, LabelRecordRepository> implements LabelRecordService {

    @Autowired
    private LabelRecordRepository labelRecordRepository;

    public LabelRecordServiceImpl(LabelRecordRepository repository) {
        super(repository);
    }

    @Override
    public Integer countByLabelNum(String labelNum) {
        return labelRecordRepository.countByLabelNum(labelNum);
    }
}