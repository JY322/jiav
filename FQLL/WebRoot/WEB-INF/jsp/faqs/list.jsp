<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


  </head>
  
  <body>
  <center>
  	<h1 style="color: red">常见问题</h1>
  	<a href="faqs/toAdd.do">添加常见问题</a>
  	<c:if test="${pageBean.list != null }">
	    <table border="1" cellspacing="0">
	  		<tr>
	  			<th>编号</th>
	  			<th>标题</th>
	  			<th>创建时间</th>
	  			<th>所属部门</th>
	  			<th colspan="2">操作</th>
	  		</tr>
	  		<c:forEach items="${pageBean.list }" var="f">
				<tr>
					<td align="center">${f.id }</td>
					<td align="center">${f.title }</td>
					<td align="center">${f.createdate }</td>
					<td align="center">${f.cla.cname }</td>
					<td width="10%" colspan="2">
						<a href="faqs/delete.do?id=${f.id }" onclick="return confirm('确认删除么？')">删除</a>
					</td>
				</tr>
			</c:forEach>
	  	</table>
	  	<br/>
  	</c:if>
  	
  	<div>

		<c:choose>
		<c:when test="${pageBean.currPage != 1}">
		<a href="faqs/faqsfind.do?page=1">首页</a>&nbsp;
		<a href="faqs/faqsfind.do?page=${pageBean.currPage-1}">上一页</a>&nbsp;
		<a href="faqs/faqsfind.do?page=${pageBean.totalPage}">下一页</a>&nbsp; 
		<a href="faqs/faqsfind.do?page=${pageBean.totalPage}">尾页</a>&nbsp;
		</c:when>
		<c:otherwise>
		<a href="faqs/faqsfind.do?page=1">首页</a>&nbsp;
		<a href="faqs/faqsfind.do?page=1">上一页</a>&nbsp;
		<a href="faqs/faqsfind.do?page=${pageBean.totalPage}">下一页</a>&nbsp; 
		<a href="faqs/faqsfind.do?page=${pageBean.totalPage}">尾页</a>&nbsp;
		</c:otherwise>
		</c:choose>
	</div>
  	
  
  	<br/>
  </center>
  </body>
</html>
