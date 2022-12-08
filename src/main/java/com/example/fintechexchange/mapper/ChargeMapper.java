package com.example.fintechexchange.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface ChargeMapper {

    public int insertPayment(HashMap<String,String> params);
    public HashMap<String,String> checkMemberFromPayment(String email);
    public int updatePayment(HashMap<String,String> params);
    public String selectAmount(String email);
    public ArrayList<HashMap<String,Object>> selectPayment(String email);
}
