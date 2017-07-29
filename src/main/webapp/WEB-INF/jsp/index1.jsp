<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>
<%@ include file="/WEB-INF/include/base.jsp"%>
</head>
<body>
	<div id="header">
		<img class="logo_img" alt="" src="static/img/logo.png"> <span
			class="wel_word">婚姻法</span>
		<%@ include file="/WEB-INF/include/manager-info.jsp"%>
	</div>
	<div id="main">
		<center>
			<br>
			<br>
			<br>
			<br>
			<br>
			<form action="user/listDocument.do" method="post">
				<input type="submit" value="经典案例" id="sub_btn" />
			</form>
			<form action="user/listAdvice.do" method="post">
				<input type="submit" value="建议" id="sub_btn" />
			</form>
			<form action="user/listLaw.do" method="post">
				<input type="submit" value="婚姻法" id="sub_btn" />
			</form>
			<form action="user/listUser.do" method="post">
				<input type="submit" value="用户管理" id="sub_btn" />
			</form>
		</center>
	</div>
</body>
</html>