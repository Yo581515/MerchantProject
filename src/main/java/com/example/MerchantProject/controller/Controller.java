package com.example.MerchantProject.controller;

import com.example.MerchantProject.Entity.Currency;
import com.example.MerchantProject.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
//heisann
    @Autowired
    CurrencyService currencyService;

    @GetMapping("/")
    List<Currency> currencies(){
        return currencyService.getCurrencies();
    }

}
