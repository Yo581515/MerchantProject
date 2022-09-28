package com.example.MerchantProject.model.customer_info_services;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class BalanceCheckLink {

    @Id
    @Column(name = "balance_id", nullable = false)
    private Long balance_id;
    private String balance_url;


}
