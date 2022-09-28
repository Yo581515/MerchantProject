package com.example.MerchantProject.model.customer_info_services;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class GiftcardTermsAndConditions {

    @Id
    @Column(name = "TAC_id", nullable = false)
    private Long TAC_id;
    private String TAC_url;

}
