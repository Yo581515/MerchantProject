package com.example.MerchantProject.Entity.GiftcardProduct;

import com.example.MerchantProject.Entity.Merchant;
import com.example.MerchantProject.enums.ProductRedemptionStatus;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class GiftcardProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    private String sku_prefix;
    private String name;
    private String description;
    private String urlgiftcardresource;
    private String giftcard_image;
    private String usage;
    private String provider;
    private String textmobview;
    private long extra_value;
    private long sort_weight;
    private boolean tokenized;
    private boolean reloadable;
    private long giftcard_number_mask;
    private long Prevent_send_card_and_pin;

    @Enumerated(EnumType.STRING)
    private ProductRedemptionStatus product_redemptionStatus;

    @ManyToOne
    @JoinColumn(name = "merchant_id", referencedColumnName = "merchant_id")
    private Merchant merchant;

//    FK price_id
//    FK girftcard_product_type_id
//    FK giftcard_time_id
//    FK template_id
//    FK discount_id
//    FK supplier_id
//    FK availability_id
//    FK country_prod_id

}
