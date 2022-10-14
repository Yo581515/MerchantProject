package com.example.MerchantProject.Entity.country;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long currency_id;
    private String currency;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "currency")
//    List<Country> countries;

    public boolean equals(Currency currency){
        return this.getCurrency().equals(currency.getCurrency());
    }


}
