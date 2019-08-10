package com.lgmn.umaservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.umaservices.basic.dto.ViewOrderInfoDto;
import com.lgmn.umaservices.basic.entity.ViewOrderInfoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewOrderInfoRepository extends LgmnRepository<ViewOrderInfoEntity, ViewOrderInfoDto, String> {
}