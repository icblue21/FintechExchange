package com.example.fintechexchange.buy.controller;

import com.example.fintechexchange.buy.service.BuyService;
import com.example.fintechexchange.charge.service.ChargeService;
import com.example.fintechexchange.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class BuyRestController {

    @Autowired
    BuyService buyService;
    @Autowired
    MemberService memberService;
    @Autowired
    ChargeService chargeService;

    @GetMapping("/checkBalance")
    public String checkBalance(@RequestParam("total") String balance, HttpSession session){

        if( session.getAttribute("email") == null){
            return "login";
        }
        String email = session.getAttribute("email").toString();
        Float money = memberService.selectMoney(email);

        if( money >= Float.parseFloat(balance) ){
            return "can";
        } else {
            return "cannot";
        }
    }

    @GetMapping("/buyList")
    public ArrayList<HashMap<String,Object>> buyList(HttpSession session){

        String email = session.getAttribute("email").toString();

        return buyService.selectBuy(email);
    }

    @GetMapping("/pointList")
    public ArrayList<HashMap<String,Object>> pointList(HttpSession session){

        String email = session.getAttribute("email").toString();

        return chargeService.selectPayment(email);
    }
}
