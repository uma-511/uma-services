package com.lgmn.umaservices.basic.repository;

import java.util.Date;
import com.lgmn.umaservices.basic.dto.YjOrderDto;
import com.lgmn.umaservices.basic.entity.YjOrderEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YjOrderRepository extends LgmnRepository<YjOrderEntity, YjOrderDto, Integer> {
}