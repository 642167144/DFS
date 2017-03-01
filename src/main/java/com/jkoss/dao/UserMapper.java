package com.jkoss.dao;

import java.util.List;

import com.jkoss.pojo.User;
import com.jkoss.tool.Page;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);
    
    User selectByName(String Name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectAtPage(Page page);
    int countAll();
}