<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出错了</title>
<%@ include file="/WEB-INF/include/base.jsp" %>
<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
	
	h1 a {
		color:red;
	}
	
	input {
		text-align: center;
	}
</style>
</head>
<body>
 
		<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.png" >
			<span class="wel_word">编辑图书</span>
			 <%@ include file="/WEB-INF/include/manager-info.jsp" %>
		</div>
		
		<h1>${error }</h1>
		
		<div id="bottom">
			<span>
				东方标准.Copyright &copy;2016
			</span>
		</div>
</body>
</html>