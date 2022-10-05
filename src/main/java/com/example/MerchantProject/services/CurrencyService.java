package com.example.MerchantProject.services;

import com.example.MerchantProject.model.Currency;
import com.example.MerchantProject.reposetories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;


    public List<Currency> getCurrencyList() {
        return currencyRepository.findAll();
    }

    public Currency getCurrencyById(Long currency_id) {
        return currencyRepository.findById(currency_id).orElse(null);
    }

    public Currency deleteCurrency(Long currency_id) {
        Currency currency = getCurrencyById(currency_id);
        if (currency != null) {
            currencyRepository.deleteById(currency_id);
        }
        return currency;
    }

    public Currency insertCurrency(Currency currency) {
        return currencyRepository.save(currency);
    }

    @Transactional
    public Currency updateCurrency(Long currency_id, Currency currency) {
        if (!currencyExist(currency_id)) {
            return null;
        }
        Currency oldCurrency = getCurrencyById(currency_id);
        if (oldCurrency == null) {
            return null;
        }
        if (oldCurrency.getCurrency() != null && oldCurrency.getCurrency().length() > 0) {
            oldCurrency.setCurrency(currency.getCurrency());
        }
        return currencyRepository.save(oldCurrency);
    }

    public boolean currencyExist(Long currency_id) {
        return getCurrencyById(currency_id) != null;
    }
}
