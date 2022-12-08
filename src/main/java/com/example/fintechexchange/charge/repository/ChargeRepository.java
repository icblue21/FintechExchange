package com.example.fintechexchange.charge.repository;

import com.example.fintechexchange.mapper.ChargeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class ChargeRepository {

    @Autowired
    ChargeMapper chargeMapper;

    public int insertPayment(HashMap<String,String> params){
        return chargeMapper.insertPayment(params);
    }

    public HashMap<String,String> checkMemberFromPayment(String email){
        return chargeMapper.checkMemberFromPayment(email);
    }
    public int updatePayment(HashMap<String,String> params){
        return chargeMapper.updatePayment(params);
    }
    public String selectAmount(String email){ return chargeMapper.selectAmount(email); }

    public ArrayList<HashMap<String,Object>> selectPayment(String email) { return chargeMapper.selectPayment(email); }
}
