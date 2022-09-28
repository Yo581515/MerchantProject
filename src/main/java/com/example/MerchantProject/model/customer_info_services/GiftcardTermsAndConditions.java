package com.example.MerchantProject.model.customer_info_services;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class GiftcardTermsAndConditions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TAC_id", nullable = false)
    private Long TAC_id;
    private String TAC_url;

}
