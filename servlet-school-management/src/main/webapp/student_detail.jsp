<%@page import="com.jsp.dto.Student"%>
<%@page import="com.jsp.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%StudentService studentService=new StudentService(); %>
<%Student student=studentService.getStudentById(Integer.parseInt(request.getParameter("id"))); %>
<table border="2px">
<tr>
<th>ID</th>
<th>NAME</th>
<th>EMAIL</th>
<th>PASSWORD</th>
<th>UPDATE</th>
</tr>
<tr>
<td><%=student.getId()%></td>
<td><%=student.getName()%></td>
<td><%=student.getEmail()%></td>
<td><%=student.getPassword()%></td>
<td> <a href="updateStudent.jsp?id=<%=student.getId()%>">update</a></td>
</tr>
</table>
</body>
</html>