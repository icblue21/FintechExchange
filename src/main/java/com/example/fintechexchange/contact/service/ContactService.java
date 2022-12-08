package com.example.fintechexchange.contact.service;

import com.example.fintechexchange.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public int insertContact(HashMap<String,String> params) { return contactRepository.insertContact(params); }
}
