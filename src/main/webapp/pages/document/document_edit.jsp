<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		  var title = $("[name=title]").val();
		  var content = $("[name=content]").val();
		  var label = $("[name=label]").val();
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
	<div class="form.itxt">
		<form action="/document/addDocument.do" method="post">
			<label>文档名：</label> 
			<input value="${param.title }" class="itxt"
				type="text" autocomplete="off" tabindex="1" name="title" />
				 <br /> <br /> 
			<label>文档内容：</label>
			<input class="itxt" type="content" autocomplete="off" tabindex="1" name="content" />
			 <br /> <br />
			 <label>标签：</label>
			<input class="itxt" type="content" autocomplete="off" tabindex="1" name="label" />
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