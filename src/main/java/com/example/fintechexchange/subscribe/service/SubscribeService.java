package com.example.fintechexchange.subscribe.service;

import com.example.fintechexchange.subscribe.repository.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscribeService {

    @Autowired
    SubscribeRepository subscribeRepository;

    public int insertSubscribe(String email) { return subscribeRepository.insertSubscribe(email); }
}
