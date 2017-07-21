<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>经典案例</title>
<%@ include file="/WEB-INF/include/base.jsp"%>
</head>
<body>
	<input type="hidden" value="${curr }" id="curr">
	<input type="hidden" value="${countSize }" id="cs">
	<div id="header">
		<img class="logo_img" alt="" src="static/img/logo.png"> 
		<span class="wel_word">婚姻法</span>
		 <%@ include file="/WEB-INF/include/manager-info.jsp" %>
	</div>
	<div id="main">
		<table>
			<c:choose>
				<c:when test="${empty document}">
					<tr>
						<td colspan="7">当前无文档！</td>
					</tr>
				</c:when>
				<c:otherwise>
					<tr>
						<td>标题</td>
						<td>内容</td>
					</tr>
					<c:forEach items="${document}" var="document">
						<tr>
							<td>${fn:substring(document.title,0,15)}</td>
							<td>${fn:substring(document.content,0,15)}</td>
							<td>
							<a  href="document/detailDocument?did=${document.did}">查看详情</a>
							</td>
						</tr>
					</c:forEach>

				</c:otherwise>
			</c:choose>
		</table>


	</div>

	<div id="bottom">
		<span> 服务外包;2017 </span>
	</div>
</body>
</html>