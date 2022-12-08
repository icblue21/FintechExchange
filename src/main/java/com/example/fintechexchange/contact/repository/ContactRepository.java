package com.example.fintechexchange.contact.repository;

import com.example.fintechexchange.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper contactMapper;

    public int insertContact(HashMap<String,String> params) { return contactMapper.insertContact(params); }
}
