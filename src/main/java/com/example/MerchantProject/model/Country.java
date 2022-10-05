package com.example.MerchantProject.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryId;

    @Column(name = "country_name")
    private String countryName;

    @ManyToOne(targetEntity = Currency.class)
    @JoinColumn(name = "currency_id")
    private Currency currency;
}
