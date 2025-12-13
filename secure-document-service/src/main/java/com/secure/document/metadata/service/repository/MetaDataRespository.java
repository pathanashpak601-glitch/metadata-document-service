package com.secure.document.metadata.service.repository;

import com.secure.document.metadata.service.entity.MetaDataEntity;
import com.secure.document.metadata.service.entity.MetaDataModel;
import com.secure.document.metadata.service.services.MetaDataService;
import org.springframework.stereotype.Repository;

@Repository
public class MetaDataRespository implements MetaDataService {
    @Override
    public MetaDataEntity addMetaData(MetaDataModel metaDataModel) {
        return null;
    }
}
