<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册页面</title>
<%@ include file="/WEB-INF/include/base.jsp" %>
<style type="text/css">
	.login_form{
		height:420px;
		margin-top: 25px;
	}
	
</style>
<script type="text/javascript" src="static/script/jquery-1.8.0.js" ></script>
<script type="text/javascript">
	   //点击图片以后刷新图片
	   $("#code_img").click(function(){
		   //要想使得图片属性需要修改img 的src 属性，当src 属性被修改以后，浏览器会自动生成图片
		   this.src= "code.jpg?t="+Math.random();
	   });
	   
	  // 为提交按钮绑定单击响应函数
	  $("#sub_btn").click(function(){
		  // 获取用户输入的用户名，密码，确认密码，电子邮件，验证码
		  var name = $("[name=username]").val();
		  var password = $("[name=password]").val();
		  var repwd = $("[name=repwd]").val();;
		  var code = $("[name=code]").val();  
	  });  

</script>

</head>
<body>
		<div id="login_header">
			<img class="logo_img" alt="" src="static/img/logo.png" >
		</div>
		
			<div class="login_banner">
			
				<div id="l_content">
					<span class="login_word">欢迎注册</span>
				</div>
				
				<div id="content">
					<div class="login_form">
						<div class="login_box">
							<div class="tit">
								<h1>注册</h1>
								<span class="errorMsg">${msg}</span>
							</div>
							<div class="form">
								<form action="user/regist.do" method="post">
									<label>用户名称：</label>
									<input value= "${param.username }"
									class="itxt" type="text" placeholder="请输入3-16位的用户名" autocomplete="off" tabindex="1" name="username" />
									<br />
									<br />
									<label>用户密码：</label>
									<input class="itxt" type="password" placeholder="请输入6-18位的密码" autocomplete="off" tabindex="1" name="password" />
									<br />
									<br />
									<label>确认密码：</label>
									<input class="itxt" type="password" placeholder="确认密码" autocomplete="off" tabindex="1" name="repwd" />
									<br />
									<br />
									<label>验证码：</label>
									<input class="itxt" type="text" style="width: 150px;" name="code" />
									<img  id ="code_img"alt="" src="code.jpg" style="float: right; margin-right: 40px;width:90px ; height:45px">									
									<br />
									<br />
									<input type="submit" value="注册" id="sub_btn" />
									
								</form>
							</div>
							
						</div>
					</div>
				</div>
			</div>
		<div id="bottom">
			<span>
				服务外包;2017
			</span>
		</div>
</body>
</html>