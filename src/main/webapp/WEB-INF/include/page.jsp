<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <div id="page_nav">
        <c:choose>
           <c:when test="${page.totalPage <= 5 }">
             <c:set var="begin" value="1"></c:set>
             <c:set var="end" value="${page.totalPage}"></c:set>
           </c:when>
           <c:when test="${page.pageNumber <= 3 }">
             <c:set var="begin" value="1"></c:set>
             <c:set var="end" value="5"></c:set>
           </c:when>      
           <c:otherwise>
            <c:set var="begin" value="${page.pageNumber-2}"></c:set>
           <c:set var="end" value="${page.pageNumber + 2 }"></c:set>
             <c:if test="${end > page.totalPage }">
                <c:set var="end" value="${ page.totalPage }"></c:set>
                 <c:set var="begin" value="${end -4 }"></c:set>
             </c:if>
           </c:otherwise>
        </c:choose>
      
		<a href="${page.path }&pageNumber=1">首页</a>
		<a href="${page.path }&pageNumber=${page.pageNumber - 1 }">上一页</a>
		<!-- 遍历页码 -->
		<c:forEach begin="${begin}" end ="${end}" var = "index">
		   <c:choose>
		      <c:when test="${page.pageNumber == index }">
		         <span style="color:red" >[${index}]</span>
		      </c:when>
		  
		  <c:otherwise>
		   <a href="${page.path }&pageNumber=${index}">
		     ${index} 
		   </a>
		  </c:otherwise>
		   </c:choose>
		</c:forEach>
		<a href="${page.path }&pageNumber=${page.pageNumber + 1 }">下一页</a>
		<a href="${page.path }&pageNumber=${page.totalPage }">末页</a>
		共${page.totalPage }页，${page.totalRecord }条记录 到第<input value="${page.pageNumber }" name="pn" id="pn_input"/>页
		<input id="pn_btn" type="button" value="确定">
		  <script type="text/javascript">
		      //为按钮绑定一个单击响应函数
		      $("#pn_btn").click(function(){
		    	   //获取到要跳转的页码
		    	   var pageNumber = $("#pn_input").val();
		    	   //跳转到指定页面
		    	   //通过修改window.location 属性跳转到另外一个页面
		    	   window.location = "${page.path }&pageNumber=" +pageNumber;
		      });
		  
		  </script>
		</div>
</body>
</html>