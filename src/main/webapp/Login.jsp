<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="df" uri="http://www.jkoss.com/mytaglib"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="mgr/lgn.do" name="myform" method="post"
		onSubmit="return checkLogin()">
		用户名:<input id="loginName" name="loginName">
		密码:<input id="password" type="password" name="password">
		<input type="submit" value="登录">
	</form>
</body>
</html>