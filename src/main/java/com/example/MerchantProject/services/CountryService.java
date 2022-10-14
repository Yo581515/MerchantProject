package com.example.MerchantProject.services;

import com.example.MerchantProject.Entity.country.Country;
import com.example.MerchantProject.reposetories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CountryService {


    @Autowired
    CountryRepository countryRepository;

    public List<Country> getCountryList() {
        return countryRepository.findAll();
    }


    public Country getCountryById(Long country_id) {
        return countryRepository.findById(country_id).orElse(null);
    }


    public Country deleteCurrency(Long country_id) {
        Country country = getCountryById(country_id);
        if (country != null) {
            countryRepository.deleteById(country_id);
        }
        return country;
    }

    public Country insertCurrency(Country country) {
        return countryRepository.save(country);
    }


    @Transactional
    public Country updateCountry(Long country_id, Country country) {
        if (!countryExist(country_id)) {
            return null;
        }

        Country oldCountry = getCountryById(country_id);
        if (oldCountry == null) {
            return null;
        }

        if (oldCountry != null && !oldCountry.getCountryName().equals(country)) {
            oldCountry.setCountryName(country.getCountryName());
        }

        if (oldCountry != null && !oldCountry.getCurrency().equals(country.getCurrency())) {
            oldCountry.setCurrency(country.getCurrency());
        }

        return countryRepository.save(oldCountry);
    }

    public boolean countryExist(Long country_id) {
        return getCountryById(country_id) != null;
    }
}
