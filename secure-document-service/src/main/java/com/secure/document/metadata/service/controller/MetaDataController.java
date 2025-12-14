package com.secure.document.metadata.service.controller;


import com.secure.document.metadata.service.entity.MetaDataEntity;
import com.secure.document.metadata.service.entity.MetaDataModel;
import com.secure.document.metadata.service.repository.MetaDataRepository;
import com.secure.document.metadata.service.services.MetaDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/metadata/service")
//@CrossOrigin(origins = "*")
public class MetaDataController {
    private MetaDataModel metaDataEntity;

    private final MetaDataService metaDataService;

    public MetaDataController(MetaDataService metaDataService) {
        this.metaDataService = metaDataService;
    }
    @PostMapping("/create")
    public ResponseEntity<MetaDataModel> addMetaData(@RequestBody MetaDataModel metaDataModel){
            metaDataEntity = metaDataService.addMetaData(metaDataModel);
            return ResponseEntity.ok(metaDataEntity);
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<MetaDataModel> getMetaData(@PathVariable int id){
        metaDataEntity = metaDataService.getMetaData(id);
        return ResponseEntity.ok(metaDataEntity);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> deleteMetaData(@PathVariable int id){
        metaDataService.deleteMetaData(id);
        return ResponseEntity.noContent().build();
    }
}
