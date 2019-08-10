package com.lgmn.umaservices.basic.repository;

import java.util.Date;
import com.lgmn.umaservices.basic.dto.YjProductDto;
import com.lgmn.umaservices.basic.entity.YjProductEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YjProductRepository extends LgmnRepository<YjProductEntity, YjProductDto, Integer> {
}