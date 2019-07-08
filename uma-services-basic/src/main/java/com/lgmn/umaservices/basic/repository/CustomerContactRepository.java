package com.lgmn.umaservices.basic.repository;

import java.util.Date;
import com.lgmn.umaservices.basic.dto.CustomerContactDto;
import com.lgmn.umaservices.basic.entity.CustomerContactEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerContactRepository extends LgmnRepository<CustomerContactEntity, CustomerContactDto, Integer> {
}