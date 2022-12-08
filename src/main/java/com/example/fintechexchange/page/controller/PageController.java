package com.example.fintechexchange.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/goLogin")
    public String login(){
        return "login";
    }

    @GetMapping("/goHistory")
    public String history(HttpSession session){

        if( session.getAttribute("email") == null ) {
            return "login";
        }

        return "history";
    }

    @GetMapping("/goMarket")
    public String market(HttpSession session){
        return "market";
    }

    @GetMapping("/goPay")
    public String pay(HttpSession session){

        if( session.getAttribute("email") == null ) {
            return "login";
        }

        return "pay";
    }

    @GetMapping("/goSignup")
    public String signup(){
        return "signup";
    }

}
