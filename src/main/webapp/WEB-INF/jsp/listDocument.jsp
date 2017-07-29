<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>经典案例</title>
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
			  
		  	location.href="user/listDocument?curr=" + (curr - 1);
		  }
	  });
			
		$("#down").click(function(){
			var curr = $("#curr").val();
			var cs = $("#cs").val();
			
			if(curr - 1 + 1 >= cs){
				
			}else{
				if(curr=1){}
				else{
					location.href="user/listDocument?curr=" + (curr - 1 + 2);

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
		<img class="logo_img" alt="" src="static/img/logo1.png"> <span
			class="wel_word">婚姻法</span>
		<%@ include file="/WEB-INF/include/manager-info.jsp"%>
	</div>
	<div id="main">
		<table>
			<c:choose>
				<c:when test="${empty us}">
					<tr>
						<td colspan="7">当前无文档！</td>
					</tr>
				</c:when>
				<c:otherwise>
					<tr>
						<td>标题</td>
						<td>内容</td>
						<td>标签</td>
						<td colspan="2">操作</td>
					</tr>
					<c:forEach items="${us}" var="document">
						<tr>
							<td>${fn:substring(document.title,0,15)}</td>
							<td>${fn:substring(document.content,0,15)}</td>
							<td>${document.label}</td>
							<td><a href="document/toUpdateDocument?did=${document.did}">修改</a>
							</td>
							<td><a class="delA"
								href="document/delDocument?did=${document.did}">删除</a></td>
							<td><a href="document/detailDocument?did=${document.did}">查看详情</a>
							</td>
						</tr>
					</c:forEach>

				</c:otherwise>
			</c:choose>

			<tr>
				<td></td>
				<td><button id="up">上一页</button></td>
				<td><button id="down">下一页</button></td>
				<td><a href="pages/document/document_edit.jsp">添加文档</a></td>
			</tr>
		</table>


	</div>

	<div id="bottom">
		<span> 婚姻司法智能咨询辅助系统;2017 </span>
	</div>
</body>
</html>