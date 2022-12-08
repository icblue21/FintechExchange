package com.example.fintechexchange.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface BuyMapper {
    public int insertBuy(HashMap<String,String> params);
    public ArrayList<HashMap<String,Object>> selectBuy(String email);
}
