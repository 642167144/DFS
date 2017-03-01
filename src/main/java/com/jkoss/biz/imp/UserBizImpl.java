package com.jkoss.biz.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jkoss.biz.UserBiz;
import com.jkoss.dao.UserMapper;
import com.jkoss.pojo.User;
import com.jkoss.tool.Page;

@Component
public class UserBizImpl  implements UserBiz{

	/**
	 *
	 */
	@Autowired
	private UserMapper udao;
	
	public User login(String userName,String userPwd){
		User tmp =udao.selectByName(userName);
		if(tmp!=null && tmp.getUserPwd().equals(userPwd)){
			return tmp;
		}
		return null;
	}
	
	
	public User findUserByID(int uid){
		return udao.selectByPrimaryKey(uid);
	}
	
	@Transactional
	public void updateUser(User usr){
		  udao.updateByPrimaryKey(usr);
	}


	@Override
	public List<User> findUsersAtPage(Page page) {
		// TODO Auto-generated method stub
		return udao.selectAtPage(page);
	}


	@Override
	public int countAllUsers() {
		// TODO Auto-generated method stub
		return udao.countAll();
	}
	
}
