package com.lgmn.umaservices.basic.repository;

import java.util.Date;
import com.lgmn.umaservices.basic.dto.CustomerDto;
import com.lgmn.umaservices.basic.entity.CustomerEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends LgmnRepository<CustomerEntity, CustomerDto, Integer> {
}