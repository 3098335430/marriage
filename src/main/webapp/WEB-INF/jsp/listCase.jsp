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
<title>案件类型管理</title>
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
			  
		  	location.href="user/listCase?curr=" + (curr - 1);
		  }
	  });
			
		$("#down").click(function(){
			var curr = $("#curr").val();
			var cs = $("#cs").val();
			
			if(curr - 1 + 1 >= cs){
				
			}else{
				if(curr=1){}
				else{
					location.href="user/listCase?curr=" + (curr - 1 + 2);

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
	</div>
	<div id="main">
		<table>
			<c:choose>
				<c:when test="${empty cs}">
					<tr>
						<td colspan="7">当前无案件类型！</td>
					</tr>
				</c:when>
				<c:otherwise>
					<tr>
						<td>案件类型</td>
						<td colspan="2">操作</td>
					</tr>
					<c:forEach items="${cs}" var="case">
						<tr>
							<td>${cs.type}</td>

							<td><a href="user/toUpdateUser?userId=${user.userId}">修改</a></td>
							<td><a class="delA"
								href="user/delUser?userId=${user.userId}">删除</a></td>
						</tr>
					</c:forEach>

				</c:otherwise>
			</c:choose>

			<tr>
				<td></td>
				<td><button id="up">上一页</button></td>
				<td><button id="down">下一页</button></td>
				<td><a href="pages/user/user_edit.jsp">添加案例</a></td>
			</tr>
		</table>


	</div>

	<div id="bottom">
		<span> 婚姻司法智能咨询辅助系统;2017 </span>
	</div>
</body>
</html>