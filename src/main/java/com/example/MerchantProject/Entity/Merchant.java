package com.example.MerchantProject.Entity;

import com.example.MerchantProject.Entity.customer_info_services.CustomerInfoServices;
import com.example.MerchantProject.enums.BrandCategories;
import com.example.MerchantProject.enums.MerchantStatus;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;

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
    private Timestamp createdtime;
    private boolean isnational;
    private boolean international;
    private String retailer_description;
    private String retailer_description_redemption_country;
    private Long tax_number;
    private String payout_status;

    @Enumerated(EnumType.STRING)
    private MerchantStatus merchantStatus;

    @ElementCollection(targetClass = BrandCategories.class)
    @CollectionTable
    @Enumerated(EnumType.STRING)
    Collection<BrandCategories> categories;

//    @OneToMany
//    @JoinColumn(name = "country_of_redemtion_id", RefererencedColumnName ="country_red_id")
//    private Country_of_redemtion country_of_redemtion;
//
//    @OneToMany
//    @JoinColumn(name = "country_of_merchant_id", RefererencedColumnName ="country_mer_id")
//    private Country_of_merchant country_of_merchant;
//
//    @OneToOne
//    @JoinColumn(name = "approval_id", referencedColumnName = "approval_id")
//    private Approval approval;
}
