<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文章</title>
<%@ include file="/WEB-INF/include/base.jsp"%>
</head>
<body>
	<div id="header">
		<img class="logo_img" alt="" src="static/img/logo.png"> <span
			class="wel_word">婚姻法</span>
		<%@ include file="/WEB-INF/include/manager-info.jsp"%>
	</div>
	<center>
		<h1>${ requestScope.title}</h1>
		<textarea style="height: 450px; width: 900px; resize: none">${requestScope.content}
</textarea>
	</center>


</body>
</html>