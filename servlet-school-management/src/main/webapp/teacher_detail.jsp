<%@page import="com.jsp.dto.Teacher"%>
<%@page import="com.jsp.service.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%TeacherService teacherService=new TeacherService(); %>
<%Teacher teacher=teacherService.getTeacherById(Integer.parseInt(request.getParameter("id"))); %>
<table border="2px">
<tr>
<th>ID</th>
<th>NAME</th>
<th>EMAIL</th>
<th>PASSWORD</th>
<th>UPDATE</th>
</tr>
<tr>
<td><%=teacher.getId()%></td>
<td><%=teacher.getName()%></td>
<td><%=teacher.getEmail()%></td>
<td><%=teacher.getPassword()%></td>
<td> <a href="updateTeacher.jsp?id=<%=teacher.getId()%>">update</a></td>
</tr>
</table>
</body>
</html>