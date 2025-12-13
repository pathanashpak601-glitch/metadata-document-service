package com.secure.document.metadata.service.controller;


import com.secure.document.metadata.service.entity.MetaDataEntity;
import com.secure.document.metadata.service.entity.MetaDataModel;
import com.secure.document.metadata.service.services.MetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/metadata/service")
public class MetaDataController {
    private MetaDataEntity metaDataEntity;

    @Autowired
    MetaDataService metaDataService;

    @PostMapping
    public ResponseEntity<MetaDataEntity> addMetaData(@RequestBody MetaDataModel metaDataModel){

        if(metaDataModel != null){
            metaDataEntity = metaDataService.addMetaData(metaDataModel);
            return ResponseEntity.ok(metaDataEntity);
        }
       return null;
    }
}
