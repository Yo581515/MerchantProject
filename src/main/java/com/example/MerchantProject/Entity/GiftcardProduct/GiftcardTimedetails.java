package com.example.MerchantProject.Entity.GiftcardProduct;

import com.example.MerchantProject.Entity.customer_info_services.CustomerInfoServices;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
public class GiftcardTimedetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long giftcard_time_id;

    private Date available_for_purchase_time;
    private Date expire_for_purchase_time;
    private Date number_of_days_card_is_valid_from_purchase_time;
    private Date valid_from_date;
    private Date valid_until_date;

    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private GiftcardProduct giftcardProduct;

}
