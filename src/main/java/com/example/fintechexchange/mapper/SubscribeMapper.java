package com.example.fintechexchange.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubscribeMapper {

    public int insertSubscribe(String email);
}
