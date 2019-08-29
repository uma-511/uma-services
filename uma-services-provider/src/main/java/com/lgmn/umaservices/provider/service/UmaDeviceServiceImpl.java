package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.UmaDeviceDto;
import com.lgmn.umaservices.basic.entity.UmaDeviceEntity;
import com.lgmn.umaservices.basic.repository.UmaDeviceRepository;
import com.lgmn.umaservices.basic.service.UmaDeviceService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UmaDeviceServiceImpl extends LgmnAbstractService<UmaDeviceEntity, UmaDeviceDto, Integer, UmaDeviceRepository> implements UmaDeviceService {

    @Autowired
    private UmaDeviceRepository umaDeviceRepository;

    public UmaDeviceServiceImpl(UmaDeviceRepository repository) {
        super(repository);
    }

    @Override
    public UmaDeviceEntity findByIp(String ip) {
        UmaDeviceDto dto = new UmaDeviceDto();
        dto.setIp(ip);
        dto.setGroupName("看板");
        UmaDeviceEntity umaDeviceEntity = null;
        try {
            List<UmaDeviceEntity> deviceEntities = umaDeviceRepository.getListByDto(dto);
            if(deviceEntities.size()==1){
                umaDeviceEntity = deviceEntities.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return umaDeviceEntity;
    }
}