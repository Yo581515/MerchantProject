package com.example.MerchantProject.javaclasses.customer_info_services;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TAC")
public class GiftcardTermsAndConditions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TAC_id", nullable = false)
    private Long TAC_id;
    private String TAC_url;

    @OneToOne(mappedBy = "TAC")
    private CustomerInfoServices infoServices;
}
