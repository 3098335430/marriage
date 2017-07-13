<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>帐户详情</title>
</head>
<body>
	<form action="/user/updateUser" method="post">
			<label>id：</label> 
			<input value="${ user.userId}" class="itxt"
				type="text" readonly="readonly"
				tabindex="1" name="userId" /> <br /> <br /> 
			<label>用户名称：</label> 
			<input value="${ user.username}" class="itxt"
				type="text" placeholder="" autocomplete="off"
				tabindex="1" name="username" /> <br /> <br /> 
			<label>用户密码：</label>
			<input class="itxt" type="password"
				value="${ user.password}" tabindex="1" name="password" /> <br /> <br />
		 <input type="submit" value="添加" id="sub_btn" />

		</form>
</body>
</html>