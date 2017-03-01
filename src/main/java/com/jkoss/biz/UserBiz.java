package com.jkoss.biz;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.jkoss.pojo.User;
import com.jkoss.tool.Page;

public interface UserBiz {

	User login(String userName,String userPwd);
	List<User> findUsersAtPage(Page page);
	int countAllUsers();
	User findUserByID(int uid);
	void updateUser(User usr);
	
}
