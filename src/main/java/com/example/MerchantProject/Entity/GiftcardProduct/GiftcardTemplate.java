package com.example.MerchantProject.Entity.GiftcardProduct;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class GiftcardTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long template_id;

    private String template_type;
    private String sendgrid_template;


}
