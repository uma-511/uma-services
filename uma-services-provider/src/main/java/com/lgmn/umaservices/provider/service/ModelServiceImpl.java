package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.ModelDto;
import com.lgmn.umaservices.basic.entity.ModelEntity;
import com.lgmn.umaservices.basic.repository.ModelRepository;
import com.lgmn.umaservices.basic.service.ModelService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ModelServiceImpl extends LgmnAbstractService<ModelEntity, ModelDto, Integer, ModelRepository> implements ModelService {

    @Autowired
    private ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository repository) {
        super(repository);
    }
}