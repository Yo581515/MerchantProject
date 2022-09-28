package com.example.MerchantProject.javaclasses.customer_info_services;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FAQ")
public class CustomerFAQs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = " FAQ_id", nullable = false)
    private Long FAQ_id;
    private String FAQ_url;

    @OneToOne(mappedBy = "FAQ")
    private CustomerInfoServices infoServices;
}
