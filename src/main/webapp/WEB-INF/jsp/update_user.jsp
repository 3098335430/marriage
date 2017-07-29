<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>帐户详情</title>
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
			<form action="user/updateUser" method="post">
				<label>用户id：</label> <input value="${ user.userId}" class="itxt"
					type="text" readonly="readonly" tabindex="1" name="userId"
					style="width: 800px; height: 60px" /> <br /> <br /> <label>用户名称：</label>
				<input value="${ user.username}" class="itxt" type="text"
					placeholder="" autocomplete="off" tabindex="1" name="username"
					style="width: 800px; height: 60px" /> <br /> <br /> <label>用户密码：</label>
				<input class="itxt" type="password" value="${ user.password}"
					tabindex="1" name="password" style="width: 800px; height: 60px" />
				<br /> <br /> <input type="submit" value="修改" id="sub_btn" />

			</form>
		</center>
	</div>
</body>
</html>