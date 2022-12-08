package com.example.fintechexchange.charge.service;

import com.example.fintechexchange.charge.repository.ChargeRepository;
import com.example.fintechexchange.mapper.ChargeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class ChargeService {

    @Autowired
    ChargeRepository chargeRepository;

    public int insertPayment(HashMap<String,String> params){
        return chargeRepository.insertPayment(params);
    }

    public HashMap<String,String> checkMemberFromPayment(String email){
        return chargeRepository.checkMemberFromPayment(email);
    }
    public int updatePayment(HashMap<String,String> params){
        return chargeRepository.updatePayment(params);
    }

    public String selectAmount(String email){ return chargeRepository.selectAmount(email); }

    public ArrayList<HashMap<String,Object>> selectPayment(String email) { return chargeRepository.selectPayment(email); }
}
