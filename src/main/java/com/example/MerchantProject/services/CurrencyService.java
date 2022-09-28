package com.example.MerchantProject.services;

import com.example.MerchantProject.Entity.Currency;
import com.example.MerchantProject.reposetories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {
    @Autowired
    CurrencyRepository currencyRepository ;

     public List<Currency> getCurrencies(){
         return currencyRepository.findAll();
     }

}
