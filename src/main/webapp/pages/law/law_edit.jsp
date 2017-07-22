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
<title>添加文档</title>
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
		  var law = $("[name=law]").val();
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
		<form action="law/addLaw" method="post">
			<label>法律：</label> 
			<input value="${param.lawContent }" class="itxt"
				type="text" autocomplete="off" tabindex="1" name="lawContent" />
				 <br /> <br /> 
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