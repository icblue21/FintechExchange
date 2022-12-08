package com.example.fintechexchange.buy.controller;

import com.example.fintechexchange.buy.service.BuyService;
import com.example.fintechexchange.charge.service.ChargeService;
import com.example.fintechexchange.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class BuyController {

    @Autowired
    BuyService buyService;
    @Autowired
    MemberService memberService;

    @PostMapping("/buyCoin")
    public String buyCoin(@RequestParam("price") float price,
                          @RequestParam("coinId") String coinId,
                          @RequestParam("name") String coinName,
                          @RequestParam("amount") int coinAmount,
                          @RequestParam("total") float total, HttpSession session) {

        HashMap<String,String> moneyMap = new HashMap<>();
        HashMap<String,String> buyMap = new HashMap<>();
        String email = session.getAttribute("email").toString();
        Float money = memberService.selectMoney(email);
        money = money - total;

        moneyMap.put("email",email);
        moneyMap.put("money",Float.toString(money));
        memberService.updateMoney(moneyMap);

        buyMap.put("email",email);
        buyMap.put("coinId",coinId);
        buyMap.put("name",coinName);
        buyMap.put("price",Float.toString(price));
        buyMap.put("amount", Integer.toString(coinAmount));
        buyMap.put("total",Float.toString(total));

        buyService.insertBuy(buyMap);

        return "index";
    }
}
