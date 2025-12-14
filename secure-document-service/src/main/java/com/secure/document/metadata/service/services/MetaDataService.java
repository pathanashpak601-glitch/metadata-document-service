package com.secure.document.metadata.service.services;

import com.secure.document.metadata.service.entity.MetaDataModel;
import com.secure.document.metadata.service.repository.MetaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MetaDataService {

    @Autowired
    MetaDataRepository metaDataRepository;
    public MetaDataModel addMetaData(MetaDataModel metaDataModel) {
     return metaDataRepository.save(metaDataModel);
    }

    public MetaDataModel getMetaData(int id) {
        return metaDataRepository.getById(id);
    }

    public void deleteMetaData(int id) {
        metaDataRepository.deleteById(id);
    }
}
