package com.example.fintechexchange.subscribe.repository;

import com.example.fintechexchange.mapper.SubscribeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SubscribeRepository {

    @Autowired
    SubscribeMapper subscribeMapper;

    public int insertSubscribe(String email) { return subscribeMapper.insertSubscribe(email); }

}
