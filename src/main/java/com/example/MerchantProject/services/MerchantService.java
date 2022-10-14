package com.example.MerchantProject.services;


import com.example.MerchantProject.Entity.Merchant;
import com.example.MerchantProject.reposetories.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class MerchantService {

    @Autowired
    MerchantRepository merchantRepository;

   public Merchant getMerchantById (long merchant_id) {
       return merchantRepository.findById(merchant_id).orElse(null);
   }

    @Transactional
    public Merchant updateMerchant (long merchant_id, Merchant merchant) {

        Merchant oldMerchant = getMerchantById(merchant_id);
        if (oldMerchant == null) {
            return null;
        }


        return merchantRepository.save(oldMerchant);
    }
    public List<Merchant> getMerchantList () {
       return merchantRepository.findAll();
    }


    //needs rework
    public Merchant newMerchant (Merchant merchant) {
       if(merchantExist(merchant.getMerchant_id()))
           return null;

       return merchantRepository.save(merchant);
    }
    public Merchant deleteMerchant (long merchant_id) {

           Merchant merchant = getMerchantById(merchant_id);
           if (merchant != null) {
               merchantRepository.deleteById(merchant_id);
               return merchant;
           }
           return null;
    }

    public boolean merchantExist(Long merchant_id) {
        return getMerchantById(merchant_id) != null;
    }
}


