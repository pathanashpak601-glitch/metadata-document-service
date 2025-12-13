package com.secure.document.metadata.service.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "MetaData")
public class MetaDataModel {

    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private String value;
}
