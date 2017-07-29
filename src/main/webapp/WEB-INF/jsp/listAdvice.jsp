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
<title>建议管理</title>
<%@ include file="/WEB-INF/include/base.jsp"%>
<script type="text/javascript">
   $(function(){
	   
	  //为delA 绑定单击响应函数
	  $(".delA").click(function(){
		  //获取要删除的图书的名字
		  var title = $(this).parents("tr").find("td:eq(0)").html();
		  //弹出一个确认框
		  if (!confirm("确认删除" + title + "吗？")){
			  //如果点了取消，则取消默认行为
			  return false;
		  }
	  });
	  
	  $("#up").click(function(){
		  var curr = $("#curr").val();
		  if(curr > 1){
			  
		  	location.href="user/listAdvice?curr=" + (curr - 1);
		  }
	  });
			
		$("#down").click(function(){
			var curr = $("#curr").val();
			var cs = $("#cs").val();
			
			if(curr - 1 + 1 >= cs){
				
			}else{
				if(curr=1){}
				else{
					location.href="user/listAdvice?curr=" + (curr - 1 + 2);
	
				}				
			}
	  });
   })
</script>
</head>
<body>
	<input type="hidden" value="${curr }" id="curr">
	<input type="hidden" value="${countSize }" id="cs">
	<div id="header">
		<img class="logo_img" alt="" src="static/img/logo.png"> <span
			class="wel_word">婚姻法</span>
		<%@ include file="/WEB-INF/include/manager-info.jsp"%>
	</div>
	<div id="main">
		<table>
			<c:choose>
				<c:when test="${empty us}">
					<tr>
						<td colspan="7">当前无建议！</td>
					</tr>
				</c:when>
				<c:otherwise>
					<tr>
						<td>建议</td>
						<td colspan="2">操作</td>
					</tr>
					<c:forEach items="${us}" var="advice">
						<tr>
							<td>${advice.advice}</td>

							<td><a href="advice/toUpdateAdvice?aid=${advice.aid}">修改</a></td>
							<td><a class="delA"
								href="advice/delAdvice?aid=${advice.aid}">删除</a></td>
						</tr>
					</c:forEach>

				</c:otherwise>
			</c:choose>

			<tr>
				<td></td>
				<td><button id="up">上一页</button></td>
				<td><button id="down">下一页</button></td>
				<td><a href="pages/advice/advice_edit.jsp">添加建议</a></td>
			</tr>
		</table>


	</div>

	<div id="bottom">
		<span> 婚姻司法智能咨询辅助系统;2017 </span>
	</div>
</body>
</html>