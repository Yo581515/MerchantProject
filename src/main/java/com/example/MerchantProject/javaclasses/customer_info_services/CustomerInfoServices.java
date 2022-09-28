package com.example.MerchantProject.javaclasses.customer_info_services;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "info_services")
public class CustomerInfoServices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "info_service_id", nullable =false)
    private Long info_service_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "balance_id", referencedColumnName = "balance_id")
    private BalanceCheckLink balanceCheckLink;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FAQ_id", referencedColumnName = "FAQ_id")
    private CustomerFAQs FAQ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TAC_id", referencedColumnName = "TAC_id")
    private GiftcardTermsAndConditions TAC;

}
