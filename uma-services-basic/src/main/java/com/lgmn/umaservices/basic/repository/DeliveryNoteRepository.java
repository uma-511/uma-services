package com.lgmn.umaservices.basic.repository;

import java.util.Date;
import com.lgmn.umaservices.basic.dto.DeliveryNoteDto;
import com.lgmn.umaservices.basic.entity.DeliveryNoteEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryNoteRepository extends LgmnRepository<DeliveryNoteEntity, DeliveryNoteDto, Integer> {
}