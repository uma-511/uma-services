package com.lgmn.umaservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.umaservices.basic.dto.ViewYjStockMiappDto;
import com.lgmn.umaservices.basic.entity.ViewYjStockEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewYjStockMiappRepository extends LgmnRepository<ViewYjStockEntity, ViewYjStockMiappDto, Integer> {
}