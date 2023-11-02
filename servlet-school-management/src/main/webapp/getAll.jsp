<%@page import="com.jsp.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.TeacherService"%>
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
<%TeacherService teacherService=new TeacherService(); %>
<%List<Student> students= teacherService.getAllStudents(); %>
<table border="2px">
<tr>
<th>SID</th>
<th>Name</th>
<th>Email</th>
<th>Delete</th>
</tr>
<% for(Student s: students){ %>
<tr>
<td> <%=s.getId() %></td>
<td> <%=s.getName() %></td>
<td> <%=s.getEmail() %></td>
<%-- <td> <a href="deleteStudent.jsp?id=<%=s.getId()%>">delete</a></td> --%>
<td> <a href="studentdelete?id=<%=s.getId()%>">delete</a></td>
</tr>
<%}%>

</table>
</body>
</html>