package com.lgmn.umaservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.umaservices.basic.dto.ViewLookBoardDto;
import com.lgmn.umaservices.basic.entity.ViewLookBoardEntity;
import com.lgmn.umaservices.basic.repository.ViewLookBoardRepository;
import com.lgmn.umaservices.basic.service.ViewLookBoardService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ViewLookBoardServiceImpl extends LgmnAbstractService<ViewLookBoardEntity, ViewLookBoardDto, Integer, ViewLookBoardRepository> implements ViewLookBoardService {

    @Autowired
    private ViewLookBoardRepository viewLookBoardRepository;

    public ViewLookBoardServiceImpl(ViewLookBoardRepository repository) {
        super(repository);
    }
}