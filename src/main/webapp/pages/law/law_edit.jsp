<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加文档</title>
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
	<div class="form">
		<form action="/law/addlaw.do" method="post">
			<label>法律：</label> 
			<input value="${param.law }" class="itxt"
				type="text" autocomplete="off" tabindex="1" name="title" />
				 <br /> <br /> 
		 <input type="submit" value="添加" id="sub_btn" />

		</form>
	</div>

	</div>
	</div>
	</div>
	</div>
	<div id="bottom">
		<span> 服务外包;2017 </span>
	</div>
</body>
</html>