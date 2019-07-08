package com.lgmn.umaservices.basic.repository;

import com.lgmn.umaservices.basic.dto.ProductDto;
import com.lgmn.umaservices.basic.entity.ProductEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends LgmnRepository<ProductEntity, ProductDto, Integer> {
}