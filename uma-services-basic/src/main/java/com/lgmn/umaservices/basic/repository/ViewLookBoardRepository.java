package com.lgmn.umaservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.umaservices.basic.dto.ViewLookBoardDto;
import com.lgmn.umaservices.basic.entity.ViewLookBoardEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewLookBoardRepository extends LgmnRepository<ViewLookBoardEntity, ViewLookBoardDto, Integer> {
}