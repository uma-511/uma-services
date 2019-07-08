package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.umaservices.basic.dto.ProductDto;
import com.lgmn.umaservices.basic.entity.ProductEntity;
import com.lgmn.umaservices.basic.repository.ProductRepository;
import com.lgmn.umaservices.basic.service.ProductService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ProductServiceImpl extends LgmnAbstractService<ProductEntity, ProductDto, Integer, ProductRepository> implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository repository) {
        super(repository);
    }
}