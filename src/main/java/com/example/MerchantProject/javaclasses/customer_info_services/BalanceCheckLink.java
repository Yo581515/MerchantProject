package com.example.MerchantProject.javaclasses.customer_info_services;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "balanceCheckLink")
public class BalanceCheckLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "balance_id", nullable = false)
    private Long balance_id;
    private String balance_url;

    @OneToOne(mappedBy = "balanceCheckLink")
    private CustomerInfoServices infoServices;
}
