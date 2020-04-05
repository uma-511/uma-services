package com.lgmn.umaservices.basic.service;

import com.lgmn.common.service.LgmnService;
import com.lgmn.umaservices.basic.dto.UmaDeviceDto;
import com.lgmn.umaservices.basic.entity.UmaDeviceEntity;

public interface UmaDeviceService extends LgmnService<UmaDeviceEntity, UmaDeviceDto, Integer> {
    UmaDeviceEntity findByIp(String ip);

    UmaDeviceEntity findPrinterByTerminal(String ip);
}