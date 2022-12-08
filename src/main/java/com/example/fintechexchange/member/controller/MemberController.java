package com.example.fintechexchange.member.controller;

import com.example.fintechexchange.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/signup")
    public String doSignup(@RequestParam HashMap<String,String> params){

        if(memberService.insertMember(params) > 0){
            return "index";
        }else {
            return "signup";
        }
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam HashMap<String,String> params, HttpSession session){

        String res = memberService.loginMember(params);
        if( res != null){
            session.setAttribute("email", res);
            return "index";
        } else {
            return "login";
        }
    }
}
