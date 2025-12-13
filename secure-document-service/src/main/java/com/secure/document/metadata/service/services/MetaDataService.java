package com.secure.document.metadata.service.services;

import com.secure.document.metadata.service.entity.MetaDataEntity;
import com.secure.document.metadata.service.entity.MetaDataModel;
import org.springframework.stereotype.Service;

@Service
public interface MetaDataService {

    MetaDataEntity addMetaData(MetaDataModel metaDataModel);
}
