package com.jkoss.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jkoss.pojo.User;
import com.jkoss.tool.Page;

@Controller
@RequestMapping("/mgr/")
public class UserCtrl {

	@Autowired
	private com.jkoss.biz.UserBiz ubiz;
	
	
	//登录
	@RequestMapping("lgn.do")
	public String login(String loginName,String password,HttpServletRequest req){
		
		User usr= ubiz.login(loginName, password);
		if(usr!=null){
			if(!usr.getUserType().equals("1")){
				//
				req.setAttribute("msg", "请使用管理员账号登录");
				return "/welcome.jsp";   //商城的首页
			}
			req.getSession().setAttribute("usr", usr);
			return "/welcome.jsp";
		}
		req.setAttribute("msg", "登录失败");
		return "/welcome.jsp";
	}
	
	@RequestMapping("adlgn.do")
	public String adminlogin(String loginName,String password,HttpServletRequest req){
		
		User usr= ubiz.login(loginName, password);
		if(usr!=null){
			if(usr.getUserType().equals("1")){
				req.getSession().setAttribute("usr", usr);
				return "/main.jsp";
			}
		}
		return "/welcome.jsp";
	}
	
	//登出
	@RequestMapping("lgout.do")
	public String logout(HttpServletRequest req,ModelMap map){
		req.getSession().invalidate();   //失效
		map.addAttribute("msg", "欢迎下次再来");
		return "redirect:/welcome.jsp";
	}
	
	//可出用户
	@RequestMapping("listUsr.do")
	public String listUserAtPage(HttpServletRequest req,Page<User> page){
	 
		if(page==null){
			page = new Page<User>();
		}
		
		page.setResults(ubiz.findUsersAtPage(page));
		page.setTotalRecord(ubiz.countAllUsers());
		req.setAttribute("page", page);
		
		return "/mgr/listuser.jsp";
	}
	
	////准备更新
	@RequestMapping("updtUsr1.do")
	public String updateUser1(HttpServletRequest req,int uid){
		req.setAttribute("toUpdtUser", ubiz.findUserByID(uid));
		return "/mgr/mergeUsr.jsp";
	}
	
    ////完成更新
	@RequestMapping("updtUsr2.do")
	public String updateUser2(HttpServletRequest req,User updusr){
		System.out.println(updusr.getUserName().length()+":"+updusr.getUserName());
		updusr.setUserName(updusr.getUserName().trim());
		ubiz.updateUser(updusr);
	 
		return  listUserAtPage(req,null);
	}
	
	
}
