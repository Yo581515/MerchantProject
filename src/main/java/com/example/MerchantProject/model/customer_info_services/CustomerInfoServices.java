package com.example.MerchantProject.model.customer_info_services;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CustomerInfoServices {

    @Id
    @Column(name = "info_service_id", nullable =false)
    private Long info_service_id;

}
