package com.example.MerchantProject.Entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.EnumMap;

@Data
@Entity
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long merchant_id;

    private String name;
    private String email;
    private String urllogo;
    private Integer org_number;
    private Timestamp createdime;
    private boolean isnational;
    private boolean international;
    private Enum brand_category;
    private String retailer_description;
    private String retailer_description_redemption_country;
    private Enum merchantstatus;
    private Long tax_number;
    private String payout_status;

//    @OneToMany
//    @JoinColumn(name = "giftcard_product_id", RefererencedColumnName ="product_id")
//    private Giftcard_product giftcard_product;
//
//
//    @OneToOne
//    @JoinColumn(name = "info_service_id", RefererencedColumnName ="info_service_id")
//    private Customer_info_services customer_info_services;
//
//    @OneToMany
//    @JoinColumn(name = "country_of_redemtion_id", RefererencedColumnName ="country_red_id")
//    private Country_of_redemtion country_of_redemtion;
//
//    @OneToMany
//    @JoinColumn(name = "country_of_merchant_id", RefererencedColumnName ="country_mer_id")
//    private Country_of_merchant country_of_merchant;
//
//    @OneToOne
//    @JoinColumn(name = "description", RefererencedColumnName ="description_id")
//    private Description description;
//
//    @OneToMany
//    Reference to Enum_brand_categories
//
//    @OneToMany
//    Reference to Enum_merchant_status
}
