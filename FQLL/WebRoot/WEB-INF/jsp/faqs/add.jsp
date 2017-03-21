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
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="-1">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  	<center>
	 	<h2>添加</h2><br>
	 	<form action="faqs/addFaqs.do" method="post">
		 	<table>
		 		<tr><td>编号:</td><td><input id="id" name="id" type="text" value=""/></td></tr>
		 		<tr><td>标题:</td><td><input id="title" name="title" type="text" value=""/></td></tr>
		 		<tr><td>日期:</td><td><input id="createdate" name="createdate" type="text" value=""/></td></tr>
		 		<tr><td>内容:</td><td><input id="content" name="content" type="text" value=""/></td></tr>
		 		<tr><td>分类:</td>
		 			<td>
						<select name="cla.id">
						   <c:forEach items="${cla}" var="c">
						      <option value="${c.id}">${c.cname }</option>
						   </c:forEach>
						</select>  
					 </td>			
				</tr>
		 		<tr><td colspan="2" align="center"><input type="submit" value="确认"/></td></tr>
		 	</table>
	 	</form>
 	</center>
  </body>
</html>
