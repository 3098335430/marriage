/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-19 12:57:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/include/base.jsp", Long.valueOf(1497872331354L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>用户注册页面</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<base\r\n");
      out.write("href=\"http://");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(':');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverPort}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"static/css/style.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/script/jquery-1.8.0.js\"></script>");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.login_form{\r\n");
      out.write("\t\theight:420px;\r\n");
      out.write("\t\tmargin-top: 25px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/script/jquery-1.8.0.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t   //点击图片以后刷新图片\r\n");
      out.write("\t   $(\"#code_img\").click(function(){\r\n");
      out.write("\t\t   //要想使得图片属性需要修改img 的src 属性，当src 属性被修改以后，浏览器会自动生成图片\r\n");
      out.write("\t\t   this.src= \"code.jpg?t=\"+Math.random();\r\n");
      out.write("\t   });\r\n");
      out.write("\t   \r\n");
      out.write("\t  // 为提交按钮绑定单击响应函数\r\n");
      out.write("\t  $(\"#sub_btn\").click(function(){\r\n");
      out.write("\t\t  // 获取用户输入的用户名，密码，确认密码，电子邮件，验证码\r\n");
      out.write("\t\t  var name = $(\"[name=username]\").val();\r\n");
      out.write("\t\t  var password = $(\"[name=password]\").val();\r\n");
      out.write("\t\t  var repwd = $(\"[name=repwd]\").val();;\r\n");
      out.write("\t\t  var code = $(\"[name=code]\").val();  \r\n");
      out.write("\t  });  \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<div id=\"login_header\">\r\n");
      out.write("\t\t\t<img class=\"logo_img\" alt=\"\" src=\"static/img/logo.png\" >\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"login_banner\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"l_content\">\r\n");
      out.write("\t\t\t\t\t<span class=\"login_word\">欢迎注册</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"login_form\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"login_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>注册</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"errorMsg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"user/regist.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>用户名称：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"itxt\" type=\"text\" placeholder=\"请输入3-16位的用户名\" autocomplete=\"off\" tabindex=\"1\" name=\"username\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>用户密码：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"itxt\" type=\"password\" placeholder=\"请输入6-18位的密码\" autocomplete=\"off\" tabindex=\"1\" name=\"password\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>确认密码：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"itxt\" type=\"password\" placeholder=\"确认密码\" autocomplete=\"off\" tabindex=\"1\" name=\"repwd\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>验证码：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"itxt\" type=\"text\" style=\"width: 150px;\" name=\"code\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img  id =\"code_img\"alt=\"\" src=\"code.jpg\" style=\"float: right; margin-right: 40px;width:90px ; height:45px\">\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"注册\" id=\"sub_btn\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div id=\"bottom\">\r\n");
      out.write("\t\t\t<span>\r\n");
      out.write("\t\t\t\t服务外包;2017\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}