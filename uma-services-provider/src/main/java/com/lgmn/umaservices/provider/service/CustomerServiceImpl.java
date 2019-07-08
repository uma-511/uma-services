package com.lgmn.umaservices.provider.service;

import java.util.Date;
import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.CustomerDto;
import com.lgmn.umaservices.basic.entity.CustomerEntity;
import com.lgmn.umaservices.basic.repository.CustomerRepository;
import com.lgmn.umaservices.basic.service.CustomerService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class CustomerServiceImpl extends LgmnAbstractService<CustomerEntity, CustomerDto, Integer, CustomerRepository> implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository repository) {
        super(repository);
    }
}