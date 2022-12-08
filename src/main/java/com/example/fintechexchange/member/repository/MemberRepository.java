package com.example.fintechexchange.member.repository;

import com.example.fintechexchange.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper memberMapper;

    public int insertMember(HashMap<String,String> params){
        return memberMapper.insertMember(params);
    }
    public String loginMember(HashMap<String,String> params){
        return memberMapper.loginMember(params);
    }
    public Float selectMoney(String email) { return memberMapper.selectMoney(email); }
    public int updateMoney(HashMap<String,String> params) { return memberMapper.updateMoney(params); }
}
