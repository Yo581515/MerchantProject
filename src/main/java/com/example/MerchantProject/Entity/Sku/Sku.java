package com.example.MerchantProject.Entity.Sku;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Sku {
    @Id
    private String sku_prefix;

    private Long minValue;
    private Long maxValue;

}
