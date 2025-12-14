package com.secure.document.metadata.service.entity;

import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;

@Entity
@Table(name = "meta_doc_save")
public class MetaDataModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @Column(name = "name")
    private String name;
  //  @Column(name = "value")
    private String value;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
