<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<head>
<base href="<%=basePath%>">

<title>课程编辑</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="-1">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is dept">
</head>
<body>
<center>
 	<h2>修改员工信息</h2><br>
 	<form action="emps/modifyEmps.do" method="post">
	 	<table>
	 		<tr><td>员工编号:</td><td><input id="id" name="id" type="text" value="${emps.id }" readonly="readonly"/></td></tr>
	 		<tr><td>员工名称:</td><td><input id="name" name="name" type="text" value="${emps.name }"/></td></tr>
	 		<tr><td>员工密码:</td><td><input id="password" name="password" type="text" value="${emps.password }"/></td></tr>
	 		<tr><td>部门:</td>
	 			<td>
					 <form:select path="emps.dept.deptno" 
					       items="${depts}" 
					       itemLabel="dname" 
					       itemValue="deptno" />  
				 </td>			
			</tr>
	 		<tr><td colspan="2" align="center"><input type="submit" value="确认"/></td></tr>
	 	</table>
 	</form>
 	</center>

</body>
</html>