package com.secure.document.metadata.service.repository;

import com.secure.document.metadata.service.entity.MetaDataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaDataRepository extends JpaRepository<MetaDataModel, Integer> {

}
