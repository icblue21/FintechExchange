package com.example.fintechexchange.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface ContactMapper {

    public int insertContact(HashMap<String,String> params);
}
