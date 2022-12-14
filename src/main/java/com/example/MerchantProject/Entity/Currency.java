package com.example.MerchantProject.Entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
