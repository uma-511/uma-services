package com.lgmn.umaservices.provider.service;

import java.util.Date;
import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.YjProductDto;
import com.lgmn.umaservices.basic.entity.YjProductEntity;
import com.lgmn.umaservices.basic.repository.YjProductRepository;
import com.lgmn.umaservices.basic.service.YjProductService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class YjProductServiceImpl extends LgmnAbstractService<YjProductEntity, YjProductDto, Integer, YjProductRepository> implements YjProductService {

    @Autowired
    private YjProductRepository yjProductRepository;

    public YjProductServiceImpl(YjProductRepository repository) {
        super(repository);
    }
}