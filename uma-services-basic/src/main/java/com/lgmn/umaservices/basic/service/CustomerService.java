package com.lgmn.umaservices.basic.service;

import java.util.Date;
import com.lgmn.umaservices.basic.dto.CustomerDto;
import com.lgmn.umaservices.basic.entity.CustomerEntity;
import com.lgmn.common.service.LgmnService;

public interface CustomerService extends LgmnService<CustomerEntity, CustomerDto, Integer> {
}