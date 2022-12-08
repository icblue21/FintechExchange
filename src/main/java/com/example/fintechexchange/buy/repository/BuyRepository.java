package com.example.fintechexchange.buy.repository;

import com.example.fintechexchange.mapper.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class BuyRepository {

    @Autowired
    BuyMapper buyMapper;

    public int insertBuy(HashMap<String,String> params) { return buyMapper.insertBuy(params); }

    public ArrayList<HashMap<String,Object>> selectBuy(String email) { return buyMapper.selectBuy(email); }
}
