package com.example.MerchantProject.reposetories;

import com.example.MerchantProject.Entity.country.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
