<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/advice/updateAdvice" method="post">
			<label>aid：</label> 
			<input value="${advice.aid}" class="itxt"
				type="text" readonly="readonly"
				tabindex="1" name="aid" /> <br /> <br /> 
			<label>建议：</label> 
			<input value="${ advice.advice}" class="itxt"
				type="text" placeholder="" autocomplete="off"
				tabindex="1" name="advice" /> <br /> <br /> 
		 <input type="submit" value="添加" id="sub_btn" />

		</form>
</body>
</html>