package com.example.MerchantProject.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Country {
    @Id
    @Column(name = "country_id", nullable = false)
    private Long country_id;

    @Column(name = "country_name")
    private String countryName;

    private Currency currency;


}
