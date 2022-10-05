package com.example.MerchantProject.model.customer_info_services;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CustomerFAQs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = " FAQ_id", nullable = false)
    private Long FAQ_id;
    private String FAQ_url;
}
