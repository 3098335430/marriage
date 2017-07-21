<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加用户</title>
<%@ include file="/WEB-INF/include/base.jsp"%>
<style type="text/css">
.login_form {
	height: 420px;
	margin-top: 25px;
}
</style>
<script type="text/javascript" src="static/script/jquery-1.8.0.js"></script>
<script type="text/javascript">
	   
	  // 为提交按钮绑定单击响应函数
	  $("#sub_btn").click(function(){
		  // 获取用户输入的用户名，密码
		  var name = $("[name=username]").val();
		  var password = $("[name=password]").val();
	  });  

</script>

</head>
<body>
<div id="header">
		<img class="logo_img" alt="" src="static/img/logo.png"> 
		<span class="wel_word">婚姻法</span>
		 <%@ include file="/WEB-INF/include/manager-info.jsp" %>
	</div>
	<div id="main">
	<center>
	<br><br><br>
	<div class="form">
		<form action="user/addUser.do" method="post">
			<label>用户名称：</label> 
			<input value="${param.username }" class="itxt"
				type="text" placeholder="请输入3-16位的用户名" autocomplete="off"
				tabindex="1" name="username" /> <br /> <br /> 
			<label>用户密码：</label>
			<input class="itxt" type="password" placeholder="请输入6-18位的密码"
				autocomplete="off" tabindex="1" name="password" /> <br /> <br />
		 <input type="submit" value="添加" id="sub_btn" />

		</form>
	</div>
</center>
</div>
	<div id="bottom">
		<span> 服务外包;2017 </span>
	</div>
</body>
</html>