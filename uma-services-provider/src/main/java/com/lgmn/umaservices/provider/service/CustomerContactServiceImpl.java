package com.lgmn.umaservices.provider.service;

import java.util.Date;
import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.CustomerContactDto;
import com.lgmn.umaservices.basic.entity.CustomerContactEntity;
import com.lgmn.umaservices.basic.repository.CustomerContactRepository;
import com.lgmn.umaservices.basic.service.CustomerContactService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class CustomerContactServiceImpl extends LgmnAbstractService<CustomerContactEntity, CustomerContactDto, Integer, CustomerContactRepository> implements CustomerContactService {

    @Autowired
    private CustomerContactRepository customerContactRepository;

    public CustomerContactServiceImpl(CustomerContactRepository repository) {
        super(repository);
    }
}