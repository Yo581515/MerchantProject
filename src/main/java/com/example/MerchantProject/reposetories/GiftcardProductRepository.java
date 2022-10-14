package com.example.MerchantProject.reposetories;

import com.example.MerchantProject.Entity.GiftcardProduct.GiftcardProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftcardProductRepository extends JpaRepository <GiftcardProduct, Long> {

}
