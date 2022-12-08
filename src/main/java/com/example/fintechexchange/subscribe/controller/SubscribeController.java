package com.example.fintechexchange.subscribe.controller;

import com.example.fintechexchange.subscribe.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubscribeController {

    @Autowired
    SubscribeService subscribeService;

    @PostMapping("/subscribe")
    public String subscribe(@RequestParam String email){

        subscribeService.insertSubscribe(email);

        return "index";
    }
}
