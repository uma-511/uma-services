package com.lgmn.umaservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.umaservices.basic.dto.DeliveryNoteDto;
import com.lgmn.umaservices.basic.dto.RefundNoteDto;
import com.lgmn.umaservices.basic.entity.DeliveryNoteEntity;
import com.lgmn.umaservices.basic.entity.RefundNoteEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface RefundNoteRepository extends LgmnRepository<RefundNoteEntity, RefundNoteDto, Integer> {
}