package com.jkoss.dao;

import com.jkoss.pojo.UserByAddress;

public interface UserByAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserByAddress record);

    int insertSelective(UserByAddress record);

    UserByAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserByAddress record);

    int updateByPrimaryKey(UserByAddress record);
}