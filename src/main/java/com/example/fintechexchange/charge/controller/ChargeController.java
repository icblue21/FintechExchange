package com.example.fintechexchange.charge.controller;

import com.example.fintechexchange.charge.service.ChargeService;
import com.example.fintechexchange.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class ChargeController {

    @Autowired
    ChargeService chargeService;
    @Autowired
    MemberService memberService;

    @GetMapping("/point")
    public String doCharge(@RequestParam("amount") String amount, HttpSession session){

        HashMap<String,String> mapPayment = new HashMap<>();
        HashMap<String,String> mapMoney = new HashMap<>();
        String email = session.getAttribute("email").toString();
        Float money = memberService.selectMoney(email);
        if( money == null ){
            money = 0f;
        }
        money = money + Float.parseFloat(amount);

        mapPayment.put("email",email);
        mapPayment.put("amount", amount);
        mapMoney.put("email",email);
        mapMoney.put("money",Float.toString(money));

        chargeService.insertPayment(mapPayment);
        memberService.updateMoney(mapMoney);

        return "pay";
    }
}
