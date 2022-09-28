package com.example.MerchantProject.model.customer_info_services;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CustomerFAQs {

    @Id
    @Column(name = " FAQ_id", nullable = false)
    private Long FAQ_id;
    private String FAQ_url;
}
