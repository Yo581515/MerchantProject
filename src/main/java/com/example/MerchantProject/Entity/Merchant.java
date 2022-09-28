package com.example.MerchantProject.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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


}
