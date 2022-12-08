package com.example.fintechexchange.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface MemberMapper {

    public int insertMember(HashMap<String, String> params);
    public String loginMember(HashMap<String,String> params);

    public Float selectMoney(String email);

    public int updateMoney(HashMap<String,String> params);

}
