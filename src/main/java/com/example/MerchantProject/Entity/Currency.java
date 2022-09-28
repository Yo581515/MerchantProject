package com.example.MerchantProject.Entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Currency {

    @Id
    @Column(name = "currency_id", nullable = false)
    private Long currency_id;
    private String currency;


}
