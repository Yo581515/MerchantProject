package com.example.MerchantProject.reposetories.customer_info_services;

import com.example.MerchantProject.javaclasses.customer_info_services.CustomerInfoServices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInfoServicesDAO extends JpaRepository<CustomerInfoServices,Integer> {
}
