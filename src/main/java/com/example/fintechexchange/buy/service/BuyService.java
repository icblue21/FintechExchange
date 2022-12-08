package com.example.fintechexchange.buy.service;

import com.example.fintechexchange.buy.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class BuyService {

    @Autowired
    BuyRepository buyRepository;

    public int insertBuy(HashMap<String,String> params) { return buyRepository.insertBuy(params); }

    public ArrayList<HashMap<String,Object>> selectBuy(String email) { return buyRepository.selectBuy(email); }
}
