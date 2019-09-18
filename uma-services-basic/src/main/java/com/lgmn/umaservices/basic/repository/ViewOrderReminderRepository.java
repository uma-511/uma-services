package com.lgmn.umaservices.basic.repository;

import com.lgmn.umaservices.basic.dto.ViewOrderReminderDto;
import com.lgmn.umaservices.basic.entity.ViewOrderReminderEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewOrderReminderRepository extends LgmnRepository<ViewOrderReminderEntity, ViewOrderReminderDto, Integer> {
}