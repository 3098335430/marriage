<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div>
	<a href="manager/BookManagerServlet?method=findBook">图书管理</a> 
	<a href="manager/OrderManagerServlet?method=orderList">订单管理</a>
	<a href="index.jsp">返回商城</a>
	<a href="index.jsp">返回商城</a>
	<a href="index.jsp">返回商城</a>
</div>
<div>
<ul>
<li>
<form action="listDocument.do" method="post">
<input type="submit" value="经典案例"  />
</form>
</li>
<li>
<form action="listAdvice.do" method="post">
<input type="submit" value="建议"  />
</form>
</li>
<li>
<form action="listLaw.do" method="post">
<input type="submit" value="婚姻法"  />
</form>
</li>
<li>
<form action="listUser.do" method="post">
<input type="submit" value="用户管理"  />
</form>
</li>
<li>
<form action="listCase.do" method="post">
<input type="submit" value="案件类型" />
</form>
</li>
</ul>

</div>
<div style="clear:both;"></div>
