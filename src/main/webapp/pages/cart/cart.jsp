<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>购物车</title>
<%@ include file="/WEB-INF/include/base.jsp"%>
<script type="text/javascript">
   $(function(){
	   //为class 是 count_input 绑定一个change 事件
	   $(".count_input").change(function(){
		   //获取修改后的数量
		   var count = this.value;
		   //检查count 是否为一个正整数
		   var reg = /^\+?[1-9][0-9]*$/;
		   if (!reg.test(count)){
			   //值非法，要变回原来的值
			   this.value = this.defaultValue;
			   //填出一个提示框
			   alert("请输入一个正确的数量");
			   return;
		   }
		   //获取图书的id 
		   var bookId = this.name;
		   //创建一个URL
	       var url = "${pageContext.request.contextPath}/client/CartServlet";
		   //设置一个请求参数
		   var params = {
					 "method" : "updateCount",
					 "bookId" : bookId,
					 "count" : count
		   }
	       //获取进金额所在的TD
	       var $td = $(this).parents("tr").find("td:eq(3)");
		   //发送ajax 请求
		   $.post(url,params,function(data){
			    //修改商品的总数量
			    $(".b_count").html(data.totalCount);
			    //总金额
			    $(".b_price").html(data.totalAmount);
			    //修改商品的小计金额
			    $td.html(data.amount);
		   },"json");
	   });
	   
	   
       //为id 为clearCart 的连接绑定一个单击响应函数
       $("#clearCart").click(function(){
    	   //弹出一个确认框
    	   if(!confirm("确认清空购物车吗？")){
    		   //取消默认行为
    		   return false;
    	   }
       });
       
       //为所有的删除按钮绑定一个单击响应函数
       $(".delA").click(function(){
    	   //获取到要删除的图书的名字
    	   var title= $(this).parents("tr").find("td:eq(0)").html();
    	   //弹出一个确认框
    	   if(!confirm("确认删除<"+title+">吗？")){
    		   //取消默认行为
    		   return false;
    	   }
       })
       
       
   })

</script>

</head>
<body>

	<div id="header">
		<img class="logo_img" alt="" src="static/img/logo.png"> <span
			class="wel_word">购物车</span>
		<%@ include file="/WEB-INF/include/user-info.jsp"%>
	</div>

	<div id="main">
      <c:choose>
         <c:when test="${empty cart.cartItems}">
             <br/><br/><br/><br/><br/><br/><br/>
             <h1 align = "center">购物车里面没有商品，赶紧买！</h1>
         </c:when>
         <c:otherwise>
           <table>
			<tr>
				<td>商品名称</td>
				<td>数量</td>
				<td>单价</td>
				<td>金额</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${cart.cartItems }" var ="item">
			<tr>
				<td>${item.book.title }</td>
				<td><input name="${item.book.id}" class ="count_input" type = "text" value = "${item.count }"
				  style="width:30px; text-align:center;" />
				</td>
				<td>${item.book.price }</td>
				<td>${item.amount }</td>
				<td><a class="delA" href="client/CartServlet?method=delCartItem&bookId=${item.book.id}">删除</a></td>
			</tr>
          </c:forEach>
		

		</table>
        	<div class="cart_info">
			<span class="cart_span">购物车中共有<span class="b_count">${cart.totalCount }</span>件商品
			</span> 
			<span class="cart_span">总金额<span class="b_price">${cart.totalAmount }</span>元
			</span> 
			<span class="cart_span"><a id="clearCart" href="client/CartServlet?method=clear">清空购物车</a></span>
 			<span class="cart_span"><a href="client/OrderClientServlet?method=checkOut">去结账</a></span>
		</div> 
         </c:otherwise>
      </c:choose>
		

	

	</div>

	<div id="bottom">
		<span> 东方标准.Copyright &copy;2016 </span>
	</div>
</body>
</html>