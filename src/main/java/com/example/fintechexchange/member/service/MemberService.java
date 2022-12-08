package com.example.fintechexchange.member.service;

import com.example.fintechexchange.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;
    public int insertMember(HashMap<String,String> params){
        return memberRepository.insertMember(params);
    }
    public String loginMember(HashMap<String,String> params){
        return memberRepository.loginMember(params);
    }

    public Float selectMoney(String email) { return memberRepository.selectMoney(email); }
    public int updateMoney(HashMap<String,String> params) { return memberRepository.updateMoney(params); }
}
