package com.example.MerchantProject.controller;

import com.example.MerchantProject.Entity.Currency;
import com.example.MerchantProject.model.Country;
import com.example.MerchantProject.services.CountryService;
import com.example.MerchantProject.services.CurrencyService;
import com.example.MerchantProject.services.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {


    @Autowired
    CurrencyService currencyService;
    @Autowired
    CountryService countryService;

    @Autowired
    MerchantService merchantService;

    //http://localhost:8080/merchant/currencies
    @GetMapping("/currencies")
    List<Currency> currencies() {
        return currencyService.getCurrencyList();
    }

    //http://localhost:8080/merchant/currencies/1
    @GetMapping(path = "/currencies/{currency_id}")
    Currency getCurreny(@PathVariable("currency_id") Long currency_id) {
        return currencyService.getCurrencyById(currency_id);
    }

    //http://localhost:8080/merchant/currencies/1
    @DeleteMapping(path = "/currencies/{currency_id}")
    Currency deleteCurreny(@PathVariable("currency_id") Long currency_id) {
        return currencyService.deleteCurrency(currency_id);
    }

    //http://localhost:8080/merchant/currencies
    @PostMapping("/currencies")
    Currency insertCurrency(@RequestBody Currency currency) {
        return currencyService.insertCurrency(currency);
    }

    @PutMapping(path = "/currencies/{currency_id}")
    public Currency updateCururrency(@PathVariable Long currency_id, @RequestBody Currency currency) {
        return currencyService.updateCurrency(currency_id, currency);
    }


    //http://localhost:8080/merchant/countries
    @GetMapping("/countries")
    List<Country> countries() {
        return countryService.getCountryList();
    }

    //http://localhost:8080/merchant/countries/1
    @GetMapping(path = "/countries/{country_id}")
    Country country(@PathVariable("country_id") Long country_id) {
        System.out.println(country_id);
        return countryService.getCountryById(country_id);
    }

    //http://localhost:8080/merchant/countries/1
    @DeleteMapping(path = "/countries/{country_id}")
    Country deleteCountry(@PathVariable("country_id") Long country_id) {
        return countryService.deleteCurrency(country_id);
    }

    //http://localhost:8080/merchant/countries
    @PostMapping("/countries")
    Country insertCountry(@RequestBody Country country) {
        System.out.println(country);
        return countryService.insertCurrency(country);
    }

    //http://localhost:8080/merchant/countries/1

    @PutMapping(path = "/countries/{country_id}")
    public Country updateCountry(@PathVariable Long country_id, @RequestBody Country country) {
        return countryService.updateCountry(country_id, country);
    }


}
