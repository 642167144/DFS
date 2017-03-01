package com.jkoss.spring.ex;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

//自定义全�?异常处理�?
public class FullExceptionResolver implements HandlerExceptionResolver {

	private String errPage;  //异常处理页面
	private String unkownerrPage;   
	//已定义的异常处理:异常的消�?
	private Map<String,String>  errMsgMap = new HashMap();
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handlerMethod,
			Exception ex) {
 
		// 集中处理异常
		ModelAndView mv = new ModelAndView();
		
		if(errMsgMap.get(ex.getClass().getName())!=null){   //是否是已定义的异�?
			mv.addObject("msg",errMsgMap.get(ex.getClass().getName()));
			mv.setViewName(errPage);
		}else{
			mv.addObject("msg", "未知异常，请联系管理员处�?");
			mv.setViewName(unkownerrPage);
		}
		
		return mv;
	}

	public void setErrPage(String errPage) {
		this.errPage = errPage;
	}

	public void setErrMsgMap(Map<String, String> errMsgMap) {
		this.errMsgMap = errMsgMap;
	}
	
	public void setUnkownerrPage(String unkownerrPage) {
		this.unkownerrPage = unkownerrPage;
	}
	

}
