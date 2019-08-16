package com.lgmn.umaservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.umaservices.basic.dto.ViewYjStockDto;
import com.lgmn.umaservices.basic.entity.ViewYjStockEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewYjStockRepository extends LgmnRepository<ViewYjStockEntity, ViewYjStockDto, Integer> {
}