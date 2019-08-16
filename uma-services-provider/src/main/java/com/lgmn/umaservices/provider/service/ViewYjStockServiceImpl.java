package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.umaservices.basic.dto.ViewYjStockDto;
import com.lgmn.umaservices.basic.dto.YjProductDto;
import com.lgmn.umaservices.basic.entity.ViewYjStockEntity;
import com.lgmn.umaservices.basic.entity.YjProductEntity;
import com.lgmn.umaservices.basic.repository.ViewYjStockRepository;
import com.lgmn.umaservices.basic.repository.YjProductRepository;
import com.lgmn.umaservices.basic.service.ViewYjStockService;
import com.lgmn.umaservices.basic.service.YjProductService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ViewYjStockServiceImpl extends LgmnAbstractService<ViewYjStockEntity, ViewYjStockDto, Integer, ViewYjStockRepository> implements ViewYjStockService {

    @Autowired
    private ViewYjStockRepository viewYjStockRepository;

    public ViewYjStockServiceImpl(ViewYjStockRepository repository) {
        super(repository);
    }
}