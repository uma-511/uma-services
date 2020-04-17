package com.lgmn.umaservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.umaservices.basic.dto.DeliveryListDto;
import com.lgmn.umaservices.basic.dto.RefundListDto;
import com.lgmn.umaservices.basic.entity.DeliveryListEntity;
import com.lgmn.umaservices.basic.entity.RefundListEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface RefundListRepository extends LgmnRepository<RefundListEntity, RefundListDto, Integer> {
}