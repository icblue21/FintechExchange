package com.example.fintechexchange.contact.controller;

import com.example.fintechexchange.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping("/requestCall")
    public String requestCall(@RequestParam HashMap<String,String> params){

        contactService.insertContact(params);

        return "index";
    }
}
