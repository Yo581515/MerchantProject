package com.example.MerchantProject.Entity.Sku;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Denominations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long denomination_id;
    private String denomination;

    @ManyToOne
    @JoinColumn(name = "sku_prefix", referencedColumnName = "sku_prefix")
    private Sku sku;

}
