package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.umaservices.basic.dto.ViewYjStockMiappDto;
import com.lgmn.umaservices.basic.entity.ViewYjStockEntity;
import com.lgmn.umaservices.basic.repository.ViewYjStockMiappRepository;
import com.lgmn.umaservices.basic.service.ViewYjStockMiappService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ViewYjStockMiappServiceImpl extends LgmnAbstractService<ViewYjStockEntity, ViewYjStockMiappDto, Integer, ViewYjStockMiappRepository> implements ViewYjStockMiappService {

    @Autowired
    private ViewYjStockMiappRepository viewYjStockRepository;

    public ViewYjStockMiappServiceImpl(ViewYjStockMiappRepository repository) {
        super(repository);
    }
}