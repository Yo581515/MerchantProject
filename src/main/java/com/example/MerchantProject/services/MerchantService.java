package com.example.MerchantProject.services;

import com.example.MerchantProject.reposetories.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MerchantService {

    @Autowired
    MerchantRepository merchantRepository;

    //legg til metoder her

}

