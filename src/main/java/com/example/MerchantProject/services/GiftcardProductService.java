package com.example.MerchantProject.services;

import com.example.MerchantProject.Entity.GiftcardProduct.GiftcardProduct;
import com.example.MerchantProject.reposetories.GiftcardProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GiftcardProductService {

    @Autowired
    GiftcardProductRepository giftcardProductRepository;

    //get id
    public GiftcardProduct getProductById (long product_id) {



        return null;
    }



    //does exist?
    public boolean productExist(Long product_id) {
        return getProductById(product_id) != null;
    }
}


